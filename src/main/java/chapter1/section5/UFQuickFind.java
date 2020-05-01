package chapter1.section5;

public class UFQuickFind extends UF {
    public UFQuickFind(int N) {
        super(N);
    }

    @Override
    public void union(int p, int q) {
        int p_id = find(p), q_id = find(q);
        if (connected(p_id, q_id)) return; // p and q are in the same component
        int id_new = Math.min(p_id, q_id), id_old = Math.max(p_id, q_id);
        // when union, choose the smaller id as identifier for the component
        // so we don't need to iterate whole array
        for (int i = id_old; i < id.length; i++) {
            if (id[i] == id_old) id[i] = id_new;
        }
        // simply change id of components p to id of components q
        /*for (int i = 0; i < id.length; i++)
            if (id[i] == p_id) id[i] = q_id;*/
        count--;
    }

    @Override
    public int find(int p) {
        return id[p];
    }
}
