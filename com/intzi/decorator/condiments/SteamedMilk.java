package com.intzi.decorator.condiments;

import com.intzi.decorator.Coffee;

public class SteamedMilk extends CondimentDecorator {

    private Coffee coffee;

    public SteamedMilk(Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription()+", Steamed Milk";
    }

    @Override
    public double cost() {
        return .16 + coffee.cost();
    }
}
