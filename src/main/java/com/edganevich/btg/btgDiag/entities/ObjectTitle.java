package com.edganevich.btg.btgDiag.entities;

public enum ObjectTitle {
    ABK("Административно-бытовой корпус"),
    ABSORBER("Абсорбер"),
    ABZ("Административно-бытовое здание"),
    ACCUM("Аккумулятор"),
    AGNKS("АГНКС"),
    AVO("АВО Газа"),
    AVOTT("ТТ АВО"),
    AVTOKRAN("Автомобильный кран");


    private final String rusTitle;

    ObjectTitle(String rusTitle) {
        this.rusTitle = rusTitle;
    }

    public String getTitle() {
        return rusTitle;
    }

}
