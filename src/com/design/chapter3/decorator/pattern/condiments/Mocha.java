package com.design.chapter3.decorator.pattern.condiments;

import com.design.chapter3.decorator.pattern.Beverage;
import com.design.chapter3.decorator.pattern.CondimentDecorator;

/**
 * Created by Jurel on 10/29/2015.
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
