import java.util.ArrayList;
import java.util.List;

public class GraphNode {

    int id;
    List<GraphNode> adjacent;

    GraphNode(int id) {
        this.id = id;
        adjacent = new ArrayList<>();
    }
}
