package N30000_39999.N31000_31999;

import java.util.*;

public class N31429 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        String[] score = {
                "12 1600",
                "11 894",
                "11 1327",
                "10 1311",
                "9 1004",
                "9 1178",
                "9 1357",
                "8 837",
                "7 1055",
                "6 556",
                "6 773"
        };
        System.out.println(score[N-1]);
    }
}
