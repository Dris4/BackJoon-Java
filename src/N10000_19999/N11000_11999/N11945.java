package N10000_19999.N11000_11999;

import java.util.*;
import java.io.*;

public class N11945 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        StringBuilder sb;
        for(int i = 0; i<N; i++){
            sb = new StringBuilder(br.readLine());
            sb.reverse();
            System.out.println(sb);
        }
    }
}