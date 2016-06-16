package com.alev.dask;

import com.alev.dask.domain.Text;
import com.alev.dask.service.TextService;
import com.alev.dask.to.TextTo;

public class AppController {
    public TextService textService;

    public Text findByName(String name) {
      return textService.findByName(name);
    }

    public Text get(int id) {
        return textService.get(id);
    }

    public void create(String fileName, String textName) {
        TextTo textTo = new TextTo();
        textTo.setName(textName == null || textName.isEmpty() ? fileName : textName);
        textService.create(fileName, textTo);
    }
}
