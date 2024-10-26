package ru.misis.webgame.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class Theme {

    @Id
    private Long id;

    @Column(name = "theme")
    private String theme;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "theme_word",
            joinColumns = @JoinColumn(name = "theme_id"),
            inverseJoinColumns = @JoinColumn(name = "word_id"))
    @JsonManagedReference
    private Set<Word> words = new HashSet<>();

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Theme theme1)) return false;
        return Objects.equals(theme, theme1.theme);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(theme);
    }
}
