package com.threepatterns.domain.states;

import com.threepatterns.domain.Wizard;
import com.threepatterns.domain.forms.CreditCardInfoForm;
import com.threepatterns.domain.forms.Form;
import com.threepatterns.service.BankService;

public class StateCreditCard extends WizardState {
    private int wrongCount = 0;
    private final BankService bankService;

    public StateCreditCard(BankService bankService) {
        this.bankService = bankService;
    }

    @Override
    protected void doSubmitForm(Form form, Wizard wizard) {
        CreditCardInfoForm f = (CreditCardInfoForm) form;
        if (bankService.isCreditCardIdValid(f.getCreditCardId())) {
            wizard.getSubmittedForms().add(form);
        } else {
            wrongCount++;
            if (wrongCount >= 3) {
                wizard.setState(new StateIncidentInfo());
            }
            throw new IllegalArgumentException("Credit card info incorrect!");
        }

    }

    @Override
    public String supportsForm() {
        return CreditCardInfoForm.class.getSimpleName();
    }
}
