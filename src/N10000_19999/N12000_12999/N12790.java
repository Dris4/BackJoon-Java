package N10000_19999.N12000_12999;

import java.util.*;
import java.io.*;

public class N12790 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] stat = new int[4];
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        while(T --> 0){
            st = new StringTokenizer(br.readLine()); //hp, mp, atk, def
            for(int i=0; i<4; i++){
                stat[i] = Integer.parseInt(st.nextToken());
            }
            for(int j=0; j<4; j++){
                stat[j] += Integer.parseInt(st.nextToken());
            }
            if(stat[0]<1){
                stat[0] = 1;
            }
            if(stat[1]<1){
                stat[1] = 1;
            }
            if(stat[2]<0){
                stat[2] = 0;
            }

            int result = stat[0] + 5*stat[1] + 2*stat[2] + 2*stat[3];
            sb.append(result).append('\n');
        }
        System.out.println(sb);
    }
}
