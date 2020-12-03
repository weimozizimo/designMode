package com.wyf.observerPattern;

/**
 * 警察类（观察者)
 */
public class PoliceObserver implements Observer {
    @Override
    public void update(String event) {
        System.out.println("警察收到消息，罪犯在"+event);
    }
}
