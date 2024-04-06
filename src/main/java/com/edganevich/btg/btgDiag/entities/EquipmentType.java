package com.edganevich.btg.btgDiag.entities;


public enum EquipmentType {
        SRPD("СРПД"),
        USB("УСБ"),
        AVO("АВО"),
        KOTEL ("Котел"),
        GAZEQUIPMENT ("Газовое оборудование");

private final String title;

    EquipmentType(String title) {
        this.title = title;
        }

    public String getTitle() {
        return title;
        }

}
