package N20000_29999.N25000_25999;

import java.util.*;
import java.io.*;

public class N25966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        int[][] arr = new int[N][M];
        for(int y=0; y<N; y++){
            st = new StringTokenizer(br.readLine());
            for(int x=0; x<M; x++){
                arr[y][x] = Integer.parseInt(st.nextToken());
            }
        }

        int i, j, k;
        while(q --> 0){
            st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());
            if(command == 0){
                i = Integer.parseInt(st.nextToken());
                j = Integer.parseInt(st.nextToken());
                k = Integer.parseInt(st.nextToken());
                arr[i][j] = k;
            }
            else{
                i = Integer.parseInt(st.nextToken());
                j = Integer.parseInt(st.nextToken());
                for(int x=0; x<M; x++){
                    k = arr[i][x];
                    arr[i][x] = arr[j][x];
                    arr[j][x] = k;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int y=0; y<N; y++){
            for(int x=0; x<M; x++){
                sb.append(arr[y][x]).append(' ');
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
