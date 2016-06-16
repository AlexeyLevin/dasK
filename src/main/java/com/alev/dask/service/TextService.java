package com.alev.dask.service;

import com.alev.dask.domain.Text;
import com.alev.dask.to.TextTo;

public interface TextService {
    Text findByName(String name);

    Text get(int id);

    void save(Text processedText);

    Text create(String fileName, TextTo textTo);
}
