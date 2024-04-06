package com.edganevich.btg.btgDiag.entities;//package com.edganevich.btg.diagnost.btg_diagnost.entities;
//
//import jakarta.persistence.*;
//import lombok.*;
////import org.springframework.security.core.GrantedAuthority;
////import org.springframework.security.core.authority.SimpleGrantedAuthority;
////import org.springframework.security.core.userdetails.UserDetails;
//
//import java.util.Arrays;
//import java.util.Collection;
//
//@Entity
//@Data
//@NoArgsConstructor(access = AccessLevel.PRIVATE, force=true)
//@RequiredArgsConstructor
//@Table(name = "users")
//public class User implements UserDetails {
//
//    private static final long serialVersionUID = 1L;
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Integer id;
//
//    @Column(name = "username")
//    private final String username;
//
//    @Column(name = "password")
//    private final String password;
//
//    @Column(name = "name")
//    private final String name;
//
//    @Column(name = "surname")
//    private final String surname;
//
//    @Column(name = "work_email")
//    private final String workEmail;
//
//    @Column(name= "role")
//    private final String role;
//
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"));
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return true;
//    }
//
//
//
//
//}
