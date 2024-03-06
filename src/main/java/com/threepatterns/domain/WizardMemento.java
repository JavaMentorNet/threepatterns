package com.threepatterns.domain;

import java.time.LocalDate;

public class WizardMemento {
    private String content;

    private LocalDate date;
    private String changeAuthorId;

    public WizardMemento(String content) {
        this.content = content;
        this.date = LocalDate.now();
        this.changeAuthorId = "Spasoje";
    }

    public LocalDate getDate() {
        return date;
    }

    public String getChangeAuthorId() {
        return changeAuthorId;
    }
}
