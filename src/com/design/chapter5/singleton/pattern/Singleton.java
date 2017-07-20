package com.design.chapter5.singleton.pattern;

/**
 * Created by JurelP on 4/10/2016.
 */
public class Singleton {
    private static Singleton uniqueInstance = new Singleton();

    private Singleton() {

    }

    public static synchronized Singleton getInstance() {
//        if (uniqueInstance == null)
//            uniqueInstance = new Singleton();
        return uniqueInstance;
    }
}
