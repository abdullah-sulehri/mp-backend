package com.project.marketplace.dto;

import com.project.marketplace.entities.Ads;
import com.project.marketplace.entities.User;
import jakarta.persistence.*;

import java.util.Set;
import java.util.stream.Collectors;

public class UserDto {

    private int user_id;

    private String email;


    private String login_id;


    private String pass;


    private String contact;


    private String cnic;


    private Set<AdsDto> ad;

    public UserDto(int user_id, String email, String login_id, String pass, String contact, String cnic, Set<AdsDto> ad) {
        this.user_id = user_id;
        this.email = email;
        this.login_id = login_id;
        this.pass = pass;
        this.contact = contact;
        this.cnic = cnic;
        this.ad = ad;
    }

    public UserDto(User user){
        this.user_id = user.getUser_id();
        this.email = user.getEmail();
        this.login_id = user.getLogin_id();
        this.pass = user.getPass();
        this.contact = user.getContact();
        this.cnic = user.getCnic();
        //this.ad = user.getAd().stream().map(AdsDto::new).collect(Collectors.toSet());
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

    public String getLogin_id() {
        return login_id;
    }

    public void setLogin_id(String login_id) {
        this.login_id = login_id;
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
