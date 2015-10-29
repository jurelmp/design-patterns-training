package com.design.chapter3.decorator.pattern.coffees;

import com.design.chapter3.decorator.pattern.Beverage;

/**
 * Created by Jurel on 10/29/2015.
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
