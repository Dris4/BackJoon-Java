package N20000_29999.N28000_28999;

import java.util.*;

public class N28062 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        //사탕 묶음
        List<Long> bundle = new ArrayList<>(N);
        for(int i=0;i<N;i++){ bundle.add(sc.nextLong()); }
        bundle.sort(Collections.reverseOrder());

        //짝수 개가 들어있는 묶음들 모두 더하기
        long result = 0;
        List<Long> odd = new ArrayList<>();
        for(int i=0;i<N;i++){
            if(bundle.get(i) % 2 == 0){
                result += bundle.get(i);
            }
            else{
                odd.add(bundle.get(i));
            }
        }

        //홀수 개가 들어있는 묶음들 가능한 만큼 더하기
        int oddsize = odd.size();
        if(oddsize % 2 != 0){ oddsize -= 1; }
        for(int i=0; i < oddsize; i++){ result += odd.get(i); }

        System.out.println(result);
    }
}
