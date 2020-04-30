package chapter1.section4;

import chapter1.section1.BinarySearch;
import util.ArrayOperations;

import java.util.Arrays;

public class ThreeSum {
    public static int count(int[] a, int sum) {
        int N = a.length;
        int cnt = 0;
        for (int i = 0; i < N; i++)
            for (int j = i + 1; j < N; j++)
                for (int k = j + 1; k < N; k++)
                    if (a[i] + a[j] + a[k] == sum)
                        cnt++;
        return cnt;
    }

    public static int count_fast(int[] a, int sum) {
        Arrays.sort(a);
        int N = a.length;
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (BinarySearch.rank(sum - a[i] - a[j], a) > j)
                    cnt++;
            }
        }
        return cnt;
    }

    public static int count_faster(int[] a, int sum) {
        Arrays.sort(a);
        int cnt = 0;
        for (int i = 0; i < a.length; i++) {
            int start = i + 1, end = a.length - 1;
            while (start < end) {
                if (a[start] + a[end] > sum - a[i]) end--;
                else if (a[start] + a[end] < sum - a[i]) start++;
                else {
                    cnt++;
                    start++;
                    end--;
                }
            }
        }
        return cnt;
    }
}
