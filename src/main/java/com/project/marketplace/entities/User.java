package com.project.marketplace.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class User {
    @Id
    @Column(name="user_id")
    private int user_id;

    @Column(name="email")
    private String email;

    @Column(name="login_id")
    private String login_id;

    @Column(name="pass")
    private String pass;

    @Column(name="contact")
    private String contact;

    @Column(name="cnic")
    private String cnic;

    public User(int id, String email, String login_id, String pass, String contact, String cnic) {
        this.user_id = id;
        this.email = email;
        this.login_id = login_id;
        this.pass = pass;
        this.contact = contact;
        this.cnic = cnic;
    }

    public User() {
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int id) {
        this.user_id = id;
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
}
