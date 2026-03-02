package N1000_9999.N2000_2999;

import java.util.*;
import java.io.*;

public class N2920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] nums = new int[8];
        for(int i=0; i<8; i++){
            nums[i] = Integer.parseInt(st.nextToken());
        }

        if(nums[0] == 1){
            int count = 1;
            for(int n : nums){
                if(n == count){
                    if(count==8){
                        System.out.println("ascending");
                        return;
                    }
                    count++;
                }
                else{
                    System.out.println("mixed");
                    return;
                }
            }
        }
        else{
            int count = 8;
            for(int n : nums){
                if(n == count){
                    if(count==1){
                        System.out.println("descending");
                        return;
                    }
                    count--;
                }
                else{
                    System.out.println("mixed");
                    return;
                }
            }
        }
    }
}
