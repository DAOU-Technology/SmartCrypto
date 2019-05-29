package com.sopark.codetest.kakao;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Solution1Test {

    @Test
    public void solution() {
        // Given
        Solution1 solution = new Solution1();

        // When
        List<Integer> result = solution.solution(Arrays.asList(1, 4, 4, 8));

        // That
        assertThat(result).isEqualTo(Arrays.asList(1, 2, 2, 3));
    }

    @Test
    public void solution2() {
        // Given
        Solution1 solution = new Solution1();

        // When
        List<Integer> result = solution.solution(Arrays.asList(18, 60, 92, 35, 5, 97, 65));

        // That
        Assert.assertEquals(Arrays.asList(
                2,
                4,
                6,
                3,
                1,
                7,
                5), result);

    }
}
