package com.edganevich.btg.btgDiag.entities;

public enum Department {
    LES ("Служба ЛЭС"),
    GRS ("Служба ГРС"),
    GKS ("Служба ГКС"),
    SS("Служба Связи");

    private final String title;

    Department(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
