package N20000_29999.N28000_28999;

import java.util.*;
import java.io.*;

public class N28701 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        long Ns = 0;
        for(int i=1; i<=N; i++){
            Ns += i;
        }
        sb.append(Ns).append("\n")
          .append((long)Math.pow(Ns, 2)).append("\n");

        Ns = 0;
        for(int i=1; i<=N; i++){
            Ns += (long)Math.pow(i, 3);
        }
        sb.append(Ns);

        System.out.println(sb);
    }
}
