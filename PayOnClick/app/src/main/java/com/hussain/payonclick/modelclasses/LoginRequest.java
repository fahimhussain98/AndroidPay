package com.hussain.payonclick.modelclasses;

public class LoginRequest {

    private String userName;
    private String password;
    private String tokenKey;
    private String deviceInfo;

    public LoginRequest(String userName, String password, String tokenKey, String deviceInfo) {
        this.userName = userName;
        this.password = password;
        this.tokenKey = tokenKey;
        this.deviceInfo = deviceInfo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTokenKey() {
        return tokenKey;
    }

    public void setTokenKey(String tokenKey) {
        this.tokenKey = tokenKey;
    }

    public String getDeviceInfo() {
        return deviceInfo;
    }

    public void setDeviceInfo(String deviceInfo) {
        this.deviceInfo = deviceInfo;
    }
// Getters and Setters

}
