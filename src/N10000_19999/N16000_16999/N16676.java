package N10000_19999.N16000_16999;

import java.util.*;
import java.io.*;

public class N16676 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());

        //0~10 = 1개
        //11~110 = 2개
        //111~1110 = 3개
        //1111~11110 = 4개

        long max = 0;
        long count = 1;
        while(true){
            max += (long)Math.pow(10, count);
            if(N <= max){
                System.out.println(count);
                return;
            }
            count++;
        }
    }
}
