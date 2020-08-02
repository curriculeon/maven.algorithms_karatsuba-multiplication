package com.github.curriculeon.utils;

public interface MultiplierInterface {
    default Integer add(Integer baseValue, Integer multiplierValue) {
        return baseValue + multiplierValue;
    }

    default Integer multiply() {
        return multiply(getBaseValue(), getMultiplierValue());
    }

    Integer multiply(Integer value1, Integer value2);

    Integer getBaseValue();

    Integer getMultiplierValue();
}
