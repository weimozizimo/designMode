package com.wyf.corpattern;

public class NewbieProgramer extends Programer {

    void handle(Bug bug) {
        if(bug.value>0&&bug.value<=20){
            solve(bug);
        }else if(next!=null){
            next.handle(bug);
        }
    }

    private void solve(Bug bug){
        System.out.println("菜鸟程序员解决了一条难度为"+bug.value+"的bug");
    }
}
