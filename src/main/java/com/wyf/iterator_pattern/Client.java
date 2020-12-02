package com.wyf.iterator_pattern;

import java.util.Iterator;

public class Client {
    public static void main(String[] args) {
        MyList list = new MyList();
        //获取迭代器
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
