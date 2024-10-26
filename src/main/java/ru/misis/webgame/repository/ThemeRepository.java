package ru.misis.webgame.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.misis.webgame.entity.Theme;

@Repository
public interface ThemeRepository extends JpaRepository<Theme, Long> {

}
