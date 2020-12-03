package com.wyf.memoPattern;

public class Client {
    public static void main(String[] args) {
        Player player = new Player();
        Memeto memeto = player.saveSatate();

        player.fightBoss();

        System.out.println(player);


        System.out.println("回档");
        player.restoreState(memeto);

        System.out.println(player);
    }
}
