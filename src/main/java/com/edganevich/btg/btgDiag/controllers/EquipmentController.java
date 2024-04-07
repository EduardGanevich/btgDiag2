package com.edganevich.btg.btgDiag.controllers;

import com.edganevich.btg.btgDiag.Service.DiagCompanyService;
import com.edganevich.btg.btgDiag.Service.DiagReportService;
import com.edganevich.btg.btgDiag.Service.EquipmentService;
import com.edganevich.btg.btgDiag.entities.DiagCompany;
import com.edganevich.btg.btgDiag.entities.DiagReport;
import com.edganevich.btg.btgDiag.entities.Equipment;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class EquipmentController {

    @Autowired
    private EquipmentService equipmentService;

    @Autowired
    private DiagReportService diagReportService;

    @Autowired
    private DiagCompanyService diagCompanyService;

    @GetMapping("/Allequip")
    public String getAll(Model model) {
        List<Equipment> allEquipments = equipmentService.getAllEquipment();
        model.addAttribute("equipments", allEquipments);
        return "all-equip";
    }

    @GetMapping("/addNewEquipment")
    public String showCreateEquipmentForm(Model model) {
        Equipment equipment = new Equipment();
        model.addAttribute("equipment", equipment);
        return "createnewequipment";
    }

    @PostMapping("/newEquipment")
    public String showNewEquipment(@ModelAttribute("equipment") Equipment equipment, Model model) {
    equipmentService.save(equipment);
    model.addAttribute("equipment", equipment);
        return "newEquipment";
    }

    @GetMapping("/editEquipment/{id}")
    public String editEquipment(@PathVariable("id") Integer id, Model model) {
        Equipment equipment = equipmentService.findEquipmentById(id);
      model.addAttribute("equipment", equipment);
      return "editEquipment";
    }

    @PostMapping("/saveEquipment")
    public String showEquipment(@ModelAttribute("equipment") Equipment equipment, Model model) {
       equipmentService.save(equipment);
        model.addAttribute("equipment", equipment);
        return "equipment";
    }


    @GetMapping("/EquipmentReports/{id}")
    public String showReportsById(@PathVariable("id") Integer id, Model model) {
        Equipment equipment = equipmentService.findEquipmentById(id);
        List<DiagReport> reportList = diagReportService.findDiagReportByEquipment(equipment);
        model.addAttribute("reports", reportList);
        model.addAttribute("equipment", equipment);
        return "reports";
    }

    @GetMapping("/Equipment/{id}")
    public String showEquipment(@PathVariable("id") Integer id, Model model) {
       Equipment equipment = equipmentService.findEquipmentById(id);
        model.addAttribute("equipment", equipment);
        return "equipment";
    }

    @GetMapping("/editreport/{id}")
    public String editOrCreateReport(@PathVariable("id") Integer id, Model model) {
    DiagReport  report = diagReportService.findReportById(id);
    List<DiagCompany> diagCompanyList = diagCompanyService.findAll();
    model.addAttribute("diagCompanyList", diagCompanyList);
    model.addAttribute("report", report);
    return "editreport";
    }

//        @GetMapping("/addNewReport/{id}")
//        public String showCreateReport(@PathVariable("id") Integer id, Model model) {
//        Equipment equipment = equipmentService.findEquipmentById(id);
//        List<DiagCompany> diagCompanyList = diagCompanyService.findAll();
//        DiagReport report = new DiagReport();
//        model.addAttribute("report", report);
//        model.addAttribute("diagCompanyList", diagCompanyList);
//        return "createnewreport";
//        }


}