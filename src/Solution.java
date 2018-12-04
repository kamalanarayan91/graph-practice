import java.util.HashSet;

class Solution {

    public static void main(String[] args) {
        Solution s = new Solution();
        Graph graph = new Graph();
        graph.addNode(0);
        graph.addNode(1);
        graph.addNode(2);
        graph.addNode(3);
        graph.addEdge(0,1);
        graph.addEdge(0, 2);
        graph.addEdge(2,0);
        graph.addEdge(2,3);
        graph.addEdge(1,2);
        graph.addEdge(3,3);

        System.out.println(":DFS:");
        DFS.dfs(graph.nodes.get(2), new HashSet<>());
        System.out.println(":BFS:");
        BFS.bfs(graph.nodes.get(2));
    }
}