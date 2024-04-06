package com.edganevich.btg.btgDiag.Service;

import com.edganevich.btg.btgDiag.DAO.DiagReportRepository;
import com.edganevich.btg.btgDiag.entities.DiagReport;
import com.edganevich.btg.btgDiag.entities.Equipment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class DiagReportService {

    @Autowired
    DiagReportRepository diagReportRepository;

    public List<DiagReport> findDiagReportByEquipment(Equipment equipment){
        List<DiagReport> reportList = diagReportRepository.findDiagReportByEquipment(equipment);
        return reportList;
    }

    public DiagReport findReportById(Integer id) {
       DiagReport diagReport = diagReportRepository.getById(id);
       return diagReport;

    }


    public void save(DiagReport report) {
    diagReportRepository.save(report);
    }
}
