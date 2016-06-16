package com.alev.dask.service;

import com.alev.dask.domain.Text;
import com.alev.dask.to.TextTo;
import com.alev.dask.util.NlpProcessingUtil;

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
    public Text create(String fileName, TextTo textTo) {
        Text indexing = NlpProcessingUtil.indexing(fileName, textTo);
        save(indexing);
        return indexing;
    }
}
