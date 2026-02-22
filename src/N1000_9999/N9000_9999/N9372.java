package N1000_9999.N9000_9999;

import java.util.*;
import java.io.*;

public class N9372 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        while(T --> 0){
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            System.out.println(N-1);

            while(M-->0){
                br.readLine();
            }
        }
    }
}