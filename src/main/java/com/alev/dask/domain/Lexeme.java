package com.alev.dask.domain;

import java.util.List;

public class Lexeme extends BaseEntity {
    private List<Text> texts;
    private String value;
    private List<Integer> pages;
    private List<Integer> lines;

    public Lexeme() {
    }

    public List<Text> getTexts() {
        return texts;
    }

    public void setTexts(List<Text> texts) {
        this.texts = texts;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public List<Integer> getPages() {
        return pages;
    }

    public void setPages(List<Integer> pages) {
        this.pages = pages;
    }

    public List<Integer> getLines() {
        return lines;
    }

    public void setLines(List<Integer> lines) {
        this.lines = lines;
    }
}
