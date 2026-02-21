package N1000_9999.N2000_2999;

import java.util.*;
import java.io.*;

public class N2562 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = 0;
        int lndex = 0;
        for(int i=1; i<=9; i++){
            int n = Integer.parseInt(br.readLine());
            if(n > max){
                max = n;
                lndex = i;
            }
        }

        String s = max + "\n" + lndex;
        System.out.println(s);
    }
}