package com.edganevich.btg.btgDiag.entities;

public enum ObjectTitle {
    ABSORBER("Абсорбер"),
    AVO ("АВО Газа"),
    AVOTT ("ТТ АВО"),
    AVTOKRAN("Автомобильный кран"),
    AGNKS("АГНКС"),
    ABK("Административно-бытовой корпус"),
    ABZ("Админисктративно-бытовое здание"),
    ACCUM("Аккумулятор");


    private final String title;

    ObjectTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    }
