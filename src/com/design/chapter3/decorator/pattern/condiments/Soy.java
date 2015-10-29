package com.design.chapter3.decorator.pattern.condiments;

import com.design.chapter3.decorator.pattern.Beverage;
import com.design.chapter3.decorator.pattern.CondimentDecorator;

/**
 * Created by Jurel on 10/29/2015.
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return .15 + beverage.cost();
    }
}
