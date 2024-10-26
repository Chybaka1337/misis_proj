package ru.misis.webgame.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.misis.webgame.entity.Theme;
import ru.misis.webgame.repository.ThemeRepository;
import ru.misis.webgame.service.ThemeService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ThemeServiceImpl implements ThemeService {

    private final ThemeRepository themeRepository;

    @Override
    public List<Theme> findAll() {
        return themeRepository.findAll();
    }
}
