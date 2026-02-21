package N10000_19999.N14000_14999;

import java.util.*;
import java.io.*;

public class N14893 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int lengthN = Integer.parseInt(st.nextToken());
        byte[] N = new byte[lengthN];
        byte[] M = new byte[lengthN];

        int U = Integer.parseInt(st.nextToken());
        for(int i=0; i<U; i++){
            //비트 연산
            st = new StringTokenizer(br.readLine());
            int L = Integer.parseInt(st.nextToken()) -1;
            int R = Integer.parseInt(st.nextToken());
            for(;L<R;L++){ M[L] ^= 1; }

            //배열 비교
            if (getBigger(N, M) == M) {
                System.arraycopy(M, 0, N, 0, lengthN);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int j : N){ sb.append(j); }
        System.out.println(sb);
    }

    public static byte[] getBigger(byte[] N, byte[] M){
        for(int i=0; i<N.length ;i++){
            if(N[i] > M[i]){
                return N;
            }
            if(N[i] < M[i]){
                return M;
            }
        }
        return M;
    }
}
