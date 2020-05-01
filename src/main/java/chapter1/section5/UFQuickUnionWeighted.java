package chapter1.section5;

import java.util.Arrays;

public class UFQuickUnionWeighted extends UFQuickUnion {
    // weights of sites
    private int[] weights;
    /**
     * initialize N sites with integer names (0 ~ N-1)
     *
     * @param N size of sites
     */
    public UFQuickUnionWeighted(int N) {
        super(N);
        weights = new int[N];
        Arrays.fill(weights, 1);
    }

    @Override
    public void union(int p, int q) {
        int p_root = find(p), q_root = find(q);
        if (p_root == q_root) return;

        if (weights[p_root] < weights[q_root]) {
            id[p_root] = q_root;
            weights[q_root] += weights[p_root];
        }
        else {
            id[q_root] = p_root;
            weights[p_root] += weights[q_root];
        }
        count--;
    }
}
