package com.alev.dask.repository;

import com.alev.dask.domain.Text;

public interface TextRepository {
    Text findByName(String name);

    Text get(int id);

    Text save(Text processedText);
}
