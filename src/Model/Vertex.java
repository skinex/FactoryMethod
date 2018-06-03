package Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 03.06.2018.
 */
public class Vertex {
    private List<Edge> edges = new ArrayList<>();

    public List<Edge> getEdges() {
        return edges;
    }

    public void setEdges(List<Edge> edges) {
        this.edges = edges;
    }
}
