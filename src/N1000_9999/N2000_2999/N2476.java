package N1000_9999.N2000_2999;

import java.util.*;
import java.io.*;

public class N2476 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st;
        int[] eyes = new int[3];
        int max = 0;
        while(N --> 0){
            st = new StringTokenizer(br.readLine());
            for(int i=0; i<3; i++){
                eyes[i] = Integer.parseInt(st.nextToken());
            }
            eyes = sort(eyes);

            if(eyes[0] == eyes[1] && eyes[1] == eyes[2]){
                max = Math.max(max, 10000 + eyes[0]*1000);
            }
            else if(eyes[0] == eyes[1] || eyes[1] == eyes[2]){
                max = Math.max(max, 1000 + eyes[1]*100);
            }
            else{
                max = Math.max(max, eyes[2]*100);
            }
        }
        System.out.println(max);
    }

    public static int[] sort(int[] arr){
        int temp;
        if(arr[0] > arr[1]){
            temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
        }
        if(arr[0] > arr[2]){
            temp = arr[0];
            arr[0] = arr[2];
            arr[2] = temp;
        }
        if(arr[1] > arr[2]){
            temp = arr[1];
            arr[1] = arr[2];
            arr[2] = temp;
        }
        return arr;
    }
}
