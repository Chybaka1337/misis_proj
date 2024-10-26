package ru.misis.webgame.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.misis.webgame.entity.Word;
import ru.misis.webgame.repository.WordRepository;
import ru.misis.webgame.service.WordService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class WordServiceImpl implements WordService {

    private final WordRepository wordRepository;

    @Override
    public List<Word> findByThemeId(Long id) {
        return wordRepository.findAllByThemeId(id);
    }
}
