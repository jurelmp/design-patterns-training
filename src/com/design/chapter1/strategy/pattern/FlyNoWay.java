package com.design.chapter1.strategy.pattern;

/**
 * Created by Jurel on 10/23/2015.
 */
public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly");
    }
}
