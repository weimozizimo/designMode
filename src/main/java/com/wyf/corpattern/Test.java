package com.wyf.corpattern;

public class Test {
    public static void main(String[] args) {
        Programer newbie = new NewbieProgramer();
        Programer normal = new NormalProgramer();
        Programer good= new GoodProgramer();

        Bug bug = new Bug(10);

        newbie.setNext(normal);
        normal.setNext(good);

        newbie.handle(bug);
    }
}
