package com.edganevich.btg.btgDiag.entities;

public enum TypeOfDiagnostic {

    UZT ("Толщинометрия"),
    TO ("ТО"),
    AEC("Акустическая эмиссия"),
    TD ("ТД");

    private final String title;

    TypeOfDiagnostic(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }


}
