package com.threepatterns.domain.forms;

import com.threepatterns.domain.operations.FormOperation;

public class ForeignIncidentForm implements Form {
    @Override
    public void doOperation(FormOperation formOperation) {
        formOperation.doOperation(this);
    }
}
