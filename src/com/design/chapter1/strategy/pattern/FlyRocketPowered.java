package com.design.chapter1.strategy.pattern;

/**
 * Created by Jurel on 10/23/2015.
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
