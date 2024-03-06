package com.threepatterns.domain.states;

import com.threepatterns.domain.Wizard;
import com.threepatterns.domain.forms.ForeignIncidentForm;
import com.threepatterns.domain.forms.Form;
import com.threepatterns.service.BankService;
import com.threepatterns.service.KafkaProducer;

public class StateForeign extends WizardState {

    private final KafkaProducer kafkaProducer;

    public StateForeign(KafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @Override
    protected void doSubmitForm(Form form, Wizard wizard) {
        wizard.getSubmittedForms().add(form);
        kafkaProducer.sendMessage("//Properly formatted message","InternationalPoliceTopic");
        wizard.setState(new StateCreditCard(new BankService()));
    }

    @Override
    public String supportsForm() {
        return ForeignIncidentForm.class.getSimpleName();
    }
}
