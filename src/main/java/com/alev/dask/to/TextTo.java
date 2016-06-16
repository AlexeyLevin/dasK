package com.alev.dask.to;

import com.alev.dask.domain.Lexeme;
import com.alev.dask.domain.Text;

import java.util.List;

public class TextTo {
    private Integer id = null;
    private String name = null;
    private String content = null;
    private List<Lexeme> lexemes = null;

    public TextTo() {
    }

    public static Text fromTo(TextTo textTo) {
        Text text = new Text();
        text.setId(textTo.getId());
        text.setName(textTo.getName());
        text.setContent(textTo.getContent());
        text.setLexemes(textTo.getLexemes());
        return text;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
