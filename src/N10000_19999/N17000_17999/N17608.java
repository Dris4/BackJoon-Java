package N10000_19999.N17000_17999;

import java.util.*;
import java.io.*;

public class N17608 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int max = 0;
        int count = 0;
        for(int j=N-1; j>=0; j--){
            if(arr[j] > max) {
                max = arr[j];
                count++;
            }
        }
        System.out.println(count);
    }
}