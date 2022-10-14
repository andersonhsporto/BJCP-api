package dev.anderson.bjcp.models.dto;

import dev.anderson.bjcp.models.entities.StyleEntity;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public record StyleDto(
    String code,
    String category,
    String style,
    String family,
    String history,
    String origin,
    BigDecimal abvMin
) {

  public static StyleDto fromEntity(StyleEntity styleEntity) {
    return new StyleDto(
        styleEntity.getCode(),
        styleEntity.getCategory(),
        styleEntity.getStyle(),
        styleEntity.getFamily(),
        styleEntity.getHistory(),
        styleEntity.getOrigin(),
        truncate(styleEntity.getAbvMin()));
  }

  public static List<StyleDto> listFrom(List<StyleEntity> entities) {
    return entities.stream().map(StyleDto::fromEntity).toList();
  }

  // Truncate value to 2 decimal places
  private static BigDecimal truncate(double value) {
    return new BigDecimal(value).setScale(2, RoundingMode.HALF_UP);
  }

}
