package com.wyf.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
          iterator.remove();
        }

    }
}
