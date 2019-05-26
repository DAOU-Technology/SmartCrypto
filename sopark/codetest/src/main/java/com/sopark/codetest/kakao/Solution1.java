package com.sopark.codetest.kakao;

import java.util.*;
import java.util.stream.Collectors;

public class Solution1 {
    public Integer[] solution(Integer[] data) {
        Set<Integer> numbers = Arrays.stream(data).collect(Collectors.toSet());
        List<Integer> list = numbers.stream().sorted().collect(Collectors.toList());
        return Arrays.stream(data).map(integer -> list.indexOf(integer) + 1).toArray(Integer[]::new);
    }
}
