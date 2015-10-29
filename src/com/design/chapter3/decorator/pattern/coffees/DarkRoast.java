package com.design.chapter3.decorator.pattern.coffees;

import com.design.chapter3.decorator.pattern.Beverage;

/**
 * Created by Jurel on 10/29/2015.
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return .99;
    }
}
