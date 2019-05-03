## Undirected Graphs

#### API for implementation

###### constructor
Graph(int V) - create a V vertex graph with no edges

Graph(In in) - read a graph from input Stream in

###### methods
int V() - number of vertices
int E() - number of edges
void addEdge(int v, int w) - add edge v-w to this graph
Iterable<Integer> adj(int v) - vertices adjacent to v
String toString() - string representation

#### Order of growth performance for typical Graph implementations
| underlying data structure | space | add edge v-w | check whether w is adjacent to v | iterate through vertices adjacent to v |
|---------------------------|-------|--------------|----------------------------------|----------------------------------------|
|List of Edges|E|1|E|E|
|Adjacency Matrix|V^2|1|1|V|
|Adjacency Lists|E + V|1|degree(v)|degree(v)|
|Adjacency Sets|E + V|log v|log(v)|log(v) + degree(v)|

#### Depth First Search
