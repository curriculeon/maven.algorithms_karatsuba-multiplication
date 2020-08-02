package com.github.curriculeon.calculator;

import com.github.curriculeon.utils.MultiplierInterface;
import org.junit.Assert;

public class MultiplyTest {
    private final MultiplierInterface calculator;

    public MultiplyTest(MultiplierInterface calculator) {
        this.calculator = calculator;
    }

    private void test(int baseValue, int numberOfTimesToCountBaseValue) {
        // given
        int expected = baseValue * numberOfTimesToCountBaseValue;

        // when
        int actual = calculator.multiply(baseValue, numberOfTimesToCountBaseValue);

        //then
        Assert.assertEquals(expected, actual);
    }
}
