package com.edganevich.btg.btgDiag.Service;

import java.util.*;
import com.edganevich.btg.btgDiag.DAO.EquipmentRepository;
import com.edganevich.btg.btgDiag.entities.DiagReport;
import com.edganevich.btg.btgDiag.entities.Equipment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EquipmentService {

    @Autowired
    EquipmentRepository equipmentRepository;

    @Autowired
    DiagReportService diagReportService;

    public List<Equipment> getAllEquipment(){
        List<Equipment> allEquipments = equipmentRepository.findAll();
        return equipmentRepository.findAll();
    }

    public Equipment findEquipmentById(Integer id){
     return   equipmentRepository.findEquipmentById(id);
    }


    public void save(Equipment equipment) {
        equipmentRepository.save(equipment);
    }

    public void updateDiagDateIfItNecessary(DiagReport report) {
    Equipment equipment = equipmentRepository.getById(report.getEquipment().getId());
    if (equipment.getNextDiagDate()==null || equipment.getNextDiagDate().after(report.getNextDiagDate())) {
        equipment.setNextDiagDate(report.getNextDiagDate());
    equipmentRepository.save(equipment);
        }
    }


}
