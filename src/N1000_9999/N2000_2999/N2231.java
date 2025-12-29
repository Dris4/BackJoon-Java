package N1000_9999.N2000_2999;

import java.util.Scanner;

public class N2231 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = 0;

        for(int i = N; i > 0; i--){
            int j = i;
            int add = i;

            //각 자릿수의 숫자 반환
            while (j > 0) {
                int digit = j % 10;
                add += digit;
                j /= 10;
            }

            if(add == N){
                result = i;
            }
        }

        System.out.println(result);
    }
}
