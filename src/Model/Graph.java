package Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 03.06.2018.
 */
public class Graph {
    public List<Vertex> getVertices() {
        return vertices;
    }

    public void setVertices(List<Vertex> vertices) {
        this.vertices = vertices;
    }

    private List<Vertex> vertices = new ArrayList<>();
}
