package com.wyf.observerPattern;

public class Client {
    public static void main(String[] args) {
        CriminalObserverable cirme = new CriminalObserverable();
        PoliceObserver police = new PoliceObserver();
        cirme.addObserver(police);
        cirme.crime("抢劫一位女士");
    }
}
