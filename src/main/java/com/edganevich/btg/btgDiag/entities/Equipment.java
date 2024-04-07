package com.edganevich.btg.btgDiag.entities;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.*;
import javax.persistence.*;

@Entity
@Table(name = "equipments")
@Data
@NoArgsConstructor
public class Equipment {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column(name = "filial")
    private Filial filial;

    @Enumerated(EnumType.STRING)
    @Column(name = "equipment_type")
    private EquipmentType equipmentType;

    @Enumerated(EnumType.STRING)
    @Column(name = "department")
    private Department department;

    @Column(name = "place_of_Install")
    private String placeOfInstall;

    @Enumerated(EnumType.STRING)
    @Column(name = "object_title")
    private ObjectTitle objectTitle;

    @Column(name = "object_title_number")
    private String objectTitleNumber;

    @Column(name = "serial_number")
    private String serialNumber;

    @Column(name = "inv_number")
    private String invNumber;

    @Column(name = "reg_number")
    private String regNumber;

    @Column(name = "date_of_start_expl")
    @DateTimeFormat(pattern = "yyyy")
    private Date dateOfStartExpl;

    @Column(name = "life_resource")
    private Integer lifeResource;

    @Enumerated(EnumType.STRING)
    @Column(name = "next_diag_type")
    private TypeOfDiagnostic typeOfDiagnostic;

    @Column(name = "next_diag_date")
    private Date nextDiagDate;

    @Column(name = "is_passport")
    private Boolean isPassport;

    @Column(name = "equipment_producer")
    private String equipmentProducer;

    @OneToMany(mappedBy="equipment")
    private List<DiagReport> reportList;

    // Only for SRPD

    @Column(name = "diameter")
    private Double diameter;

    @Column(name = "length")
    private Double length;

    @Column(name = "volume")
    private Double volume;

    @Column(name = "work_pressure")
    private Double workPressure;

    @Column(name = "pipes_quantity")
    private Integer pipesQuantity;

    @Column(name = "is_underground")
    private Boolean isUnderGround;

}
