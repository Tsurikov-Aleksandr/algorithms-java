package top150.graphgeneral.graphtraversals;


import java.util.Iterator;
import java.util.LinkedList;

class GraphDFS {
    private final LinkedList<Integer>[] adjLists;
    private final boolean[] visited;

    // Создание графа
    GraphDFS(int vertices) {
        adjLists = new LinkedList[vertices];
        visited = new boolean[vertices];

        for (int i = 0; i < vertices; i++)
            adjLists[i] = new LinkedList<Integer>();
    }

    // Добавление ребер
    void addEdge(int src, int dest) {
        adjLists[src].add(dest);
    }

    // Алгоритм
    void DFS(int vertex) {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        Iterator<Integer> ite = adjLists[vertex].listIterator();
        while (ite.hasNext()) {
            int adj = ite.next();
            if (!visited[adj])
                DFS(adj);
        }
    }

    public static void main(String[] args) {
        GraphDFS g = new GraphDFS(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 3);

        System.out.println("Following is Depth First Traversal");

        g.DFS(2);
    }
}