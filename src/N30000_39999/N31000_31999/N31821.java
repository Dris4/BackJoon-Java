package N30000_39999.N31000_31999;

import java.util.*;
import java.io.*;

public class N31821 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] menu = new int[N];
        for(int i=0; i<N; i++){
            menu[i] = Integer.parseInt(br.readLine());
        }

        int cost = 0;
        int number;
        int M = Integer.parseInt(br.readLine());
        while(M --> 0){
            number = Integer.parseInt(br.readLine());
            cost += menu[number-1];
        }

        System.out.println(cost);
    }
}
