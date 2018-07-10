package com.wj.altf.entity;

import java.util.Date;

public class User {
    private Long uId;

    private String uName;

    private String uPwd;

    private Date uRegisterTime;

    private Boolean uIsValid;

    private String uIconUrl;

    public Long getuId() {
        return uId;
    }

    public void setuId(Long uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName == null ? null : uName.trim();
    }

    public String getuPwd() {
        return uPwd;
    }

    public void setuPwd(String uPwd) {
        this.uPwd = uPwd == null ? null : uPwd.trim();
    }

    public Date getuRegisterTime() {
        return uRegisterTime;
    }

    public void setuRegisterTime(Date uRegisterTime) {
        this.uRegisterTime = uRegisterTime;
    }

    public Boolean getuIsValid() {
        return uIsValid;
    }

    public void setuIsValid(Boolean uIsValid) {
        this.uIsValid = uIsValid;
    }

    public String getuIconUrl() {
        return uIconUrl;
    }

    public void setuIconUrl(String uIconUrl) {
        this.uIconUrl = uIconUrl == null ? null : uIconUrl.trim();
    }
}