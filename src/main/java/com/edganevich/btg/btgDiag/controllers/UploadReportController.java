package com.edganevich.btg.btgDiag.controllers;

import com.edganevich.btg.btgDiag.Service.DiagCompanyService;
import com.edganevich.btg.btgDiag.Service.DiagReportService;
import com.edganevich.btg.btgDiag.Service.EquipmentService;
import com.edganevich.btg.btgDiag.entities.DiagCompany;
import com.edganevich.btg.btgDiag.entities.DiagReport;
import com.edganevich.btg.btgDiag.entities.Equipment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@Controller
public class UploadReportController {

    public static String UPLOAD_DIRECTORY = System.getProperty("user.dir") + "/uploads";

    @Autowired
    private EquipmentService equipmentService;

    @Autowired
    private DiagCompanyService diagCompanyService;

    @Autowired
    private DiagReportService diagReportService;


//    @GetMapping("/addNewReport/{id}")
//    public String showCreateReportForm(@PathVariable("id") Integer id, Model model,
//                                       @RequestParam("file") MultipartFile file) throws IOException {
//        Equipment equipment = equipmentService.findEquipmentById(id);
//        List<DiagCompany> diagCompanyList = diagCompanyService.findAll();
//        DiagReport report = new DiagReport();
//        StringBuilder fileNames = new StringBuilder();
//        Path fileNameAndPath = Paths.get(UPLOAD_DIRECTORY, file.getOriginalFilename());
//        fileNames.append(file.getOriginalFilename());
//        Files.write(fileNameAndPath, file.getBytes());
////        model.addAttribute("msg", "file uploaded: " + fileNames.toString());
//        model.addAttribute("report", report);
//        model.addAttribute("diagCompanyList", diagCompanyList);
//        report.setReportFileName(file.getOriginalFilename());
//        Integer eqId = report.getEquipment().getId();
//        return "EquipmentReports";
//    }

    @GetMapping("/addNewReport/{id}")
    public String showCreateReportForm(@PathVariable("id") Integer id, Model model) {
        Equipment equipment = equipmentService.findEquipmentById(id);
        List<DiagCompany> diagCompanyList = diagCompanyService.findAll();
        DiagReport report = new DiagReport();
        equipment.getReportList().add(report);
        model.addAttribute("report", report);
        model.addAttribute("diagCompanyList", diagCompanyList);
        return "createnewreport";
    }

        @PostMapping("/upload") public String uploadImage(Model model, @RequestParam("file") MultipartFile file, @RequestParam("report") DiagReport report) throws IOException {
        StringBuilder fileNames = new StringBuilder();
        Path fileNameAndPath = Paths.get(UPLOAD_DIRECTORY, file.getOriginalFilename());
        fileNames.append(file.getOriginalFilename());
        Files.write(fileNameAndPath, file.getBytes());
        model.addAttribute("msg", "file uploaded: " + fileNames.toString());
        report.setReportFileName(file.getOriginalFilename());
        diagReportService.save(report);
        equipmentService.updateDiagDateIfItNecessary(report);
        return "all-equip";
    }


    //    @PostMapping("/upload") public void uploadImage(Model model, @RequestParam("file") MultipartFile file) throws IOException {
//        StringBuilder fileNames = new StringBuilder();
//        Path fileNameAndPath = Paths.get(UPLOAD_DIRECTORY, file.getOriginalFilename());
//        fileNames.append(file.getOriginalFilename());
//        Files.write(fileNameAndPath, file.getBytes());
//        model.addAttribute("msg", "file uploaded: " + fileNames.toString());
//      }
//
}
