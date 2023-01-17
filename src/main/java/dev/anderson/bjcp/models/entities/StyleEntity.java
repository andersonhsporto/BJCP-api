package dev.anderson.bjcp.models.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.csv.CSVRecord;

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

  private Float abvMin;

  private Float abvMax;

  private Integer ibuMin;

  private Integer ibuMax;

  private Float srmMin;

  private Float srmMax;

  public static StyleEntity fromCsv(CSVRecord csvRecord) {
    StyleEntity styleEntity = new StyleEntity(
        0L,
        csvRecord.get(0),
        csvRecord.get(1),
        csvRecord.get(2),
        csvRecord.get(3),
        csvRecord.get(4),
        csvRecord.get(5),
        Float.parseFloat(csvRecord.get(6)),
        Float.parseFloat(csvRecord.get(7)),
        Integer.parseInt(csvRecord.get(8)),
        Integer.parseInt(csvRecord.get(9)),
        Float.parseFloat(csvRecord.get(10)),
        Float.parseFloat(csvRecord.get(11))
    );
    return styleEntity;
  }
}
