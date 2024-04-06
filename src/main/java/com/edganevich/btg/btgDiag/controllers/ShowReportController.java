package com.edganevich.btg.btgDiag.controllers;

import com.edganevich.btg.btgDiag.Service.DiagReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLConnection;

@Controller
@RequestMapping("/showreport")
public class ShowReportController {

    private static final String EXTERNAL_FILE_PATH = "D:/java1/btg/btgDiag/src/main/resources/filereports/";

    @Autowired
    DiagReportService diagReportService;

    @GetMapping(value = "/{name}")
        public void showReport(HttpServletRequest request, HttpServletResponse response,
                             @PathVariable("name") String name) throws IOException {


        File file = new File(EXTERNAL_FILE_PATH + name);
        if (file.exists()){
            String mimeType = URLConnection.guessContentTypeFromName(file.getName());

                     if(mimeType == null){
                mimeType = "application/octet-stream";
            }
            response.setContentType(mimeType);
            response.setHeader("Content-Disposition", String.format("inline; filename=\"" + file.getName() + "\""));
            response.setContentLength((int) file.length());
            InputStream inputStream = new BufferedInputStream(new FileInputStream(file));
            FileCopyUtils.copy(inputStream, response.getOutputStream());
        }
    }
}
