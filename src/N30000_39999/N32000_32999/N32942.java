package N30000_39999.N32000_32999;

import java.util.*;
import java.io.*;

public class N32942 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        boolean[][] graph = new boolean[11][11];
        for (int x=1; x<=10; x++) {
            for (int y=1; y<=10; y++) {
                if (A*x + B*y == C) {
                    graph[x][y] = true;
                }
            }
        }

        for (int x=1; x<=10; x++) {
            boolean hasNeighbor = false;
            for (int y=1; y<=10; y++) {
                if (graph[x][y]) {
                    System.out.println(y);
                    hasNeighbor = true;
                }
            }
            if (!hasNeighbor) {
                System.out.println(0);
            }
        }
    }
}