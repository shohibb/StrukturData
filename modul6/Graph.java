import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    private LinkedList<Integer> adj[];
    private boolean visited[];

    Graph(int v) {
        adj = new LinkedList[v];
        visited = new boolean[v];

        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<Integer>();
        }
    }

    void insEdge(int src, int dest) {
        adj[src].add(dest);
    }

    void DFS(int vertex) {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        Iterator<Integer> it = adj[vertex].listIterator();
        while (it.hasNext()) {
            int n = it.next();
            if (!visited[n])
                DFS(n);
        }
    }

    void BFS(int start) {
        boolean[] visited = new boolean[adj.length];
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.offer(start);

        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            System.out.print(vertex + " ");

            Iterator<Integer> it = adj[vertex].listIterator();
            while (it.hasNext()) {
                int n = it.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.offer(n);
                }
            }
        }
    }

    public static void main(String[] args) {
        Graph g = new Graph(12);
        g.insEdge(1, 2);
        g.insEdge(1, 4);
        g.insEdge(2, 1);
        g.insEdge(2, 5);
        g.insEdge(4, 6);
        g.insEdge(5, 2);
        g.insEdge(5, 3);
        g.insEdge(5, 7);
        g.insEdge(5, 9);
        g.insEdge(6, 7);
        g.insEdge(7, 6);
        g.insEdge(7, 11);
        g.insEdge(8, 9);
        g.insEdge(8, 11);
        g.insEdge(9, 5);
        g.insEdge(9, 8);
        g.insEdge(11, 7);
        g.insEdge(11, 10);

        System.out.println("Depth First Traversal:");
        g.DFS(1);
        System.out.println("\nBreadth First Traversal:");
        g.BFS(1);
    }
}