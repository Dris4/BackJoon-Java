package N20000_29999.N21000_21999;

import java.util.*;
import java.io.*;

public class N21966 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String S = br.readLine();
        if(N<=25){
            System.out.println(S);
            return;
        }

        StringBuilder sb = new StringBuilder();

        for(int i=11; i<N-11; i++){
            if(S.charAt(i) == '.'){
                if(i==N-12){
                    sb.append(S, 0, 11).append("...").append(S, N-11, N);
                }
                else{
                    sb.append(S, 0, 9).append("......").append(S, N-10, N);
                }
                System.out.println(sb);
                return;
            }
        }
        sb.append(S, 0, 11).append("...").append(S, N-11, N);
        System.out.println(sb);
    }
}
