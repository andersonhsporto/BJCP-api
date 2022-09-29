package dev.anderson.bjcp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.csv.CSVRecord;
import org.springframework.boot.autoconfigure.web.WebProperties.Resources.Chain.Strategy.Fixed;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StyleEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String code;

  private String category;

  private String style;

  private String family;

  private String history;

  private String origin;

  private float abvMin;
//
//  private Integer abvMax;
//
//  private Integer ibuMin;
//
//  private Integer ibuMax;
//
//  private Integer srmMin;
//
//  private Integer srmMax;

  public static StyleEntity fromCsv(CSVRecord csvRecord) {
    StyleEntity styleEntity = new StyleEntity(
        0L,
        csvRecord.get(0),
        csvRecord.get(1),
        csvRecord.get(2),
        csvRecord.get(3),
        csvRecord.get(4),
        csvRecord.get(5),
        Float.parseFloat(csvRecord.get(6)));
    return styleEntity;
  }
}
