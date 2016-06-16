package com.alev.dask.domain;

import java.util.List;

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    public List<Lexeme> getLexemes() {
        return lexemes;
    }

    public void setLexemes(List<Lexeme> lexemes) {
        this.lexemes = lexemes;
    }
}
