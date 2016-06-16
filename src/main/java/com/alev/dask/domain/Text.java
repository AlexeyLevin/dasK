package com.alev.dask.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Text extends NamedEntity {
    private String content;
    private List<Lexeme> lexemes;

    public Text() {
    }

    public Text(Integer id, String name, String content, List<Lexeme> lexemes) {
        super(id, name);
        this.content = content;
        this.lexemes = lexemes;
    }
}
