package chapter1.section5;

public class UFQuickUnion extends UF {
    /**
     * initialize N sites with integer names (0 ~ N-1)
     *
     * @param N size of sites
     */
    public UFQuickUnion(int N) {
        super(N);
    }

    @Override
    public void union(int p, int q) {
        int p_root = find(p), q_root = find(q);
        if (p_root == q_root) return;
        id[p_root] = q_root;
        count--;
    }

    @Override
    public int find(int p) {
        while (p != id[p]) p = id[p];
        return p;
    }
}
