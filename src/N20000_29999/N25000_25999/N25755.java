package N20000_29999.N25000_25999;

import java.util.*;
import java.io.*;

public class N25755 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        char W = st.nextToken().charAt(0);
        int N = Integer.parseInt(st.nextToken());

        int[] arr = new int[N*N];
        for(int i=0; i<N*N; i+=N){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                arr[i+j] = Integer.parseInt(st.nextToken());
            }
        }
        arr = flip(arr, W, N);

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N*N; i+=N){
            for(int j=0; j<N; j++){
                int n = i+j;
                if(arr[n]==2){
                    sb.append(5).append(' ');
                }
                else if(arr[n]==5){
                    sb.append(2).append(' ');
                }
                else if(arr[n]==1){
                    sb.append(1).append(' ');
                }
                else if(arr[n]==8){
                    sb.append(8).append(' ');
                }
                else{
                    sb.append('?').append(' ');
                }
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }

    public static int[] flip(int[] arr, char W, int N){
        int temp;
        if(W == 'L' || W == 'R'){
            for(int i=0; i<N*N; i+=N){
                for(int j=0; j<N/2; j++){
                    temp = arr[i+j];
                    arr[i+j] = arr[i+N-1-j];
                    arr[i+N-1-j] = temp;
                }
            }
        }
        else{
            for(int i=0; i<N; i++){
                for(int j=0; j<N*N/2; j+=N){
                    temp = arr[i+j];
                    arr[i+j] = arr[i+N*(N-1) - j];
                    arr[i+N*(N-1) - j] = temp;
                }
            }
        }
        return arr;
    }
}
