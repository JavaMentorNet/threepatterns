package com.threepatterns.domain.operations;

import com.threepatterns.domain.Wizard;
import com.threepatterns.domain.WizardHistory;
import com.threepatterns.domain.forms.CreditCardInfoForm;
import com.threepatterns.domain.forms.DomesticIncidentForm;
import com.threepatterns.domain.forms.ForeignIncidentForm;
import com.threepatterns.domain.forms.IncidentInfoForm;

public abstract class FormOperation {
    protected Wizard wizard;
    protected WizardHistory wizardHistory;

    public FormOperation(Wizard wizard, WizardHistory wizardHistory) {
        this.wizard = wizard;
        this.wizardHistory = wizardHistory;
    }

    public abstract void doOperation(ForeignIncidentForm foreignIncidentForm);
    public abstract void doOperation(DomesticIncidentForm domesticIncidentForm);
    public abstract void doOperation(CreditCardInfoForm creditCardInfoForm);
    public abstract void doOperation(IncidentInfoForm incidentInfoForm);

    //36 more overloaded methods, one per form
}
