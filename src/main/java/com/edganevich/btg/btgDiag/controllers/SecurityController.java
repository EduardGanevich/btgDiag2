package com.edganevich.btg.btgDiag.controllers;//package com.edganevich.btg.diagnost.btg_diagnost.controllers;
//

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//@Controller
//@RequestMapping("/Reg")
//public class SecurityController {
//
//    @Autowired
//    private UserRepository userRepo;
//    @Autowired
//    private PasswordEncoder passwordEncoder;
//
//
//    @GetMapping
//    public String registerForm() {
//        return "registration";
//    }
//
//
//    @PostMapping
//    public String processRegistration(RegistrationForm form) {
//        userRepo.save(form.toUser(passwordEncoder));
//        return "redirect:/login";
//    }
//}
//
