package com.threepatterns.domain.states;

import com.threepatterns.domain.Wizard;
import com.threepatterns.domain.forms.Form;

public abstract class WizardState {
    protected abstract void doSubmitForm(Form form, Wizard wizard);
    public void submitForm(Form form, Wizard wizard) {
        if (!form.getClass().getSimpleName().equals(supportsForm())) {
            throw new RuntimeException("Form " + form.getClass().getSimpleName()
                    + "is not supported in the state" + this.getClass().getSimpleName());
        }
        doSubmitForm(form, wizard);
    }

    public abstract String supportsForm();
}
