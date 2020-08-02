package com.github.curriculeon;

import com.github.curriculeon.utils.Multiplicable;
import com.github.curriculeon.utils.MultiplierInterface;

public class SimpleCalculator implements Multiplicable {
    private MultiplierInterface multiplier;

    public SimpleCalculator(MultiplierInterface multiplier) {
        this.multiplier = multiplier;
    }

    @Override
    public MultiplierInterface getMultiplier() {
        return multiplier;
    }
}
