package com.sopark.codetest.kakao;

import java.util.*;

/**
 * Error Digit Range Solution1
 */
public class Solution3 {

    public static long findRange(int data){
        long maxValue = findMaxValue(data);
        long minValue = findMinValue(data);
        return maxValue - minValue;
    }

    /*
    1. 최대값은 1~9 까지 돌려서 일치하는 숫자를 9로 치환. 같은 숫자는 제외
    2. 최소값은 1~9 까지 돌려서 일치하는 수를 0으로 치환. 단 자리수가 다르거나 처음수가 0이면 제외
    */

    public static long findMaxValue(int data) {
        List<Integer> numbers = getIntegers(data);
        Map<Integer, String> cachedResult = new HashMap<>();

        String firstValue = numbers.stream()
                .map(targetNumber -> {
                    int replaceNumber = 9;

                    String result = String.valueOf(data).replaceAll(String.valueOf(targetNumber), String.valueOf(replaceNumber));
                    if(cachedResult.containsKey(targetNumber)){
                        return cachedResult.get(targetNumber);
                    }else {
                        cachedResult.put(targetNumber, result);
                        return result;
                    }
                })
                .sorted(Collections.reverseOrder())
                .findFirst().get();

        return Long.valueOf(firstValue);
    }

    public static long findMinValue(int data) {
        List<Integer> numbers = getIntegers(data);
        String str = String.valueOf(data);
        Map<Integer, String> cachedResult = new HashMap<>();
        String firstValue = numbers.stream()
                .map(targetNumber -> {
                    int replaceNumber = 0;
                    String s = String.valueOf(targetNumber);
                    if(str.startsWith(s)){
                        replaceNumber = 1;
                    }

                    if(cachedResult.containsKey(targetNumber)){
                        return cachedResult.get(targetNumber);
                    } else {
                        String result = str.replaceAll(s, String.valueOf(replaceNumber));
                        cachedResult.put(targetNumber, result);
                        return result;
                    }
                })
                .sorted()
                .findFirst().get();

        return Long.valueOf(firstValue);
    }

    private static List<Integer> getIntegers(int data) {
        char[] charArray = String.valueOf(data).toCharArray();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < charArray.length; i++) {
            numbers.add(Integer.valueOf(String.valueOf(charArray[i])));
        }
        return numbers;
    }
}
