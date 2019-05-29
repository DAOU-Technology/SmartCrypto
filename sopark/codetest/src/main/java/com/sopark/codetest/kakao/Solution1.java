package com.sopark.codetest.kakao;

import java.util.*;
import java.util.stream.Collectors;

public class Solution1 {
    public List<Integer> solution(List<Integer> issuePriorities) {
        Set<Integer> numbers = new HashSet<>(issuePriorities);
        List<Integer> list = numbers.stream().sorted().collect(Collectors.toList());
        return issuePriorities.stream().map(integer -> list.indexOf(integer) + 1).collect(Collectors.toList());
    }
}
