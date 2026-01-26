package N1000_9999.N1000_1999;

import java.io.*;
import java.util.*;
import java.util.PriorityQueue;

public class N1753 {
    static final int INF = Integer.MAX_VALUE;
    static int V, E, K;
    static ArrayList<Node>[] graph;
    static int[] dist;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(br.readLine()); // 시작 정점 번호

        // 2. 그래프 및 최단거리 배열 초기화
        graph = new ArrayList[V + 1];
        dist = new int[V + 1];

        for (int i = 1; i <= V; i++) {
            graph[i] = new ArrayList<>();
        }
        Arrays.fill(dist, INF);

        // 3. 간선 정보 입력받기
        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            graph[u].add(new N1000_9999.N1000_1999.Node(v, w));
        }

        // 4. 다익스트라 실행
        dijkstra(K);

        // 5. 결과 출력 (StringBuilder 활용)
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= V; i++) {
            if (dist[i] == INF) sb.append("INF\n");
            else sb.append(dist[i]).append("\n");
        }
        System.out.print(sb);
    }

    // 다익스트라 핵심 로직
    public static void dijkstra(int start) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(start, 0));
        dist[start] = 0;

        while (!pq.isEmpty()) {
            Node node = pq.poll();
            int d = node.distance;
            int now = node.index;

            // 1. 이미 처리된 적 있는 노드라면 무시 (핵심 최적화!)
            if (dist[now] < d) continue;

            // 2. 현재 노드와 연결된 다른 인접 노드들을 확인
            for (Node neighbor : graph[now]) {
                int cost = dist[now] + neighbor.distance;
                // 3. 더 짧은 경로를 찾았다면 갱신하고 큐에 삽입
                if (cost < dist[neighbor.index]) {
                    dist[neighbor.index] = cost;
                    pq.offer(new Node(neighbor.index, cost));
                }
            }
        }
    }
}

// 노드 정보를 담을 클래스 (거리와 번호)
class Node implements Comparable<Node> {
    int index, distance;
    Node(int index, int distance) {
        this.index = index;
        this.distance = distance;
    }
    // 우선순위 큐에서 거리가 짧은 순으로 정렬되도록 설정
    @Override
    public int compareTo(Node o) {
        return this.distance - o.distance;
    }
}