package N10000_19999.N10000_10999;

import java.util.*;
import java.io.*;

public class N10870 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(fib(n));
    }
    public static int fib(int n) {
        if(n==0) return 0;
        if(n==1) return 1;

        int a = 0;
        int b = 1;
        for (int i=2; i<=n; i++) {
            int temp = a+b;
            a = b;
            b = temp;
        }
        return b;
    }
}
