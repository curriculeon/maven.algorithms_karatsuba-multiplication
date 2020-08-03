package com.github.curriculeon.calculator;

import com.github.curriculeon.utils.MultiplierInterface;
import org.junit.Assert;
import org.junit.Test;

import java.util.function.Supplier;

public class MultiplierTester {
    private final Supplier<MultiplierInterface> multiplierGenerator;
    private final Integer maxBaseValue;
    private final Integer maxMultiplierValue;

    public MultiplierTester(Supplier<MultiplierInterface> calculator, Integer maxBaseValue, Integer maxMultiplierValue) {
        this.multiplierGenerator = calculator;
        this.maxBaseValue = maxBaseValue;
        this.maxMultiplierValue = maxMultiplierValue;
    }

    private void test(int baseValue, int numberOfTimesToCountBaseValue) {
        // given
        int expected = baseValue * numberOfTimesToCountBaseValue;

        // when
        int actual = multiplierGenerator
                .get()
                .multiply(baseValue, numberOfTimesToCountBaseValue);

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test() {
        for (int i = 0; i < maxBaseValue; i++) {
            for (int j = 0; j < maxMultiplierValue; j++) {
                test(i, j);
            }
        }
    }
}
