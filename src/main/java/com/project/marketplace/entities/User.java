//package com.project.marketplace.entities;
//
//import jakarta.persistence.*;
//
//import java.util.Set;
//
//@Entity
//@Table(name="users")
//public class User {
//    @Id
//    @Column(name="user_id")
//    private int user_id;
//
//    @Column(name="email")
//    private String email;
//
//    @Column(name="login_id")
//    private String login_id;
//
//    @Column(name="pass")
//    private String pass;
//
//    @Column(name="contact")
//    private String contact;
//
//    @Column(name="cnic")
//    private String cnic;
//
//    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
//    private Set<Ads> ad;
//
//    public Set<Ads> getAd() {
//        return ad;
//    }
//
//    public User(int user_id, String email, String login_id, String pass, String contact, String cnic, Set<Ads> ad) {
//        this.user_id = user_id;
//        this.email = email;
//        this.login_id = login_id;
//        this.pass = pass;
//        this.contact = contact;
//        this.cnic = cnic;
//        this.ad = ad;
//    }
//
//    public void setAd(Set<Ads> ad) {
//        this.ad = ad;
//    }
//
//    public User(int id, String email, String login_id, String pass, String contact, String cnic) {
//        this.user_id = id;
//        this.email = email;
//        this.login_id = login_id;
//        this.pass = pass;
//        this.contact = contact;
//        this.cnic = cnic;
//    }
//
//    public User() {
//    }
//
//    public int getUser_id() {
//        return user_id;
//    }
//
//    public void setUser_id(int id) {
//        this.user_id = id;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getLogin_id() {
//        return login_id;
//    }
//
//    public void setLogin_id(String login_id) {
//        this.login_id = login_id;
//    }
//
//    public String getPass() {
//        return pass;
//    }
//
//    public void setPass(String pass) {
//        this.pass = pass;
//    }
//
//    public String getContact() {
//        return contact;
//    }
//
//    public void setContact(String contact) {
//        this.contact = contact;
//    }
//
//    public String getCnic() {
//        return cnic;
//    }
//
//    public void setCnic(String cnic) {
//        this.cnic = cnic;
//    }
//}

package com.project.marketplace.entities;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int user_id;

    @Column(name = "email")
    private String email;

    @Column(name = "username")
    private String userName;


    @Column(name="gender")
    private String gender;

    @Column (name="dateofbirth")
    private String dateOfBirth;

    @Column(name = "pass")
    private String pass;

    @Column(name = "contact")
    private String contact;

    @Column(name = "cnic")
    private String cnic;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Ads> ad;

    public User() {}

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public User(String email, String userName, String gender, String dateOfBirth, String pass, String contact, String cnic, Set<Ads> ad) {
        this.email = email;
        this.userName = userName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.pass = pass;
        this.contact = contact;
        this.cnic = cnic;
        this.ad = ad;
    }

    // Getters and setters

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String login_id) {
        this.userName = login_id;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    public Set<Ads> getAd() {
        return ad;
    }

    public void setAd(Set<Ads> ad) {
        this.ad = ad;
    }
}

