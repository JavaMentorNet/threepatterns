package com.threepatterns.domain.operations;

import com.threepatterns.domain.forms.CreditCardInfoForm;
import com.threepatterns.domain.forms.DomesticIncidentForm;
import com.threepatterns.domain.forms.ForeignIncidentForm;
import com.threepatterns.domain.forms.IncidentInfoForm;

public class ArchiveFormOperation implements FormOperation {
    public void doOperation(ForeignIncidentForm foreignIncidentForm) {
        //there is no state machine in archive operation and also there is no revert operation for archive thus we
        //don't have a wizard and memento here. Only simple archive operation which is not that relevant to state and
        // memento
    }
    public void doOperation(DomesticIncidentForm domesticIncidentForm) {
        //there is no state machine in archive operation and also there is no revert operation for archive thus we
        //don't have a wizard and memento here. Only simple archive operation which is not that relevant to state and
        // memento
    }
    public void doOperation(IncidentInfoForm incidentInfoForm) {
        //there is no state machine in archive operation and also there is no revert operation for archive thus we
        //don't have a wizard and memento here. Only simple archive operation which is not that relevant to state and
        // memento
    }
    public void doOperation(CreditCardInfoForm creditCardInfoForm) {
        //there is no state machine in archive operation and also there is no revert operation for archive thus we
        //don't have a wizard and memento here. Only simple archive operation which is not that relevant to state and
        // memento
    }
    //36 more overloaded methods, one per form
}
