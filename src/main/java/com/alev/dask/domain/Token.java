package com.alev.dask.domain;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Token extends NamedEntity {
    private List<Text> texts;
    private List<Integer> pages;
    private List<Integer> lines;

    public Token(Integer id, String name, List<Text> texts, List<Integer> pages, List<Integer> lines) {
        super(id, name);
        this.texts = texts;
        this.pages = pages;
        this.lines = lines;
    }
}
