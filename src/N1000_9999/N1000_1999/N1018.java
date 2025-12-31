package N1000_9999.N1000_1999;

import java.util.*;

public class N1018{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();

        //체스판 배열로 받기
        char[][] arr = new char[N][M];
        for (int i = 0; i < N; i++) {
            String line = sc.nextLine();
            for(int j = 0; j < M; j++) {
                arr[i][j] = line.charAt(j);
            }
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
                max = Math.min(max, 64-max);
                min = Math.min(min, max);
                max = 0;
            }
        }
        System.out.println(min);
    }
}