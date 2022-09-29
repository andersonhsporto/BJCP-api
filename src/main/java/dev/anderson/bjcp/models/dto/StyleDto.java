package dev.anderson.bjcp.models.dto;

import dev.anderson.bjcp.models.entities.StyleEntity;
import java.util.List;

public record StyleDto(String code, String category, String style) {

  public static StyleDto fromEntity(StyleEntity styleEntity) {
    return new StyleDto(styleEntity.getCode(), styleEntity.getCategory(), styleEntity.getStyle());
  }

  public static List<StyleDto> listFrom(List<StyleEntity> entities) {
    return entities.stream().map(StyleDto::fromEntity).toList();
  }

}
