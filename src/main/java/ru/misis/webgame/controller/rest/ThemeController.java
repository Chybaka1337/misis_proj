package ru.misis.webgame.controller.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.misis.webgame.entity.Theme;
import ru.misis.webgame.service.ThemeService;

import java.util.List;

@RestController
@RequestMapping("/api/hangman/theme")
@RequiredArgsConstructor
public class ThemeController {

    private final ThemeService themeService;

    @GetMapping
    public ResponseEntity<List<Theme>> getThemes() {
        return ResponseEntity.ok(themeService.findAll());
    }
}
