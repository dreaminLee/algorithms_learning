package chapter1.section5.exercise;

import chapter1.section5.UF;
import chapter1.section5.UFQuickUnionWeighted;
import edu.princeton.cs.algs4.StdRandom;

public class ErdosRenyi {
    public static int count(int N) {
        UF uf = new UFQuickUnionWeighted(N);
        int connections = 0;
        while (uf.count() > 1) {
            int p = StdRandom.uniform(N), q = StdRandom.uniform(N);
            if (!uf.connected(p, q)) {
                uf.union(p, q);
            }
            connections++;
        }
        return connections;
    }
}
