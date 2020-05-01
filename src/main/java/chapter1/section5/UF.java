package chapter1.section5;

public abstract class UF {
    protected int[] id;
    protected int count;
    /**
     * initialize N sites with integer names (0 ~ N-1)
     * @param N size of sites
     */
    public UF(int N) {
        count = N;
        id = new int[N];
        for (int i = 0; i < N; i++)
            id[i] = i;
    }

    /**
     * add connection between p and q
     * @param p site p
     * @param q site q
     */
    public abstract void union(int p, int q);

    /**
     * find component identifier for p (0 ~ N-1)
     * @param p site p
     * @return component identifier for p
     */
    public abstract int find(int p);

    /**
     * if p and q are in the same component
     * @param p site p
     * @param q site q
     * @return true if p and q are in the same component
     */
    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    /**
     * number of components
     * @return number of components
     */
    public int count() {
        return count;
    }
}
