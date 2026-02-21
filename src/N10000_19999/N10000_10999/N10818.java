package N10000_19999.N10000_10999;

import java.util.*;
import java.io.*;

public class N10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        for(int i=0; i<N; i++){
            long n = Long.parseLong(st.nextToken());
            if(n > max){ max = n; }
            if(n < min){ min = n; }
        }
        System.out.println(min+" "+max);
    }
}
