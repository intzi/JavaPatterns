package com.intzi.decorator.condiments;
import com.intzi.decorator.Coffee;

public class Mocha extends CondimentDecorator {

    private Coffee coffee;

    public Mocha(Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription()+", Mocha";
    }

    @Override
    public double cost() {
        return 0.12 + coffee.cost();
    }
}
