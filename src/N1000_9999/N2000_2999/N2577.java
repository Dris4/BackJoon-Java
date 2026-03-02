package N1000_9999.N2000_2999;

import java.util.*;
import java.io.*;

public class N2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long A = Long.parseLong(br.readLine());
        long B = Long.parseLong(br.readLine());
        long C = Long.parseLong(br.readLine());

        String[] ABC = (A*B*C + "").split("");
        int[] nums = new int[10];
        for(String n : ABC){
            for(int i=0; i<10; i++){
                if(Integer.parseInt(n) == i){
                    nums[i]++;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int j : nums){
            sb.append(j).append("\n");
        }
        System.out.println(sb);
    }
}
