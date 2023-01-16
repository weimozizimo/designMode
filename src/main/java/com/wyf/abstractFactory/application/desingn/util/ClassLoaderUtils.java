package com.wyf.abstractFactory.application.desingn.util;

public class ClassLoaderUtils {

    public static Class<?>[] getClazzByArgs(Object[] obj){
        Class<?>[] classes = new Class[obj.length];

        for (int i = 0; i < obj.length; i++) {
            classes[i] = obj[i].getClass();
        }

        return classes;
    }

}
