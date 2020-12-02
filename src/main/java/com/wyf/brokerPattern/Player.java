package com.wyf.brokerPattern;

public class Player {
    public int money = 100;
    public Group group;

    public Player(Group group){
        this.group = group;
    }

    public void change(int money){
        //输了将钱发送到群里，或在群里领取自己赢的钱
        group.money -= money;
        //自己的余额改变
        this.money += money;
        if(money<0){
            System.out.println(this.getClass().getName()+"输了"+money+"元");
        }else {
            System.out.println(this.getClass().getName()+"赢了"+money+"元");
        }
    }
}
