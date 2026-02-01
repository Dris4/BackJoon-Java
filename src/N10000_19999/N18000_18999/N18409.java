package N10000_19999.N18000_18999;

import java.util.Scanner;

public class N18409 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();     //문자열 길이
        sc.nextLine();
        String S = sc.nextLine(); //문자열
        int result = 0;

        for(int i = 0; i < N; i++){
            char c = S.charAt(i);
            if("aeiou".contains(c + "")){ result++; }
        }

        System.out.println(result);
    }
}
