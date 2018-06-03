package Factory;

import Model.Graph;

import java.util.Comparator;

/**
 * Created by User on 03.06.2018.
 */
public class Composite {
    private Graph graph = new Graph();
    private boolean isBfs;

    public Composite(boolean isBfs) {
        this.isBfs = isBfs;
    }

    public void Find() throws InstantiationException, IllegalAccessException {
        if (isBfs) {
            IteratorCreator<BFS> bfs = new IteratorCreator<>(BFS.class);
            BFS create = bfs.Create();
        }
        else
        {
            IteratorCreator<DFS> dfs = new IteratorCreator<>(DFS.class);
            DFS create = dfs.Create();
        }
    }
}
