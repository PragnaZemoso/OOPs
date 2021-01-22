package com.zemosotraining.designprinciples.SOLIDprinciples.SRP.solution;
/*
 * Example for S - Single Responsibility principle:
 * A class should only have one responsibility or one job. Furthermore, it should only have one reason to change.
 */

public class MobileMessenger extends Mobile {

    public String message;

    public MobileMessenger(long mobileNumber, long IMEI1, long IMEI2,
                           String deviceName, String message) {
        super(mobileNumber, IMEI1, IMEI2, deviceName);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    void sendMessage(long mobileNum, String msg) {
        // logic for sending message
        System.out.println("Sending message '" + msg + "' to mobile "
                + mobileNum);
    }

    public static void main(String[] args) {

        MobileMessenger messengerObj = new MobileMessenger(9876563623L,
                725916963963239L, 725916963963240L, "Mi A3",
                "Hi, I am Pragna incoming ZeMoSo ASE");
        messengerObj.sendMessage(messengerObj.getMobileNumber(),
                messengerObj.getMessage());
    }

}