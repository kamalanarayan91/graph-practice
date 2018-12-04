import java.util.HashSet;

public class DFS {

    public static void dfs(GraphNode node, HashSet<GraphNode> visited) {
        if (visited.contains(node)) {
            return;
        }
        System.out.println(node.id);
        visited.add(node);
        for (GraphNode neighbour : node.adjacent) {
            dfs(neighbour, visited);
        }

    }
}
