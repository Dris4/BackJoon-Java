package N10000_19999.N14000_14999;

import java.util.*;
import java.io.*;

public class N14471 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        List<Integer> arr = new ArrayList<>();
        int count = 0;
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if(a>=N){
                count++;
            }
            else{
                arr.add(b-N);
            }

            if(count >= M-1){
                System.out.println(0);
                return;
            }
        }

        Collections.sort(arr);
        int result = 0;
        for(int j=0; j<(M-1)-count; j++){
            result += arr.get(j);
        }
        System.out.println(result);
    }
}