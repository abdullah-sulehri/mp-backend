package com.project.marketplace.dto;

import com.project.marketplace.entities.User;

public class LoginResponse {
    private String userName;
    private String contactInfo;

    private String email;

    private String token;
    //trying to get user id :(

    private int user_id;

    public LoginResponse(String userName, String contactInfo, String email, String token,int user_id) {
        this.userName = userName;
        this.contactInfo = contactInfo;
        this.email = email;
        this.token = token;
        this.user_id=user_id;
    }
    public LoginResponse(User user, String token){
        this.user_id= user.getUser_id();
        this.userName = user.getUserName();
        this.contactInfo = user.getContact();
        this.email = user.getEmail();
        this.token = token;
    }

    public String toString(){
        return "{\n"+
                "\"token\":\""+this.token+"\",\n"+
                "\"contactInfo\":\""+this.contactInfo+"\",\n"+
                "\"email\":\""+this.email+"\",\n"+
                "\"userName\":\""+this.userName+"\",\n"+
                "\"user_id\":\""+this.user_id+"\"\n"+
                "}";
    }
}
