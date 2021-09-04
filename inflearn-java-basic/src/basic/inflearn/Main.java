package basic.inflearn;

import java.util.*;

public class Main {

    static class Edge implements Comparable<Edge> {
        int vex;
        int cost;
        Edge (int vex, int cost) {
            this.vex = vex;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge o) {
            return this.cost - o.cost;
        }
    }
    public void solution(int n, int m, ArrayList<ArrayList<Edge>> graph, int[] dis, int v) {
        PriorityQueue<Edge> pq = new PriorityQueue<>();

        pq.offer(new Edge(v, 0));
        dis[v] = 0;

        while (!pq.isEmpty()) {
            Edge cur = pq.poll();
            int vex = cur.vex;
            int cost = cur.cost;

            if (cost > dis[vex]) continue;
            for (Edge e : graph.get(vex)) {
                if (di)
            }
        }

    }

    public static void main(String[] args) {

        //Input:    6 9
        //          1 2 12 // 1번 정점에서 2번정점으로 가는데 12의 비용이 든다.
        //          1 3 4
        //          2 1 2
        //          2 3 5
        //          2 5 5
        //          3 4 5
        //          4 2 2
        //          4 5 5
        //          6 4 5
        //Output:   6 9
        //          1 2 12 // 1번 정점에서 2번정점으로 가는데 12의 비용이 든다.
        //          1 3 4
        //          2 1 2
        //          2 3 5
        //          2 5 5
        //          3 4 5
        //          4 2 2
        //          4 5 5
        //          6 4 5

        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int m = kb.nextInt();

        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();

        for (int i=0; i<n-1; i++) {
            graph.add(new ArrayList<Edge>());
        }
        int[] dis = new int[n+1];
        Arrays.fill(dis, Integer.MAX_VALUE);

        for (int i=0; i<m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            int c = kb.nextInt();

            graph.get(a).add(new Edge(b, c));
        }

        T.solution(n, m, graph, dis, 1);

        for (int i=2; i<n+1; i++) {
            if (dis[i] != Integer.MAX_VALUE) System.out.println(i + " : " + dis[i]);
            else System.out.println(i + " : impossible");
        }
    }
}