package com.threepatterns.domain.states;

import com.threepatterns.domain.Wizard;
import com.threepatterns.domain.forms.Form;
import com.threepatterns.domain.forms.IncidentInfoForm;
import com.threepatterns.service.KafkaProducer;

public class StateIncidentInfo extends WizardState {

    @Override
    protected void doSubmitForm(Form form, Wizard wizard) {
        wizard.getSubmittedForms().add(form);
        IncidentInfoForm incidentInfoForm = (IncidentInfoForm) form;
        if (incidentInfoForm.isForeign()) {
            wizard.setState(new StateForeign(new KafkaProducer()));
        } else {
            wizard.setState(new StateDomestic());
        }

    }

    @Override
    public String supportsForm() {
        return IncidentInfoForm.class.getSimpleName();
    }
}
