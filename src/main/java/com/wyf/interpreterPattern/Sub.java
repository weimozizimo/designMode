package com.wyf.interpreterPattern;

public class Sub  extends  Operator{

    public Sub(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interceptor() {
        return left.interceptor()-right.interceptor();
    }
}
