package chapter1.section4;

import chapter1.section1.BinarySearch;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class TwoSum {
    public static int count(int[] a, int sum) {
        int N = a.length;
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (a[i] + a[j] == sum)
                    cnt++;
            }
        }
        return cnt;
    }

    public static int count_fast(int[] a, int sum) {
        Arrays.sort(a);
        int N = a.length;
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            if (BinarySearch.rank(sum-a[i], a) > i) {
                cnt++;
            }
        }
        return cnt;
    }

    // exercise 1.4.15
    public static int count_faster(int[] a, int sum) {
        Arrays.sort(a);
        int cnt = 0;
        int start = 0, end = a.length - 1;
        while (start < end) {
            if (a[start] + a[end] > sum) end--;
            else if (a[start] + a[end] < sum) start++;
            else {
                cnt++;
                start++;
                end--;
            }
        }
        return cnt;
    }
}
