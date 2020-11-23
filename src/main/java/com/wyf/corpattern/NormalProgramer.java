package com.wyf.corpattern;

public class NormalProgramer extends Programer {

    void handle(Bug bug) {
        if(bug.value>0&&bug.value<=50){
            solve(bug);
        }else if(next!=null){
            next.handle(bug);
        }
    }

    private void solve(Bug bug){
        System.out.println("普通程序员解决了一条难度为"+bug.value+"的bug");
    }
}
