package com.alev.dask.service;

import com.alev.dask.domain.Text;
import com.alev.dask.to.TextTo;
import com.alev.dask.util.NlpUtil;

import java.nio.charset.Charset;

public class SimpleTextService implements TextService {
    @Override
    public Text findByName(String name) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Text get(int id) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void save(Text processedText) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Text create(String fileName, TextTo textTo, Charset charset) {
        Text indexing = NlpUtil.indexing(fileName, textTo, charset);
        save(indexing);
        return indexing;
    }
}
