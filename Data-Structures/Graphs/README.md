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