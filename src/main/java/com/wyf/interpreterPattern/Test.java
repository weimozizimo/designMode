package com.wyf.interpreterPattern;

public class Test {
    public static void main(String[] args) {
        String expression = "一加二减三加五";
        Caculator caculator = new Caculator();
        int i = caculator.caculate(expression);
        System.out.println(i);
    }
}
