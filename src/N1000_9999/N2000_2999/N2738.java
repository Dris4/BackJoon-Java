package N1000_9999.N2000_2999;

import java.util.*;
import java.io.*;

public class N2738 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N*M];
        for(int i = 0; i<N*M; i++){
            if(!st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<N*M; i++){
            if(!st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
            sb.append(arr[i] + Integer.parseInt(st.nextToken())).append(" ");
            if((i+1) % M == 0 && (i+1) != N*M) sb.append('\n');
        }

        System.out.print(sb);
    }
}
