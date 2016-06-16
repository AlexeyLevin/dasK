package com.alev.dask.to;

import com.alev.dask.domain.Lexeme;
import com.alev.dask.domain.Text;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
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
}
