package com.zemosotraining.designprinciples.SOLIDprinciples.ISP.solution;

public class Swimmer implements SwimmingAthlete{
    @Override
    public void compete() {
        System.out.println("Swimmer started competing.... ");
    }

    @Override
    public void swim() {
        System.out.println("Hey! I am a Swimming Athlete now!");
        compete();
    }
}
