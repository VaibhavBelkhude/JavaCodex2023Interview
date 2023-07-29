package com.HTech.excel.helper;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

import com.HTech.excel.model.ExcelFile;

public class ExcelHelper {
  public static String TYPE = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
  static String[] HEADERs = { "Id", "Title", "Description", "Published" };
  static String SHEET = "ExcelFile";

  public static boolean hasExcelFormat(MultipartFile file) {

    if (!TYPE.equals(file.getContentType())) {
      return false;
    }

    return true;
  }

  public static ByteArrayInputStream ExcelFileToExcel(List<ExcelFile> excelFile) {

    try (Workbook workbook = new XSSFWorkbook(); ByteArrayOutputStream out = new ByteArrayOutputStream();) {
      Sheet sheet = workbook.createSheet(SHEET);

      // Header
      Row headerRow = sheet.createRow(0);

      for (int col = 0; col < HEADERs.length; col++) {
        Cell cell = headerRow.createCell(col);
        cell.setCellValue(HEADERs[col]);
      }

      int rowIdx = 1;
      for (ExcelFile excelFiles : excelFile) {
        Row row = sheet.createRow(rowIdx++);

        row.createCell(0).setCellValue(excelFiles.getId());
        row.createCell(1).setCellValue(excelFiles.getTitle());
        row.createCell(2).setCellValue(excelFiles.getDescription());
        row.createCell(3).setCellValue(excelFiles.isPublished());
      }

      workbook.write(out);
      return new ByteArrayInputStream(out.toByteArray());
    } catch (IOException e) {
      throw new RuntimeException("fail to import data to Excel file: " + e.getMessage());
    }
  }

  public static List<ExcelFile> excelToTutorials(InputStream is) {
    try {
      Workbook workbook = new XSSFWorkbook(is);

      Sheet sheet = workbook.getSheet(SHEET);
      Iterator<Row> rows = sheet.iterator();

      List<ExcelFile> excelFilestest = new ArrayList<ExcelFile>();

      int rowNumber = 0;
      while (rows.hasNext()) {
        Row currentRow = rows.next();

        // skip header
        if (rowNumber == 0) {
          rowNumber++;
          continue;
        }

        Iterator<Cell> cellsInRow = currentRow.iterator();

        ExcelFile excelFilecheck = new ExcelFile();

        int cellIdx = 0;
        while (cellsInRow.hasNext()) {
          Cell currentCell = cellsInRow.next();

          switch (cellIdx) {
          case 0:
        	  excelFilecheck.setId((long) currentCell.getNumericCellValue());
            break;

          case 1:
        	  excelFilecheck.setTitle(currentCell.getStringCellValue());
            break;

          case 2:
        	  excelFilecheck.setDescription(currentCell.getStringCellValue());
            break;

          case 3:
        	  excelFilecheck.setPublished(currentCell.getBooleanCellValue());
            break;

          default:
            break;
          }

          cellIdx++;
        }

        excelFilestest.add(excelFilecheck);
      }

      workbook.close();

      return excelFilestest;
    } catch (IOException e) {
      throw new RuntimeException("fail to parse Excel file: " + e.getMessage());
    }
  }
}