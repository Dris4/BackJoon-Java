package N10000_19999.N10000_10999;

import java.util.*;
import java.util.stream.IntStream;

public class N10872 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = IntStream.range(1, N+1)
                              .reduce(1, (a, b) -> a*b);
        System.out.println(result);
    }
}
