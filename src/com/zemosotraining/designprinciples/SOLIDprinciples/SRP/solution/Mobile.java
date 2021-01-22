package com.zemosotraining.designprinciples.SOLIDprinciples.SRP.solution;

public class Mobile {
    private long mobileNumber;
    private long IMEI1, IMEI2; // each for each SIM slot 1 & 2 respectively
    private String deviceName;

    public Mobile(long mobileNumber, long IMEI1, long IMEI2, String deviceName) {
        this.mobileNumber = mobileNumber;
        this.deviceName = deviceName;
        this.IMEI1 = IMEI1;
        this.IMEI2 = IMEI2;
    }

    // getters & setters

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public long getIMEI1() {
        return IMEI1;
    }

    public void setIMEI1(long iMEI1) {
        IMEI1 = iMEI1;
    }

    public long getIMEI2() {
        return IMEI2;
    }

    public void setIMEI2(long iMEI2) {
        IMEI2 = iMEI2;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

}
