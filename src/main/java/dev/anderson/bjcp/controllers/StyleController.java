package dev.anderson.bjcp.controllers;

import dev.anderson.bjcp.models.dto.StyleDto;
import dev.anderson.bjcp.services.StyleService;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/styles")
public record StyleController(StyleService styleService) {

  @GetMapping
  public List<StyleDto> getAll() {
    return styleService.getAllStyles();
  }

}
