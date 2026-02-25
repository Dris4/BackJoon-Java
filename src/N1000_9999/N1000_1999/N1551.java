package N1000_9999.N1000_1999;

import java.util.*;
import java.io.*;

public class N1551 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        String[] arr = br.readLine().split(",");
        int[] A = new int[N];
        for(int i=0; i<N; i++){
            A[i] = Integer.parseInt(arr[i]);
        }

        StringBuilder sb = new StringBuilder();
        int[] B = cal_arr(A, N, K);
        for(int k : B){
            sb.append(k).append(',');
        }
        sb.deleteCharAt(sb.toString().length()-1);
        System.out.println(sb);
    }

    public static int[] cal_arr(int[] A, int N, int K){
        if(K==0){
            return A;
        }
        int[] B = new int[N-1];
        for(int j=0; j<N-1; j++){
            B[j] = A[j+1] - A[j];
        }
        return cal_arr(B, N-1, K-1);
    }
}