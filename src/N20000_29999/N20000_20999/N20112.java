package N20000_29999.N20000_20999;

import java.util.*;
import java.io.*;

public class N20112 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        char[][] list = new char[N][N];
        for(int y=0; y<N; y++){
            list[y] = br.readLine().toCharArray();
        }

        for(int i = 0; i<N; i++){
            for(int j = i; j<N; j++){
                if(list[i][j] != list[j][i]){
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println("YES");
    }
}
