package dev.anderson.bjcp;

import dev.anderson.bjcp.services.CsvReader;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BjcpApiApplication {

  public static void main(String[] args) {
    SpringApplication.run(BjcpApiApplication.class, args);
  }

  @Bean
  CommandLineRunner updateDatabase(CsvReader csvReader) {
    return args -> {
      csvReader.read();
    };
  }

}
