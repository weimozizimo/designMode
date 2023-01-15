package com.wyf.observerPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * 被观察者
 */
public class Observable {

    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public void notifyObservers(String event){
        for(Observer observer:observers){
            observer.update(event);
        }
    }
}
