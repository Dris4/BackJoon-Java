package N1000_9999.N4000_4999;

import java.util.Scanner;

public class N4101 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            long A = sc.nextLong();
            long B = sc.nextLong();
            if(A == 0 && B == 0){break;}
            System.out.println(A > B ? "Yes" : "No");
        }
    }
}
