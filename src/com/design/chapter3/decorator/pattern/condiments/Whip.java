package com.design.chapter3.decorator.pattern.condiments;

import com.design.chapter3.decorator.pattern.Beverage;
import com.design.chapter3.decorator.pattern.CondimentDecorator;

/**
 * Created by Jurel on 10/29/2015.
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return .10 + beverage.cost();
    }
}
