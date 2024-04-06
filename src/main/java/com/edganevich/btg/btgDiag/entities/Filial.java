package com.edganevich.btg.btgDiag.entities;

public enum Filial {
    ORSHA ("Оршанское УМГ"),
    KRUPKI ("Крупское УМГ"),
    MINSK ("Минское УМГ"),
    NESVIZH ("Несвижское УМГ"),
    SLONIM ("Слонимское УМГ"),
    KOBRIN ("Кобринское УМГ"),
    OSIPOVICHI ("Осиповичское УМГ"),
    GOMEL ("Гомельское УМГ"),
    ITC ("ИТЦ");

    private final String title;

    Filial(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }


}
