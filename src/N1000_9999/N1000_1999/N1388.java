package N1000_9999.N1000_1999;

import java.io.*;
import java.util.*;

public class N1388 {
    static int N, M;
    static char[][] floor;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        floor = new char[N][M];
        for (int i = 0; i < N; i++) {
            floor[i] = br.readLine().toCharArray();
        }

        visited = new boolean[N][M];
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (!visited[i][j]) {
                    dfs(i, j);
                    count++;
                }
            }
        }

        System.out.println(count);
    }

    static void dfs(int r, int c) {
        visited[r][c] = true;

        char current = floor[r][c];
        if (current == '-') {
            if (c + 1 < M && floor[r][c + 1] == '-' && !visited[r][c + 1]) {
                dfs(r, c + 1);
            }
        } else {
            if (r + 1 < N && floor[r + 1][c] == '|' && !visited[r + 1][c]) {
                dfs(r + 1, c);
            }
        }
    }
}