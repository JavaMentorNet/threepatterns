package com.threepatterns;

import com.threepatterns.domain.Wizard;
import com.threepatterns.domain.WizardHistory;
import com.threepatterns.domain.forms.CreditCardInfoForm;
import com.threepatterns.domain.forms.ForeignIncidentForm;
import com.threepatterns.domain.forms.Form;
import com.threepatterns.domain.forms.IncidentInfoForm;
import com.threepatterns.domain.operations.SubmitFormOperation;

public class ThreePatterns {

	public static void main(String[] args) {
		Form form = new IncidentInfoForm(true);
		Wizard wizard = new Wizard();
		WizardHistory wizardHistory = new WizardHistory();
		SubmitFormOperation submitFormOperation = new SubmitFormOperation(wizard, wizardHistory);
		form.doOperation(submitFormOperation);
		Form form2 = new ForeignIncidentForm();
		form2.doOperation(submitFormOperation);
		Form form3 = new CreditCardInfoForm();
		form3.doOperation(submitFormOperation);
		System.out.println("Stop here with the debugger.");

	}

}
