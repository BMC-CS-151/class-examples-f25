class MatrixGraphImpl {
    private int numV; 
    private int capacity;
    private Integer[][] data; 

    MatrixGraphImpl(int capacity) {
        this.capacity = capacity;
        this.numV = 0;
        data = new Integer[capacity][capacity];
    }

    MatrixGraphImpl() {
        this.capacity = 100;
        this.numV = 0;
        data = new Integer[capacity][capacity];
    }

    public void addVertex() {
        if (this.numV+1 >= capacity) {
            //expand O(n^2)
        }         

        for (int j=0; j<=numV; j++) {
            data[numV][j] = 0;
        }

        for(int i=0; i<=numV; i++) {
            data[i][numV+1] = 0;
        }

        numV += 1;
    }

    //Add a directed edge from v to w
    public void addEdge(int v, int w) {
        data[v][w] = 1;
    }

    //Remove a vertex from the graph
    public void removeVertex(int v) {
        for (int j=0; j<=numV; j++) {
            data[v][j] = null;
        }

        for (int i=0; i<=numV; i++) {
            data[i][v] = null;
        }

    }

    //Remove the edge from v to w
    public void removeEdge(int v, int w) {
        data[v][w] = 0;
    }

    public void printGraph() {
        for (int v = 0; v < numV; v++) {
            if (data[v][0] == null) continue;
            System.out.println("Adjacency matrix vertex " + v);
            for (int v2 = 0; v2 < numV; v2++) {
                System.out.print(data[v][v2] + " ");
            }

            System.out.println("\n");
        }
    }

    public void dfs() {
        int[] visited = new int[numV];
        System.out.println("Depth First Traversal");
        dfs(0, visited); 
    }

    public void dfs(int v, int[] visited) {
        System.out.println(v);

        int[] children = children(v);
        for (int i=0; i<children.length; i++) {
            if (children[i] == 1 && visited[i] == 0) {
                visited[i] = 1;
                dfs(i, visited);
            }
        }
    }

    private int[] children(int v) {
        int[] children = new int[numV];
        for (int i=0; i<numV; i++) {
            if (data[v][i] == 1) {
                children[i] = 1;
            }
        }

        return children;
    }

    public static void main(String[] args) {
        // Create a directed graph with 5 vertices
        MatrixGraphImpl graph = new MatrixGraphImpl();
        //add 5 vertices (0, 1, 2, 3, and 4)
        graph.addVertex();
        graph.printGraph();
        graph.addVertex();
        graph.addVertex();
        graph.addVertex();
        graph.addVertex();
        graph.printGraph();
        return;

        /*
        // Add edges
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 4);
        graph.addEdge(3, 1);
        graph.addEdge(4, 3);

        // Add a 5th vertex and an edge
        graph.addVertex();
        graph.addEdge(4, 5);

        // Print the adjacency list representation of the graph
        graph.printGraph();

        graph.dfs();

        graph.removeEdge(0, 1);
        graph.removeVertex(4);

        // Print the modified graph
        System.out.println("After removing edge (0, 1) and vertex 4:");
        graph.printGraph();
        */
    }
}
