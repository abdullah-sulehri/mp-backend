package com.project.marketplace.dto;

import com.project.marketplace.entities.User;

import java.util.Set;

public class UserDto {



    private int user_id;

    private String email;


    private String userName;


    private String pass;


    private String contact;


    private String cnic;
    private String gender;
    private String dateOfBirth;


    private Set<AdsDto> ad;

///CHANGES ID SERIAL BUT IDK
    public UserDto(int user_id, String email, String userName, String pass, String contact, String cnic, String gender, String dateOfBirth, Set<AdsDto> ad) {
        this.user_id = user_id;
        this.email = email;
        this.userName = userName;
        this.pass = pass;
        this.contact = contact;
        this.cnic = cnic;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.ad = ad;
    }
    public UserDto(User user){
        this.user_id = user.getUser_id();
        this.email = user.getEmail();
        this.userName = user.getUserName();
        this.pass = user.getPass();
        this.contact = user.getContact();
        this.cnic = user.getCnic();
        this.dateOfBirth=user.getDateOfBirth();
        this.gender=user.getGender();
        //this.ad = user.getAd().stream().map(AdsDto::new).collect(Collectors.toSet());
    }

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

    public void setUserName(String userName) {
        this.userName = userName;
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

    public Set<AdsDto> getAd() {
        return ad;
    }

    public void setAd(Set<AdsDto> ad) {
        this.ad = ad;
    }
}
