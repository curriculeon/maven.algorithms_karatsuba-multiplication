package com.github.curriculeon.calculator;

import com.github.curriculeon.IterativeMultiplier;
import org.junit.Test;

public class IterativeMultiplierTest {
    @Test
    public void test() {
        // given
        MultiplierTester multiplierTest = new MultiplierTester(IterativeMultiplier::new, 9999, 9999);

        // when
        // then
        multiplierTest.test();
    }
}
