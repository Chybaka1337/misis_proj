package ru.misis.webgame.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.misis.webgame.entity.Word;

import java.util.List;

@Repository
public interface WordRepository extends JpaRepository<Word, Long> {

    @Query(value = "select w.id, w.word from word as w join theme_word as tw on tw.word_id = w.id where tw.theme_id = ?1",
            nativeQuery = true)
    List<Word> findAllByThemeId(Long id);
}
