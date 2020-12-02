package com.wyf.iterator_pattern;


import javax.swing.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MyList {
    private List<String> data = Arrays.asList("a", "b", "c");

    //每次生成一个迭代器用于遍历列表
    public Iterator iterator(){
        return new Itr();
    }

    private class Itr implements Iterator{
        private  int index = 0;

        public boolean hasNext() {
            return index<data.size();
        }

        public String next() {
            return data.get(index++);
        }
    }

}
