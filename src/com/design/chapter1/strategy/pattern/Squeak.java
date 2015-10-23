package com.design.chapter1.strategy.pattern;

/**
 * Created by Jurel on 10/23/2015.
 */
public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Squeak");
    }
}
