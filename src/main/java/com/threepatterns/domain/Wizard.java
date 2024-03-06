package com.threepatterns.domain;

import com.threepatterns.domain.forms.Form;
import com.threepatterns.domain.operations.SubmitFormOperation;
import com.threepatterns.domain.states.StateIncidentInfo;
import com.threepatterns.domain.states.WizardState;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Wizard {
    private WizardState state = new StateIncidentInfo();
    private final Set<Form> submittedForms = new HashSet<>();

    public void submitForm(Form form) {
        state.submitForm(form, this);
    }

    public String getNextForm() {
        return state.supportsForm();
    }
    public Set<Form> getSubmittedForms() {
        return submittedForms;
    }

    public void setState(WizardState state) {
        this.state = state;
    }

    public WizardMemento createMemento() {
        //returns txt json representation of the Wizard object
        return new WizardMemento(
                submittedForms.stream()
                        .map(form -> form.getClass().getSimpleName())
                        .collect(Collectors.joining(",")));
    }
}
