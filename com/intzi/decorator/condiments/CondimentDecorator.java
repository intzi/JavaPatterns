package com.intzi.decorator.condiments;

import com.intzi.decorator.Coffee;

public abstract class CondimentDecorator extends Coffee {
    public abstract String getDescription();
}
