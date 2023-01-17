package dev.anderson.bjcp.controllers;

import dev.anderson.bjcp.models.dto.StyleDto;
import dev.anderson.bjcp.services.StyleService;
import java.util.List;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
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

  @GetMapping("/jwt")
  String jwt(@AuthenticationPrincipal Jwt jwt) {
    return String.format("""
				Principal: %s\n
				Email attribute: %s\n
				JWT: %s\n
				""", jwt.getClaims(), jwt.getClaim("email"), jwt.getTokenValue());
  }
}
