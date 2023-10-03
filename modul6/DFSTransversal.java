import java.util.*;

public class DFSTransversal {
    private LinkedList<Integer> adj[];
    private boolean visited[];

    DFSTransversal(int v){
        adj = new LinkedList[v];
        visited = new boolean[v];

        for (int i = 0;i < v; i++){
            adj[i] = new LinkedList<Integer>();
        }
    }

    void insertEdge(int src,int dest){
        adj[src].add(dest);
    }

    void DFS(int vertex ){
        visited[vertex] = true;
        System.out.print(vertex + " ");

        Iterator<Integer> it = adj[vertex].listIterator();
        while (it.hasNext()){
            int n = it.next();
            if(!visited[n])
                DFS(n);

        }
    }

    public static void main(String[] args) {
        DFSTransversal graph = new DFSTransversal(12);
        graph.insertEdge(1,2);
        graph.insertEdge(1,4);
        graph.insertEdge(2,1);
        graph.insertEdge(2,5);
        graph.insertEdge(4,6);
        graph.insertEdge(4,6);
        graph.insertEdge(5,2);
        graph.insertEdge(5,3);
        graph.insertEdge(5,7);
        graph.insertEdge(5,9);
        graph.insertEdge(6,7);
        graph.insertEdge(7,6);
        graph.insertEdge(7,11);
        graph.insertEdge(8,9);
        graph.insertEdge(8,11);
        graph.insertEdge(9,5);
        graph.insertEdge(9,8);
        graph.insertEdge(11,7);
        graph.insertEdge(11,10);
        System.out.println("Depth First Tranversal for the graph is :");
        graph.DFS(1);
    }
}
