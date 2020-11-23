package com.wyf.corpattern;

public abstract class Programer {
    protected Programer next;

    public void setNext(Programer next){
        this.next = next;
    }

    abstract void handle(Bug bug);
}
