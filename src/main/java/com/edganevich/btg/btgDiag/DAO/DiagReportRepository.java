package com.edganevich.btg.btgDiag.DAO;

import java.util.*;
import com.edganevich.btg.btgDiag.entities.DiagReport;
import com.edganevich.btg.btgDiag.entities.Equipment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiagReportRepository extends JpaRepository<DiagReport, Integer> {

    List<DiagReport> findDiagReportByEquipment (Equipment equipment);
}
