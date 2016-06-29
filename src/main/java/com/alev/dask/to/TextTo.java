package com.alev.dask.to;

import com.alev.dask.domain.Token;
import com.alev.dask.domain.Text;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class TextTo {
    private Integer id = null;
    private String name = null;
    private String content = null;
    private List<Token> tokens = null;

    public static Text fromTo(TextTo textTo) {
        Text text = new Text();
        text.setId(textTo.getId());
        text.setName(textTo.getName());
        text.setContent(textTo.getContent());
        text.setTokens(textTo.getTokens());
        return text;
    }
}
