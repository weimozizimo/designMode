package com.wyf.corpattern;

public class GoodProgramer extends Programer {

    void handle(Bug bug) {
        if(bug.value>0&&bug.value<=100){
            solve(bug);
        }else if(next!=null){
            next.handle(bug);
        }
    }

    private void solve(Bug bug){
        System.out.println("优秀程序员解决了一条难度为"+bug.value+"的bug");
    }
}
