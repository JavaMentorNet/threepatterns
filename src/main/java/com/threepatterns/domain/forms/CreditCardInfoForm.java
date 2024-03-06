package com.threepatterns.domain.forms;

import com.threepatterns.domain.operations.FormOperation;

public class CreditCardInfoForm implements Form {
    String creditCardId;

    public String getCreditCardId() {
        return creditCardId;
    }

    @Override
    public void doOperation(FormOperation formOperation) {
        formOperation.doOperation(this);
    }
}
