package N30000_39999.N34000_34999;

import java.util.*;
import java.io.*;

public class N34217 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int C = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        System.out.println(
                (A+C) < (B+D) ? "Hanyang Univ." :
                (A+C) > (B+D) ? "Yongdap" : "Either"
        );
    }
}