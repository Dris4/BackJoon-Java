package N1000_9999.N2000_2999;

import java.util.*;
import java.io.*;

public class N2720 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long T = Long.parseLong(br.readLine());

        StringBuilder sb;
        while(T-->0){
            int cost = Integer.parseInt(br.readLine());
            sb = new StringBuilder();
            sb.append(cost/25).append(" ");
            cost = cost%25;

            sb.append(cost/10).append(" ");
            cost = cost%10;

            sb.append(cost/5).append(" ");
            cost = cost%5;

            sb.append(cost).append(" ");
            System.out.println(sb);
        }
    }
}
