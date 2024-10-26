package ru.misis.webgame.service;

import ru.misis.webgame.entity.Word;

import java.util.List;

public interface WordService {

    List<Word> findByThemeId(Long id);
}
