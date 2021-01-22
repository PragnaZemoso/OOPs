package com.zemosotraining.designprinciples.SOLIDprinciples.SRP.solution;
/*
 * Example for S - Single Responsibility principle:
 * A class should only have one responsibility or one job. Furthermore, it should only have one reason to change.
 */

public class MobileDialler extends Mobile {

    public MobileDialler(long mobileNumber, long IMEI1, long IMEI2,
                         String deviceName) {
        super(mobileNumber, IMEI1, IMEI2, deviceName);
    }

    void dial(long mobileNumber) {
        // logic for dialing a mobile number
        System.out.println("Attempting to dial the Mobile " + mobileNumber);
    }

    public static void main(String[] args) {
        MobileDialler dialler = new MobileDialler(9876563623L,
                725916963963239L, 725916963963240L, "Mi A3");
        dialler.dial(dialler.getMobileNumber());
    }

}