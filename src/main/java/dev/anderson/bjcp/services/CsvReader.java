package dev.anderson.bjcp.services;

import dev.anderson.bjcp.models.entities.StyleEntity;
import dev.anderson.bjcp.repositories.StyleRepository;
import java.io.FileReader;
import java.io.IOException;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

@Service
public class CsvReader {

  private final StyleRepository styleRepository;

  @Autowired
  public CsvReader(StyleRepository styleRepository) {
    this.styleRepository = styleRepository;
  }

  public void read() throws IOException {
    var csvData = new ClassPathResource("BJCP-csv/0-csv/2015_Guidelines_numbers_OK.csv").getFile();
    var parser = new CSVParser(new FileReader(csvData), CSVFormat.EXCEL);

    for (CSVRecord csvRecord : parser) {
      if (csvRecord.getRecordNumber() > 1 && csvRecord.getRecordNumber() < 122) {
        var styleEntity = StyleEntity.fromCsv(csvRecord);

        styleRepository.save(styleEntity);
      }
    }

  }

}
