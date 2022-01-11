package com.noobscreation.learningrecycler;

public class UserModel {
    String fname;
    String lname;

    UserModel(String fname, String lname){
        this.fname = fname;
        this.lname = lname;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }
}
