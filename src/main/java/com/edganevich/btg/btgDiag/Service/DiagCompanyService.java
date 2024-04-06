package com.edganevich.btg.btgDiag.Service;

import java.util.*;

import com.edganevich.btg.btgDiag.DAO.DiagCompanyRepository;
import com.edganevich.btg.btgDiag.entities.DiagCompany;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiagCompanyService {


    @Autowired
    DiagCompanyRepository diagCompanyRepository;

    public List<DiagCompany> findAll(){
    List<DiagCompany> list = diagCompanyRepository.findAll();
    return list;
    }

}
