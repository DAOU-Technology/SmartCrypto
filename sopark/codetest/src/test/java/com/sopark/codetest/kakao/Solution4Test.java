package com.sopark.codetest.kakao;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

public class Solution4Test {

    @Test
    public void findRange() {
        assertThat(Solution4.findMaxValue(909)).isEqualTo(999);
        assertThat(Solution4.findMinValue(909)).isEqualTo(101);
        assertThat(Solution4.findRange(909)).isEqualTo(898);

        assertEquals(1, Solution4.findMinValue(2));
        assertEquals(8, Solution4.findRange(2));
        assertEquals(8, Solution4.findRange(1));
        assertEquals(8, Solution4.findRange(9));

        // case1
        assertEquals(10, Solution4.findMinValue(10));
        assertEquals(90, Solution4.findMaxValue(10));
        assertEquals(80, Solution4.findRange(10));

        // case2
        assertEquals(11, Solution4.findMinValue(11));
        assertEquals(88, Solution4.findRange(11));
    }

    @Test
    public void findMinValue() {
        assertEquals(9, Solution4.findMaxValue(1));
        assertEquals(9, Solution4.findMaxValue(2));
        assertEquals(9, Solution4.findMaxValue(9));
        assertEquals(90, Solution4.findMaxValue(10));
        assertEquals(99, Solution4.findMaxValue(11));
        assertEquals(92, Solution4.findMaxValue(12));

        assertEquals(1, Solution4.findMinValue(1));
        assertEquals(1, Solution4.findMinValue(2));
        assertEquals(1, Solution4.findMinValue(3));
        assertEquals(1, Solution4.findMinValue(4));
        assertEquals(10, Solution4.findMinValue(10));
        assertEquals(11, Solution4.findMinValue(11));
        assertEquals(10, Solution4.findMinValue(12));
        assertEquals(10, Solution4.findMinValue(13));
        assertEquals(10, Solution4.findMinValue(20));
        assertEquals(11, Solution4.findMinValue(21));
        assertEquals(11, Solution4.findMinValue(22));
        assertEquals(13, Solution4.findMinValue(23));
        assertEquals(101, Solution4.findMinValue(121));
        assertEquals(101, Solution4.findMinValue(131));
        assertEquals(110, Solution4.findMinValue(112));

        assertEquals(923592, Solution4.findMaxValue(123512));
        assertEquals(113511, Solution4.findMinValue(223512));
        assertEquals(103510, Solution4.findMinValue(123512));

        assertEquals(100000000, Solution4.findMinValue(100000000));
        assertEquals(900000000, Solution4.findMaxValue(100000000));
        assertEquals(800000000, Solution4.findRange(100000000));


    }

}
