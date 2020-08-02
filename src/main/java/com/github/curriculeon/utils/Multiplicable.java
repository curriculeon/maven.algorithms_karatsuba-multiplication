package com.github.curriculeon.utils;

public interface Multiplicable extends MultiplierInterface {
    MultiplierInterface getMultiplier();

    default Integer add(Integer value1, Integer value2) {
        return getMultiplier().add(value1, value2);
    }

    default Integer multiply(Integer value1, Integer value2) {
        return getMultiplier().multiply(value1, value2);
    }

    default Integer getBaseValue() {
        return getMultiplier().getBaseValue();
    }


    default Integer getMultiplierValue() {
        return getMultiplier().getMultiplierValue();
    }
}
