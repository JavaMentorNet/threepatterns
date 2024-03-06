package com.threepatterns.domain.states;

import com.threepatterns.domain.Wizard;
import com.threepatterns.domain.forms.DomesticIncidentForm;
import com.threepatterns.domain.forms.Form;
import com.threepatterns.service.BankService;

public class StateDomestic extends WizardState {
    @Override
    protected void doSubmitForm(Form form, Wizard wizard) {
        wizard.getSubmittedForms().add(form);
        wizard.setState(new StateCreditCard(new BankService()));
    }

    @Override
    public String supportsForm() {
        return DomesticIncidentForm.class.getSimpleName();
    }
}
