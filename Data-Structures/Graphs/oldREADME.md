# Graphs


### Directed vs Undirected Graphs
Directed graphs have a direction associated with an edge. While in undirected there is no such thing. 

So if there is an edge between vertex A and B

- Then in directed graph, the path A-B is not same as B-A
- In undirected graph, both paths are same and exist

### Cyclic vs Acyclic Graph
- Cyclic graphs have cycle in them that is a path might bring us back to same vertex from where we started
- Acyclic graphs do not have cycles in them

### Sparse vs Dense Graphs
- Dense graph is a graph in which no.of edges is huge(close to maximal number of edges)
- Sparse graph is a graph in which no.of edges is less(close to minimal number of edges)

### Representations of a Graph

There are two ways to represent a graph namely Adjacency List and Adjacency Matrix.


#### Adjacency List
Adjacency List representation provides a compact way to represent sparse graphs - those for which |E| is much less than |V|^2

- The adjacency list representation of graph G = (V,E) consists of an array Adj of |V| lists, one for each vertex in V. - For each u ∈ V, the adjacency list Adj[u] consists of all the vertices v such that there is an edge (u,v) ∈ E. That is Adj[u] consists of all the vertices adjacent to u in G.
- For directed graph, sum of lengths of all adjacency lists is |E|. For undirected graph this value is equal to 2 * |E| since if (u,v) is an undirected edge, then u appears in v's adjacency list and v appears in u's adjacency list.
- Space required for this would be theta(V+E) i.e., its exactly bound to V+E at least from the lower end.
- For weighted graph, we simply store the weight w(u,v) of the edge (u,v) ∈ E with vertex v in u's adjacency list.
- A potential disadvantage of the this representation is that it provides no quicker way to determine whether a given edge (u,v) is present in the graph than to search for v in the adjacency list Adj[u].

#### Adjacency Matrix
We may prefer an adjacency matrix representation however when the graph is dense - |E| is close to |V|^2 - or when we need to be able to tell quickly if there is an edge connecting two given vertices.

- If a graph G=(V,E), we assume that vertices are numbered 1,2,...|V| in some arbitrary manner, then adjacency matrix representation of a graph G consists of |V| x |V| matrix A = aij
where
    aij = 1 if (i,j) ∈ E
    aij = 0 otherwise
- Adjacency matrix of a graph requires theta(V^2) memory, independent of the number of edges in the graph.
- For undirected graph, matrix representation is symmetrical. That is A = A transpose .So in some cases, we can cut the memory down by half exploiting this property of undirected graphs.
- For weighted graph, instead of storing a 1 in matrix, we simply store its corresponding weights.
- These are quite simple to implement and they carry an added advantage for undirected graphs; they require only one bit per entry.

#### Some extra definitions
- Degree: The degree of a vertex is number of edges that are connected to that vertex.
- In-degree: (Only applicable for directed graphs) Represents the number of edges incoming to a vertex(i.e entering the vertex)
- Out-degree: (Only applicable for directed graphs) Represents the number of edges outgoing from the vertex(i.e leaving the vertex)

### Breadth First Search
Given a graph G = (V,E) and a distinguished source vertex s, breadth-first search systematicay explores edges of G to discover every vertex that is reachable from s. It also produces a breadth-first tree with root s that contains all reachable vertices. 

BFS is so named coz it expands the frontier between discovered and undiscovered vertices uniformly across the breadth of the frontier. That is, the algorithm discovers all the vertices at distance k from s before discovering any vertices at distance k + 1.

- White vertex: Not visited at all
- Gray vertex: Means that it might have neighbors which are white vertices
- Black vertex: All its neighbor vertices have been visited at least once(meaning they are gray or black)

The algorithm from the textbook:
Conventions:
- u.color is the color for vertex u
- u.pred stores the predecessor of u(NIL for no predecessor)
- u.d holds the distance from source s to vertex u computed by the algorithm.

BFS(G, s)
    for each vertex u ∈ G.V - {s}
        u.color = WHITE
        u.d = infinite
        u.pred = NIL
    s.color = GRAY
    s.d = 0
    s.pred = NIL
    Q = Φ
    ENQUEUE(Q, s)
    while Q != Φ
        u = DEQUEUE(Q)
        for each v ∈ G.Adj[u]
            if v.color == WHITE
                v.color = GRAY
                v.d = u.d + 1
                v.pred = u
                ENQUEUE(Q, v)
        u.color = BLACK

TC: O(V + E)