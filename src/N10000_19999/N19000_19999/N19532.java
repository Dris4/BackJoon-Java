package N10000_19999.N19000_19999;

import java.util.Scanner;

public class N19532 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //정수들 배열로 받기
        int[] arr = new int[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();
        }

        //x와 y의 유일수 찾기
        int x = 0;
        int y = 0;
        finding:
        for(x = -999; x<=999; x++){
            for(y = -999; y<=999; y++) {
                if(arr[0]*x + arr[1]*y == arr[2]
                        && arr[3]*x + arr[4]*y == arr[5]){
                    break finding;
                }
            }
        }

        //답 출력
        System.out.println(x + " " + y);
    }
}
