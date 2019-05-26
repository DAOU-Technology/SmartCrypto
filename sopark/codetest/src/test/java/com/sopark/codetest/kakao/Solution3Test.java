package com.sopark.codetest.kakao;

import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;

public class Solution3Test {

    @Test
    public void aaaa(){
        // Given
        String aa = "1234";
        // When
        System.out.println(Integer.valueOf(String.valueOf(aa.charAt(0))));

        // Then

    }

    @Test
    public void solution() {
        // Given
        Solution3 solution = new Solution3();

        // When
        int result = solution.solution(123512);

        // Then
        assertThat(result).isEqualTo(820082);
    }


    @Test
    public void solution2() {
        // Given
        Solution3 solution = new Solution3();

        // When
        int result = solution.solution(999999);

        // Then
        assertThat(result).isEqualTo(820082);
    }

    @Test
    public void solution3(){
        Solution3 solution3 = new Solution3();
        assertThat(solution3.findMaxValue(123512)).isEqualTo(923592);
        assertThat(solution3.findMinValue(123512)).isEqualTo(103510);
        assertThat(solution3.solution(123512)).isEqualTo(820082);

        assertThat(solution3.findMaxValue(909)).isEqualTo(999);
        assertThat(solution3.findMinValue(909)).isEqualTo(101);
        assertThat(solution3.solution(909)).isEqualTo(898);

        assertThat(solution3.findMaxValue(999)).isEqualTo(888);
        assertThat(solution3.findMinValue(999)).isEqualTo(111);
        assertThat(solution3.solution(999)).isEqualTo(777);

        assertThat(solution3.findMaxValue(1)).isEqualTo(9);
        assertThat(solution3.findMinValue(1)).isEqualTo(2);
        assertThat(solution3.solution(1)).isEqualTo(7);

        assertThat(solution3.findMaxValue(9)).isEqualTo(8);
        assertThat(solution3.findMinValue(9)).isEqualTo(1);
        assertThat(solution3.solution(9)).isEqualTo(7);

        assertThat(solution3.findMaxValue(111)).isEqualTo(999);
        assertThat(solution3.findMinValue(111)).isEqualTo(222);
        assertThat(solution3.solution(111)).isEqualTo(777);
    }

    @Test
    public void findMaxValue(){
        // Given
        Solution3 solution3 = new Solution3();

        // When
        int maxValue = solution3.findMaxValue(123512);

        // Then
        assertThat(maxValue).isEqualTo(923592);
    }

    @Test
    public void findMinValue(){
        // Given
        Solution3 solution3 = new Solution3();

        // When
        int minValue = solution3.findMinValue(123512);

        // Then
        assertThat(minValue).isEqualTo(103510);
    }
}
