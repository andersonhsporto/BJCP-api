package dev.anderson.bjcp.services.implementation;

import dev.anderson.bjcp.models.dto.StyleDto;
import dev.anderson.bjcp.repositories.StyleRepository;
import dev.anderson.bjcp.services.StyleService;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public record StyleImplementation(StyleRepository repository) implements StyleService {

  @Override
  public List<StyleDto> getAllStyles() {
    var style = repository.findAll();

    return StyleDto.listFrom(style);
  }
}
