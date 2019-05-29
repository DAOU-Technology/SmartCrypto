package com.sopark.codetest.kakao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution2 {
    public static List<Integer> getMaxElementIndexes(List<Integer> a, List<Integer> rotate) {

        int max = a.get(0);
        int maxIndex = 0;
        for (int i = 0; i < a.size(); i++) {
            int num = a.get(i);
            if (num > max) {
                max = num;
                maxIndex = i;
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int count : rotate) {
            int cnt = count % a.size();
            if (cnt == 0) {
                result.add(maxIndex);
                continue;
            }
            int diff = maxIndex - cnt;

            if (diff >= 0) {
                result.add(diff);
            } else {
                result.add(a.size() + diff);
            }
        }

        return result;
    }
}
