import java.util.Scanner;
import java.util.ArrayList;


class Cycle {

    private int nodes, edges;
    private int [][] adjacencyMatrix;
    private boolean [] visited;
    ArrayList<ArrayList<Integer>> cycles = new ArrayList<ArrayList<Integer>>();
    private  boolean [] finalCycles;

    public Cycle() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the no. of nodes: ");
        nodes = in.nextInt();
        System.out.print("Enter the no. of Edges: ");
        edges = in.nextInt();

        adjacencyMatrix = new int [nodes][nodes];
        visited = new boolean [nodes];

        for (int i = 0; i < nodes; i++) {
            visited[i] = false;
        }
