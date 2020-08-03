package com.github.curriculeon;

import com.github.curriculeon.utils.AbstractMultiplier;

public class KaratsubaMultiplier extends AbstractMultiplier {
    private final IntegerSplitter baseValueSplitter;

    public KaratsubaMultiplier() {
        this(1, 1);
    }

    public KaratsubaMultiplier(Integer baseValue, Integer multiplierValue) {
        super(baseValue, multiplierValue);
        this.baseValueSplitter = new IntegerSplitter(baseValue);
    }

    private Integer getSumOfQuarters(int quarter1, int quarter2) {
        return add(baseValueSplitter.getQuarter(quarter1), baseValueSplitter.getQuarter(quarter2));
    }

    private Integer getProductOfQuarters(int quarter1, int quarter2) {
        return multiply(quarter1, quarter2);
    }

    Integer getSumOfFirstHalves() {
        return getSumOfQuarters(1,2);
    }

    Integer getSumOfSecondHalves() {
        return getSumOfQuarters(3,4);
    }

    Integer getProductOfFirstQuarterAndThirdQuarter() {
        return getSumOfQuarters(1,2);
    }

    Integer getProductOfFirstQuarterAndFourthQuarter() {
        return multiply(baseValueSplitter.getQuarter(1), baseValueSplitter.getQuarter(4));
    }

    @Override
    public Integer multiply(Integer value1, Integer value2) {
        return null;
    }
}
