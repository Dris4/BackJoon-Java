package N10000_19999.N10000_10999;

import java.util.*;
import java.io.*;

public class N10162 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        sb.append(T/300).append(" ");
        T = T%300;

        sb.append(T/60).append(" ");
        T = T%60;

        sb.append(T/10);
        T = T%10;

        if(T != 0){
            System.out.println(-1);
            return;
        }
        System.out.println(sb);
    }
}