package com.wyf.observerPattern;


/**
 * 小偷类（被观察者）
 */
public class CriminalObserverable extends Observable {
    public void crime(String envent){
        System.out.println("罪犯正在"+envent);
        notifyObservers(envent);
    }
}
