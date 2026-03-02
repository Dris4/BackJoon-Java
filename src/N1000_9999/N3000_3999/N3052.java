package N1000_9999.N3000_3999;

import java.util.*;
import java.io.*;

public class N3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> nums = new HashSet<>();
        for(int i=0; i<10; i++){
            nums.add(Integer.parseInt(br.readLine()) % 42);
        }
        System.out.println(nums.size());
    }
}
