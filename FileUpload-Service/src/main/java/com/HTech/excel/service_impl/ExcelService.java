package com.HTech.excel.service_impl;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.HTech.excel.helper.ExcelHelper;
import com.HTech.excel.model.ExcelFile;
import com.HTech.excel.repo.ExcelFileRepository;

@Service
public class ExcelService {
  @Autowired
  ExcelFileRepository repository;

  public void save(MultipartFile file) {
    try {
      List<ExcelFile> excelFile = ExcelHelper.excelToTutorials(file.getInputStream());
      repository.saveAll(excelFile);
    } catch (IOException e) {
      throw new RuntimeException("fail to store excel data: " + e.getMessage());
    }
  }

  public ByteArrayInputStream load() {
    List<ExcelFile> excelFile = repository.findAll();

    ByteArrayInputStream in = ExcelHelper.ExcelFileToExcel(excelFile);
    return in;
  }

  public List<ExcelFile> getAllExcelFiles() {
    return repository.findAll();
  }
}