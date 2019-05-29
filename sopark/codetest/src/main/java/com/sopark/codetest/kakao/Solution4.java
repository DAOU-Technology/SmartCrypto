package com.sopark.codetest.kakao;

/**
 * Error Digit Range Solution2
 */
public class Solution4 {
    public static long findRange(int num) {
        return findMaxValue(num) - findMinValue(num);
    }

    static long findMaxValue(int num) {
        char[] chars = String.valueOf(num).toCharArray();
        char replaceTo = '9';
        char target = findReplaceTarget(chars, 0, chars.length, replaceTo);
        return replace(chars, replaceTo, target);
    }

    static long findMinValue(int num) {
        if (num == 1) return 1L;

        char[] chars = String.valueOf(num).toCharArray();
        if (chars[0] == '1') {
            char replaceTo = '0';
            int from = 1;
            for (int i = 1; i < chars.length; i++) {
                if (chars[i] != '1') {
                    from = i;
                    break;
                }
            }
            char target = findReplaceTarget(chars, from, chars.length, replaceTo);
            if (target == chars[0]) return Long.valueOf(new String(chars));
            return replace(chars, replaceTo, target);
        } else {
            char replaceTo = '1';
            char target = findReplaceTarget(chars, 0, chars.length, replaceTo);
            return replace(chars, replaceTo, target);
        }
    }

    private static char findReplaceTarget(char[] chars, int from, int to, char replaceTo) {
        for (int i = from; i < to; i++) {
            if (chars[i] != replaceTo) return chars[i];
        }
        return 'x';
    }

    private static long replace(char[] chars, char replaceTo, char target) {
        return Long.valueOf(new String(chars).replaceAll(String.valueOf(target), String.valueOf(replaceTo)));
    }
}
