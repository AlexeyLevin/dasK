package com.alev.dask.util;

import com.alev.dask.domain.Text;
import com.alev.dask.to.TextTo;
import io.aif.language.common.IDict;
import io.aif.language.common.IDictBuilder;
import io.aif.language.token.comparator.ITokenComparator;
import io.aif.language.word.dict.DictBuilder;

import java.util.LinkedList;
import java.util.List;

public class NlpUtil {

    public static Text indexing(String fileName, TextTo textTo) {
        final List<String> tokens = new LinkedList<>();

        final ITokenComparator tokenComparator = ITokenComparator.defaultComparator();
        final ISetComparator setComparator = ISetComparator.createDefaultInstance(tokenComparator);

        final IDictBuilder dictBuilder = new DictBuilder(setComparator, tokenComparator);
        final IDict dict = dictBuilder.build(tokens);

        Text text = TextTo.fromTo(textTo);
        if (true) {
            throw new UnsupportedOperationException();
        }
        return text;
    }

}
