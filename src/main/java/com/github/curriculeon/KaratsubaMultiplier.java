package com.github.curriculeon;

import com.github.curriculeon.utils.AbstractMultiplier;

public class KaratsubaMultiplier extends AbstractMultiplier {
    private final IntegerSplitter baseValueSplitter;

    public KaratsubaMultiplier(Integer baseValue, Integer multiplierValue) {
        super(baseValue, multiplierValue);
        this.baseValueSplitter = new IntegerSplitter(baseValue);
    }

    Integer getSumOfFirstHalves() {
        return add(baseValueSplitter.getFirstQuarterOfDigits(), baseValueSplitter.getSecondQuarterOfDigits());
    }

    Integer getSumOfSecondHalves() {
        return add(baseValueSplitter.getThirdQuarterOfDigits(), baseValueSplitter.getFourthQuarterOfDigits());
    }

    @Override
    public Integer multiply(Integer value1, Integer value2) {
        return null;
    }
}
