import java.util.*;

public class Vertex<V> {
    private V data;
    private Map<Vertex<V>, Double> adjacentVertices;

    public Vertex(V data) {
        this.data = data;
        this.adjacentVertices = new HashMap<>();
    }

    public V getData() {
        return data;
    }

    public void addAdjacent(Vertex<V> destination, double weight) {
        adjacentVertices.put(destination, weight);
    }

    public Map<Vertex<V>, Double> getAdjacent() {
        return adjacentVertices;
    }

    @Override
    public String toString() {
        return data.toString();
    }
}