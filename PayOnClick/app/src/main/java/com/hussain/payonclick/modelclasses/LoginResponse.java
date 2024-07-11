package com.hussain.payonclick.modelclasses;

public class LoginResponse {
    private String statuscode;
    private String status;
    private Data1 data;

    // Getters and Setters


    public LoginResponse(String statuscode, String status, Data1 data) {
        this.statuscode = statuscode;
        this.status = status;
        this.data = data;
    }

    public LoginResponse() {
    }

    public String getStatuscode() {
        return statuscode;
    }

    public void setStatuscode(String statuscode) {
        this.statuscode = statuscode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Data1 getData() {
        return data;
    }

    public void setData(Data1 data) {
        this.data = data;
    }

    public static class Data1 {
        private String UserID;
        private String name;
        private String mobileNo;
        private String emailID;
        private String dob;
        private String profileImg;
        private String companyName;
        private String address;
        private String panCardNo;
        private String aadharNo;
        private String capBalance;
        private String walletBalance;
        private String CreateDate;
        private String userType;
        private String userTypeId;
        private String KycStatus;
        private String cityname;
        private String appversion;
        private boolean mpin;
        private boolean tmpin;
        private String merchantId;

        // Getters and Setters

        public String getUserID() {
            return UserID;
        }

        public void setUserID(String userID) {
            UserID = userID;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getMobileNo() {
            return mobileNo;
        }

        public void setMobileNo(String mobileNo) {
            this.mobileNo = mobileNo;
        }

        public String getEmailID() {
            return emailID;
        }

        public void setEmailID(String emailID) {
            this.emailID = emailID;
        }

        public String getDob() {
            return dob;
        }

        public void setDob(String dob) {
            this.dob = dob;
        }

        public String getProfileImg() {
            return profileImg;
        }

        public void setProfileImg(String profileImg) {
            this.profileImg = profileImg;
        }

        public String getCompanyName() {
            return companyName;
        }

        public void setCompanyName(String companyName) {
            this.companyName = companyName;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getPanCardNo() {
            return panCardNo;
        }

        public void setPanCardNo(String panCardNo) {
            this.panCardNo = panCardNo;
        }

        public String getAadharNo() {
            return aadharNo;
        }

        public void setAadharNo(String aadharNo) {
            this.aadharNo = aadharNo;
        }

        public String getCapBalance() {
            return capBalance;
        }

        public void setCapBalance(String capBalance) {
            this.capBalance = capBalance;
        }

        public String getWalletBalance() {
            return walletBalance;
        }

        public void setWalletBalance(String walletBalance) {
            this.walletBalance = walletBalance;
        }

        public String getCreateDate() {
            return CreateDate;
        }

        public void setCreateDate(String createDate) {
            CreateDate = createDate;
        }

        public String getUserType() {
            return userType;
        }

        public void setUserType(String userType) {
            this.userType = userType;
        }

        public String getUserTypeId() {
            return userTypeId;
        }

        public void setUserTypeId(String userTypeId) {
            this.userTypeId = userTypeId;
        }

        public String getKycStatus() {
            return KycStatus;
        }

        public void setKycStatus(String kycStatus) {
            KycStatus = kycStatus;
        }

        public String getCityname() {
            return cityname;
        }

        public void setCityname(String cityname) {
            this.cityname = cityname;
        }

        public String getAppversion() {
            return appversion;
        }

        public void setAppversion(String appversion) {
            this.appversion = appversion;
        }

        public boolean isMpin() {
            return mpin;
        }

        public void setMpin(boolean mpin) {
            this.mpin = mpin;
        }

        public boolean isTmpin() {
            return tmpin;
        }

        public void setTmpin(boolean tmpin) {
            this.tmpin = tmpin;
        }

        public String getMerchantId() {
            return merchantId;
        }

        public void setMerchantId(String merchantId) {
            this.merchantId = merchantId;
        }
    }

}
