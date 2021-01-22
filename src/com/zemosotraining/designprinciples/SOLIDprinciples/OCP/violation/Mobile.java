package com.zemosotraining.designprinciples.SOLIDprinciples.OCP.violation;

public class Mobile {
    private long mobileNumber;
    private long IMEI1, IMEI2; // each for each SIM slot 1 & 2 respectively
    private String deviceName;

// Violation: new functionality of 3rd SIM added in existing Mobile Class
    private long IMEI3; // IMEI Number for SIM slot 3

    public Mobile(long mobileNumber, long IMEI1, long IMEI2,long IMEI3, String deviceName) {
        this.mobileNumber = mobileNumber;
        this.deviceName = deviceName;
        this.IMEI1 = IMEI1;
        this.IMEI2 = IMEI2;
        this.IMEI3 = IMEI3;
    }

    public long getIMEI3() {
        return IMEI3;
    }

    public void setIMEI3(long IMEI3) {
        this.IMEI3 = IMEI3;
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
