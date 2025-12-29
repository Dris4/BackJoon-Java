package N1000_9999.N2000_2999;

import java.util.Scanner;

public class N2798 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //N: 카드 개수, M: 제한
        int N = sc.nextInt();
        int M = sc.nextInt();

        //정수들 배열로 받기
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int result = 0;
        for(int x=0; x<N; x++){
            for(int y=x+1; y<N; y++){
                for(int z=y+1; z<N; z++){
                    int k = arr[x] + arr[y] + arr[z];
                    if(k <= M && k > result){
                        result = k;
                    }
                }
            }
        }

        System.out.println(result);
    }
}
