package com.design.chapter4.factory.pattern;

import com.design.chapter4.factory.pattern.impl.CheesePizza;
import com.design.chapter4.factory.pattern.impl.ClamPizza;
import com.design.chapter4.factory.pattern.impl.PepperoniPizza;
import com.design.chapter4.factory.pattern.impl.VeggiePizza;

/**
 * Created by JurelP on 4/9/2016.
 */
public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
