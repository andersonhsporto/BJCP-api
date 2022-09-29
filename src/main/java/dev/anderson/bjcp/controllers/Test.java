package dev.anderson.bjcp.controllers;

import dev.anderson.bjcp.services.CsvReader;
import java.io.IOException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/test")
public class Test {

  CsvReader csvReader;

  public Test(CsvReader csvReader) {
    this.csvReader = csvReader;
  }

  @GetMapping
  public void get() throws IOException {
    csvReader.read();
  }

}
