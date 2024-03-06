package com.threepatterns.domain.forms;

import com.threepatterns.domain.operations.FormOperation;

public class IncidentInfoForm implements Form {
    boolean foreign;

    public IncidentInfoForm(boolean foreign) {
        this.foreign = foreign;
    }

    public boolean isForeign() {
        return foreign;
    }

    @Override
    public void doOperation(FormOperation formOperation) {
        formOperation.doOperation(this);
    }
}
