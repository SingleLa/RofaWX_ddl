package com.game.WX.model;

import java.util.Date;

public class Account {
    private Integer agencyid;

    private String username;

    private String password;

    private Integer referrer;

    private String account;

    private String weixin;

    private String operate;

    private Date createtime;

    private Date logintime;

    private Date forbidtime;

    private String forbidcause;

    private String verification;

    private Date verificationtime;

    private String phonenum;

    private String ip1;

    private String ip2;

    private String ips;

    public Integer getAgencyid() {
        return agencyid;
    }

    public void setAgencyid(Integer agencyid) {
        this.agencyid = agencyid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getReferrer() {
        return referrer;
    }

    public void setReferrer(Integer referrer) {
        this.referrer = referrer;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getWeixin() {
        return weixin;
    }

    public void setWeixin(String weixin) {
        this.weixin = weixin == null ? null : weixin.trim();
    }

    public String getOperate() {
        return operate;
    }

    public void setOperate(String operate) {
        this.operate = operate == null ? null : operate.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getLogintime() {
        return logintime;
    }

    public void setLogintime(Date logintime) {
        this.logintime = logintime;
    }

    public Date getForbidtime() {
        return forbidtime;
    }

    public void setForbidtime(Date forbidtime) {
        this.forbidtime = forbidtime;
    }

    public String getForbidcause() {
        return forbidcause;
    }

    public void setForbidcause(String forbidcause) {
        this.forbidcause = forbidcause == null ? null : forbidcause.trim();
    }

    public String getVerification() {
        return verification;
    }

    public void setVerification(String verification) {
        this.verification = verification == null ? null : verification.trim();
    }

    public Date getVerificationtime() {
        return verificationtime;
    }

    public void setVerificationtime(Date verificationtime) {
        this.verificationtime = verificationtime;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum == null ? null : phonenum.trim();
    }

    public String getIp1() {
        return ip1;
    }

    public void setIp1(String ip1) {
        this.ip1 = ip1 == null ? null : ip1.trim();
    }

    public String getIp2() {
        return ip2;
    }

    public void setIp2(String ip2) {
        this.ip2 = ip2 == null ? null : ip2.trim();
    }

    public String getIps() {
        return ips;
    }

    public void setIps(String ips) {
        this.ips = ips == null ? null : ips.trim();
    }
}