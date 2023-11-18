import java.util.*;
public class Graph {
    static class Edge {
        int src;
        int dest;
        int wt;
        Edge(int s, int d, int w) {
            this.src=s;
            this.dest=d;
            this.wt = w;
        }
    }

    public static void main(String[] args) {
        int v =5;
        ArrayList<Edge>[] graph = new ArrayList[v];
        for(int i=0;i<v;i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 5));
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 2));
        graph[4].add(new Edge(4, 2, 2));
        //graph[2].add(new Edge(2, 4, 2));
        for(int i=0;i<graph[1].size();i++) {
            Edge e = graph[1].get(i);
            System.out.println(e.dest);
        }

    }
}
