package com.threepatterns.domain.operations;

import com.threepatterns.domain.forms.CreditCardInfoForm;
import com.threepatterns.domain.forms.DomesticIncidentForm;
import com.threepatterns.domain.forms.ForeignIncidentForm;
import com.threepatterns.domain.forms.IncidentInfoForm;

public interface FormOperation {
    void doOperation(ForeignIncidentForm foreignIncidentForm);
    void doOperation(DomesticIncidentForm domesticIncidentForm);
    void doOperation(CreditCardInfoForm creditCardInfoForm);
    void doOperation(IncidentInfoForm incidentInfoForm);

    //36 more overloaded methods, one per form
}
