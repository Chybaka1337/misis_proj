package ru.misis.webgame.controller.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.misis.webgame.entity.Word;
import ru.misis.webgame.service.WordService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/hangman/words")
public class WordController {

    private final WordService wordService;

    @GetMapping
    public ResponseEntity<List<Word>> getWordsByThemeId(@RequestParam("themeId") Long id) {
        return ResponseEntity.ok(wordService.findByThemeId(id));
    }
}
