package N30000_39999.N32000_32999;

import java.util.*;
import java.io.*;

public class N32953 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        List<Integer> nums = new ArrayList<>();
        while(N --> 0){
            int K = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            while(K --> 0) {
                nums.add(Integer.parseInt(st.nextToken()));
            }
        }
        Collections.sort(nums);

        int result = 0;
        int current = 0;
        int count = 0;
        for(int n : nums){
            if(n == current){
                count += 1;
                if(count == M){
                    result += 1;
                }
            }
            else{
                current = n;
                count = 1;
                if(M == 1){
                    result += 1;
                }
            }
        }
        System.out.println(result);
    }
}
