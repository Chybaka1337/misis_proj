package ru.misis.webgame.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hangman")
public class HangmanController {

    @GetMapping
    public String getHangManPage() {
        return "hangman";
    }
}
