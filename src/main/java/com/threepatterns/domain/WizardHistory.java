package com.threepatterns.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class WizardHistory {
    private List<WizardMemento> mementos = new ArrayList<>();

    public void addMemento(WizardMemento personMemento) {
        this.mementos.add(personMemento);
    }

    public WizardMemento getStateOnDay(LocalDate date) {
        return this.mementos
                .stream()
                .filter(personMemento -> personMemento.getDate().isBefore(date))
                .sorted(Comparator.comparing(WizardMemento::getDate)).toList()
                .getLast();
    }

    public WizardMemento getLastState() {
        return this.mementos
                .stream()
                .sorted(Comparator.comparing(WizardMemento::getDate)).toList()
                .getLast();
    }
}
