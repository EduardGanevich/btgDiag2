package com.edganevich.btg.btgDiag.entities;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "diag_reports")
@Data
@NoArgsConstructor
public class DiagReport {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "date_of_report")
    private Date dateOfReport;

    @Column(name = "number_of_report")
    private String numberOfReport;

    @Column(name = "report_file_name")
    private String reportFileName;

    @Enumerated(EnumType.STRING)
    @Column(name = "type_of_diagnostic")
    private TypeOfDiagnostic typeOfDiagnostic;

    @Column(name = "life_resource_by_report")
    private Integer lifeResourceByReport;

    @Column(name = "next_diag_date")
    private Date nextDiagDate;

    @OneToOne
    @JoinColumn(name="diagcompany_id", nullable=false)
    private DiagCompany diagCompany;

    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name="equipment_id", nullable=false)
    private Equipment equipment;


}
