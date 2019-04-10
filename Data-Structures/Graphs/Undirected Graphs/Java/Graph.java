import java.util.*;

public class Graph {
    private int V;
    private int E;
    private List<List<Integer>> adj;

    public Graph(int V) {
        this.V = V;
        this.E = 0;
        adj = new ArrayList<List<Integer>>();
        for (int v = 0; v < V; v++) {
            adj.add(new ArrayList<Integer>());
        }
    }

    public Graph(Scanner sc) {
        this(sc.nextInt());
        int E = sc.nextInt();
        for (int i = 0; i < E; i++) {
            int v = sc.nextInt();
            int w = sc.nextInt();
            addEdge(v, w);
        }
    }

    public void addEdge(int v, int w) {
        adj.get(v).add(w); // add w to v's list
        adj.get(w).add(v);// add v to w's list
        this.E++;
    }

    // get all neighbors of this vertex v
    public List<Integer> adj(int v) {
        return this.adj.get(v);
    }

    // Number of vertices
    public int V() {
        return V;
    }

    // Number of edges
    public int E() {
        return E;
    }

    // return the entire adjacency list
    public List<List<Integer>> adjList() {
        return this.adj;
    }

    public String toString() {
        String s = V + " vertices, " + E + " edges\n";
        for (int v = 0; v < V; v++) {
            s += v + ": ";
            for (int w : adj.get(v))
                s += w + " ";
            s += "\n";
        }
        return s;
    }

    // Static methods

    // compute the degree of vertex v
    // degree is number of neighbors that this vertex has
    public static int degree(Graph G, int v) {
        return G.adj(v).size();
    }

    // compute maximum degree in this Graph
    // which vertex has the most neighbors and what is that number?
    public static int maxDegree(Graph G) {
        int maxDegree = Integer.MIN_VALUE;
        for (List<Integer> list : G.adjList()) {
            int temp = list.size();
            if (temp > maxDegree)
                maxDegree = temp;
        }
        return maxDegree;
    }

    // compute the average degree of this graph G
    public static int avgDegree(Graph G) {
        return 2 * G.E() / G.V();
    }

    // count self-loops
    public static int numberOfSelfLoops(Graph G) {
        int count = 0;
        for (int v = 0; v < G.V(); v++) {
            for (int w : G.adj(v))
                if (v == w)
                    count++;
        }
        return count / 2; // coz each edge would be counted twice for undirected graph
    }
}