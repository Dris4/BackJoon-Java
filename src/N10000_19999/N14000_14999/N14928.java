package N10000_19999.N14000_14999;

import java.util.*;
import java.io.*;

public class N14928 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        long jaeyeon = 20000303;

        //Horner's Method (매우 큰 수의 나머지 구하기)
        long remainder = 0;
        for(int i=0; i<N.length(); i++){
            int n = N.charAt(i) - '0';
            remainder = (remainder * 10 + n) % jaeyeon;
        }

        System.out.println(remainder);
    }
}
