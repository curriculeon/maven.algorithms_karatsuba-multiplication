package com.github.curriculeon.utils;

abstract public class AbstractMultiplier implements MultiplierInterface{
    private final Integer baseValue;
    private final Integer multiplierValue;

    public AbstractMultiplier() {
        this(1,1);
    }

    public AbstractMultiplier(Integer baseValue, Integer multiplierValue) {
        this.baseValue = baseValue;
        this.multiplierValue = multiplierValue;
    }

    @Override
    public Integer getBaseValue() {
        return baseValue;
    }

    @Override
    public Integer getMultiplierValue() {
        return multiplierValue;
    }
}
