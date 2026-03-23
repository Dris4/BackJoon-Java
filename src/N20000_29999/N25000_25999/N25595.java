package N20000_29999.N25000_25999;

import java.util.*;
import java.io.*;

public class N25595 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] stage = new int[N*N];
        StringTokenizer st;
        for(int i=0; i<N*N; i+=N){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                stage[i+j] = Integer.parseInt(st.nextToken());
            }
        }

        int[] noujen = new int[2];
        for(int y=0; y<N; y++){
            for(int x=0; x<N; x++){
                if(stage[x + y*N] == 2){
                    noujen[0] = x;
                    noujen[1] = y;
                    break;
                }
            }
        }

        for(int y=0; y<N; y++){
            for(int x=0; x<N; x++){
                if(stage[x + y*N] == 1 && (noujen[0] + noujen[1])%2 == (x+y)%2){
                    System.out.println("Kiriya");
                    return;
                }
            }
        }
        System.out.println("Lena");
    }
}
