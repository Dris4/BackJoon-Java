package N1000_9999.N1000_1999;

import java.io.*;
import java.util.*;

public class N1018{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        //체스판 배열로 받기
        char[][] arr = new char[N][M];
        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine().toCharArray();
        }

        //M - ? = 8, ? = M - 8
        int min = 64;
        for (int i = 0; i < N-7; i++) {
            for(int j = 0; j < M-7; j++) {

                //부분 체스판과 정상 체스판 비교
                int max = 0;
                char start = arr[i][j];
                for(int y=0; y<8; y++){
                    for(int x=0; x<8; x++){
                        //[0, 0]이 W라 가정
                        if(((y+x)%2==0 && arr[i+y][j+x]!='W')
                                || ((y+x)%2!=0 && arr[i+y][j+x]!='B')){
                            max++;
                        }
                    }
                }
                max = Math.min(max, 64-max); //B의 경우는 64-W 와 동일
                min = Math.min(min, max);
                max = 0;
            }
        }
        System.out.println(min);
    }
}