package com.design.chapter3.decorator.pattern;

/**
 * Created by Jurel on 10/29/2015.
 */
public abstract class Beverage {
    public String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
