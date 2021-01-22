package com.zemosotraining.designprinciples.SOLIDprinciples.OCP.solution;
/*
 * Example for O - Open/Closed principle:
 * Software entities(classes, modules, functions, etc.) should be Open for extension, but closed for modification
 */

import com.zemosotraining.designprinciples.SOLIDprinciples.SRP.solution.Mobile;

public class MobileWithTripleSimSlots extends Mobile {
    private long IMEI3; // IMEI Number for SIM slot 3

    public MobileWithTripleSimSlots(long mobileNumber, long IMEI1, long IMEI2,
                                    String deviceName, long IMEI3) {
        super(mobileNumber, IMEI1, IMEI2, deviceName);
        this.IMEI3 = IMEI3;
    }

    public long getIMEI3() {
        return IMEI3;
    }

    public void setIMEI3(long iMEI3) {
        IMEI3 = iMEI3;
    }

    public static void main(String[] args) {
        MobileWithTripleSimSlots tripleSimMobile = new MobileWithTripleSimSlots(9876563626L,
                725916963963239L, 725916963963240L, "Mi A3", 325916963963241L);
        System.out.println("IMEI Number of 3rd SIM slot: " + tripleSimMobile.getIMEI3());

    }

}