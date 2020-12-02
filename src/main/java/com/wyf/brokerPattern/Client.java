package com.wyf.brokerPattern;

public class Client {

    private static boolean addMoneySuccess = false;

    private static Object obj = new Object();

    public static void main(String[] args) {




        Group group = new Group();
        Player player1 = new Player(group);
        Player player2 = new Player(group);
        Player player3 = new Player(group);
        Player player4 = new Player(group);


        new Thread(()->{
           synchronized(obj){

               while(!addMoneySuccess){

               }

           }
        });

    }
}
