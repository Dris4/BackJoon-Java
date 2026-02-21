package Contest;

import java.io.*;
import java.util.*;

public class SUAPC2026Winter_M {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[6];
        for(int i=0; i<6; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        //(, ((, ), )), (), )(

        int one = 0;
        if(arr[5] == 0){
            one = Math.min(arr[0], arr[2]) * 2;
        }
        else{
            one = Math.min(arr[0], arr[2])*2   + arr[5];
        }

        int two = Math.min(arr[1], arr[3]) * 4;

        System.out.println(one + two + arr[4]*2);
    }
}
