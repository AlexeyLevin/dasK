package com.alev.dask.domain;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Text extends NamedEntity {
    private String content;
    private List<String> sentences;
    private List<String> words;
    private List<Token> tokens;

    public Text(Integer id, String name) {
        super(id, name);
    }
}
