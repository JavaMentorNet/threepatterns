package com.threepatterns.domain.operations;

import com.threepatterns.domain.Wizard;
import com.threepatterns.domain.WizardHistory;
import com.threepatterns.domain.forms.CreditCardInfoForm;
import com.threepatterns.domain.forms.DomesticIncidentForm;
import com.threepatterns.domain.forms.ForeignIncidentForm;
import com.threepatterns.domain.forms.IncidentInfoForm;

public class SubmitFormOperation implements FormOperation {
    private Wizard wizard;
    private WizardHistory wizardHistory;

    public SubmitFormOperation(Wizard wizard, WizardHistory wizardHistory) {
        this.wizard = wizard;
        this.wizardHistory = wizardHistory;
    }

    public void doOperation(ForeignIncidentForm foreignIncidentForm) {
        wizardHistory.addMemento(wizard.createMemento());
        wizard.submitForm(foreignIncidentForm);
    }
    public void doOperation(DomesticIncidentForm domesticIncidentForm) {
        wizardHistory.addMemento(wizard.createMemento());
        wizard.submitForm(domesticIncidentForm);
    }
    public void doOperation(IncidentInfoForm incidentInfoForm) {
        wizardHistory.addMemento(wizard.createMemento());
        wizard.submitForm(incidentInfoForm);
    }
    public void doOperation(CreditCardInfoForm creditCardInfoForm) {
        wizardHistory.addMemento(wizard.createMemento());
        wizard.submitForm(creditCardInfoForm);
    }
    //36 more overloaded methods, one per form
}
