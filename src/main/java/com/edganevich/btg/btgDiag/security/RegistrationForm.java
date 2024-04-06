package com.edganevich.btg.btgDiag.security;//package com.edganevich.btg.diagnost.btg_diagnost.security;
//
//import com.edganevich.btg.diagnost.btg_diagnost.entities.User;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@Data
//@AllArgsConstructor
//public class RegistrationForm {
//
//        private String username;
//        private String password;
//        private String name;
//        private String surname;
//        private String workEmail;
//        private String role = "ROLE_USER";
//
//
//        public User toUser(PasswordEncoder passwordEncoder) {
//            return new User(
//                    username, passwordEncoder.encode(password),
//                    name, surname, workEmail, role);
//        }
//    }
//
