package com.design.chapter3.decorator.pattern.coffees;

import com.design.chapter3.decorator.pattern.Beverage;

/**
 * Created by Jurel on 10/29/2015.
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
