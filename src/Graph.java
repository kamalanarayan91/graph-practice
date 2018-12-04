import java.util.HashMap;

public class Graph {

    HashMap<Integer, GraphNode> nodes;

    Graph() {
        nodes = new HashMap<>();
    }

    public void addEdge(int source, int destination) {
        GraphNode src = nodes.get(source);
        GraphNode dst = nodes.get(destination);

        src.adjacent.add(dst);
    }

    public void addNode(int id) {
        GraphNode node = new GraphNode(id);
        nodes.put(id, node);
    }
}
