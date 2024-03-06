package com.threepatterns.service;

import com.threepatterns.domain.forms.Form;
import com.threepatterns.domain.operations.ArchiveFormOperation;
import com.threepatterns.domain.operations.SubmitFormOperation;

public class FormFacade {
    private SubmitFormOperation submitFormOperation;
    private ArchiveFormOperation archiveFormOperation;

    public void submit(Form form) {
        form.doOperation(submitFormOperation);
    }
    public void archive(Form form) {
        form.doOperation(archiveFormOperation);
    }

}
