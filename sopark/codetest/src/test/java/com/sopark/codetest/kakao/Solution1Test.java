package com.sopark.codetest.kakao;

import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;

public class Solution1Test {

    @Test
    public void solution() {
        // Given
        Solution1 solution = new Solution1();

        // When
        Integer[] result = solution.solution(new Integer[]{1, 4, 4, 8});

        // That
        assertThat(Arrays.toString(result)).isEqualTo(Arrays.toString(new int[]{1,2,2,3}));
    }

    @Test
    public void solution2() {
        // Given
        Solution1 solution = new Solution1();

        // When
        Integer[] result = solution.solution(new Integer[]{1,3,7,3});

        // That
        assertThat(Arrays.toString(result)).isEqualTo(Arrays.toString(new int[]{1,2,3,2}));
    }
}
