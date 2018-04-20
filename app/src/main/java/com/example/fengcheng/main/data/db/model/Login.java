package com.example.fengcheng.main.data.db.model;

/**
 * @Package com.example.fengcheng.main.data.db
 * @FileName Login
 * @Date 4/19/18, 11:41 AM
 * @Author Created by fengchengding
 * @Description Mvp
 */

public class Login {

    private String name;
    private String pwd;

    public Login(String name, String pwd) {
        this.name = name;
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
