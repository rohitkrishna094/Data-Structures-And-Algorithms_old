import java.util.Scanner;

public class BuildTest {
    public static void main(String[] args) {
        testStreamConstructor();
        testNormalConstructor();
    }

    public static void testStreamConstructor() {
        Scanner sc = new Scanner(System.in);
        Graph graph = new Graph(sc);

        // Testing all non-static methods
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Testing Stream Constructor");
        System.out.println("Testing non-static methods.....");
        System.out.println(graph.toString());
        System.out.println("----------------------------");
        System.out.println("Adjacency List Representation");
        System.out.println(graph.adj(0));
        System.out.println(graph.adj(1));
        System.out.println(graph.adj(2));
        System.out.println(graph.adj(3));
        System.out.println(graph.adj(4));
        System.out.println(graph.adj(5));
        System.out.println(graph.adjList());
        System.out.println("----------------------------");

        System.out.println("Number of vertices and edges");
        System.out.println("----------------------------");
        System.out.println(graph.V());
        System.out.println(graph.E());
        System.out.println("----------------------------");

        // Testing all static methods
        System.out.println();
        System.out.println("Testing all static methods.....");
        System.out.println("----------------------------");
        System.out.println("Degrees of each vertex");
        System.out.println(Graph.degree(graph, 0));
        System.out.println(Graph.degree(graph, 1));
        System.out.println(Graph.degree(graph, 2));
        System.out.println(Graph.degree(graph, 3));
        System.out.println(Graph.degree(graph, 4));
        System.out.println(Graph.degree(graph, 5));

        System.out.println("\nMax Degree, average Degree and numberOfSelfLoops of graph");
        System.out.println(Graph.maxDegree(graph));
        System.out.println(Graph.avgDegree(graph));
        System.out.println(Graph.numberOfSelfLoops(graph));
    }

    public static void testNormalConstructor() {
        Graph graph = new Graph(6);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);

        graph.addEdge(1, 2);
        graph.addEdge(1, 3);

        graph.addEdge(2, 3);

        graph.addEdge(3, 4);

        graph.addEdge(4, 5);

        // Testing all non-static methods
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Testing Normal Constructor");
        System.out.println("Testing non-static methods.....");
        System.out.println(graph.toString());
        System.out.println("----------------------------");
        System.out.println("Adjacency List Representation");
        System.out.println(graph.adj(0));
        System.out.println(graph.adj(1));
        System.out.println(graph.adj(2));
        System.out.println(graph.adj(3));
        System.out.println(graph.adj(4));
        System.out.println(graph.adj(5));
        System.out.println(graph.adjList());
        System.out.println("----------------------------");

        System.out.println("Number of vertices and edges");
        System.out.println("----------------------------");
        System.out.println(graph.V());
        System.out.println(graph.E());
        System.out.println("----------------------------");

        // Testing all static methods
        System.out.println();
        System.out.println("Testing all static methods.....");
        System.out.println("----------------------------");
        System.out.println("Degrees of each vertex");
        System.out.println(Graph.degree(graph, 0));
        System.out.println(Graph.degree(graph, 1));
        System.out.println(Graph.degree(graph, 2));
        System.out.println(Graph.degree(graph, 3));
        System.out.println(Graph.degree(graph, 4));
        System.out.println(Graph.degree(graph, 5));

        System.out.println("\nMax Degree, average Degree and numberOfSelfLoops of graph");
        System.out.println(Graph.maxDegree(graph));
        System.out.println(Graph.avgDegree(graph));
        System.out.println(Graph.numberOfSelfLoops(graph));
    }
}