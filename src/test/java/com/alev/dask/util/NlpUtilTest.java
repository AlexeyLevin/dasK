package com.alev.dask.util;

import com.alev.dask.to.TextTo;
import org.junit.Test;

import java.nio.charset.Charset;

import static org.junit.Assert.*;

public class NlpUtilTest {
    @Test
    public void testIndexing() {
        NlpUtil.indexing("C:\\\\test\\text.txt", new TextTo(), Charset.forName("UTF-8"));
    }

    @Test
    public void testResetNlpData() {

    }
}