package com.design.chapter3.decorator.pattern;

import com.design.chapter3.decorator.pattern.coffees.DarkRoast;
import com.design.chapter3.decorator.pattern.coffees.Espresso;
import com.design.chapter3.decorator.pattern.coffees.HouseBlend;
import com.design.chapter3.decorator.pattern.condiments.Mocha;
import com.design.chapter3.decorator.pattern.condiments.Soy;
import com.design.chapter3.decorator.pattern.condiments.Whip;

/**
 * Created by Jurel on 10/29/2015.
 */
public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }
}
