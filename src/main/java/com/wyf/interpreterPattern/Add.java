package com.wyf.interpreterPattern;


public class Add extends Operator {


    public Add(Expression left, Expression right) {
        super(left, right);
    }

    public int interceptor() {
        return left.interceptor()+right.interceptor();
    }

}
