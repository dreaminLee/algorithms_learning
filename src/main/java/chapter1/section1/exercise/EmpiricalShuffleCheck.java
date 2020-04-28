package chapter1.section1.exercise;

import edu.princeton.cs.algs4.StdRandom;

// exercise 1.1.36: Empirical shuffle check

public class EmpiricalShuffleCheck {
    public static void check(int N, int M) {
        int[] array = new int[M];
        int[][] table = new int[M][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M;j++)
                array[j] = j;
            StdRandom.shuffle(array);
            for (int j = 0; j < M; j++)
                for (int k = 0; k < M; k++)
                    if (array[j] == k)
                        table[j][k]++;
        }

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                System.out.printf("%d ", table[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        check(500000, 10);
    }
}
