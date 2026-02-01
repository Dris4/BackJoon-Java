package N1000_9999.N2000_2999;

import java.util.*;
import java.io.*;

public class N2475 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        List<Integer> nums = new ArrayList<>();
        for(int i = 0; i<5; i++){
            nums.add(Integer.parseInt(st.nextToken()));
        }

        int result = 0;
        for(int n : nums){
            result += n*n;
        }

        bw.write(result%10 + "");
        bw.flush();
        bw.close();
    }
}
