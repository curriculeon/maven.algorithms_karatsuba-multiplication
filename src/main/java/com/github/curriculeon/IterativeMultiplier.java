package com.github.curriculeon;

import com.github.curriculeon.utils.AbstractMultiplier;

public class IterativeMultiplier extends AbstractMultiplier {
    public IterativeMultiplier(Integer baseValue, Integer multiplierValue) {
        super(baseValue, multiplierValue);
    }

    @Override
    public Integer multiply(Integer value1, Integer value2) {
        int total = 0;
        for(int i=0; i<value2; i=add(i,1)) {
            total = this.add(total, value1);
        }
        return total;
    }
}
