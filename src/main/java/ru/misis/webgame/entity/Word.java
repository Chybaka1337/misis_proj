package ru.misis.webgame.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Word {

    @Id
    private Long id;

    @Column(name = "word")
    private String word;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "words")
    @JsonBackReference
    private Set<Theme> themes = new HashSet<>();

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Word word1)) return false;
        return Objects.equals(word, word1.word);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(word);
    }
}
