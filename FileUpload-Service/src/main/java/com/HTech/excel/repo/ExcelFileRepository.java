package com.HTech.excel.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.HTech.excel.model.ExcelFile;

public interface ExcelFileRepository extends MongoRepository<ExcelFile, Long> {
}