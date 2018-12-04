import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    public static void bfs(GraphNode node) {
        HashSet<GraphNode> visited = new HashSet<>();

        Queue<GraphNode> queue = new LinkedList<>();

        queue.add(node);

        while (!queue.isEmpty()) {
            GraphNode head = queue.poll();
            System.out.println(head.id);
            visited.add(head);
            for (GraphNode neighbour : head.adjacent) {
                if (!visited.contains(neighbour)) {
                    queue.offer(neighbour);
                }
            }
        }
    }
}
