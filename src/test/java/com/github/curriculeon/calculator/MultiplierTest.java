package com.github.curriculeon.calculator;

import com.github.curriculeon.IterativeMultiplier;
import com.github.curriculeon.KaratsubaMultiplier;
import org.junit.Test;

public class MultiplierTest {
    @Test
    public void testKaratsubaMultiplier() {
        // given
        MultiplierTester multiplierTest = new MultiplierTester(KaratsubaMultiplier::new, 9999, 9999);

        // when
        // then
        multiplierTest.test();
    }

    @Test
    public void testIterativeMultiplier() {
        // given
        MultiplierTester multiplierTest = new MultiplierTester(IterativeMultiplier::new, 9999, 9999);

        // when
        // then
        multiplierTest.test();
    }
}
