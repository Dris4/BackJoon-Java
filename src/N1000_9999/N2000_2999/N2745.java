package N1000_9999.N2000_2999;

import java.util.*;
import java.io.*;

public class N2745 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());

        //사실 System.out.println(Integer.parseInt(N, B)); 로 바로 해결 된다.

        StringBuilder sb = new StringBuilder(N);
        N = sb.reverse().toString();
        long result = 0;
        for(int i=0; i<N.length(); i++){
            char n = N.charAt(i);
            if(65 <= n && n <= 90){
                result += (long)Math.pow(B, i) * ((int)n - 55); //65~90
            }
            else{
                result += (long)Math.pow(B, i) * ((int)n - 48); //48~57
            }
        }

        System.out.println(result);
    }
}