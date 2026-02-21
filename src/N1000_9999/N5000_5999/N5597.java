package N1000_9999.N5000_5999;

import java.util.*;

public class N5597 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Integer> classnum = new ArrayList<>();

        for(int i=0;i<28;i++){
            classnum.add(sc.nextInt());
        }

        for(int i=1;i<=30;i++){
            if(!classnum.contains(i)){
                System.out.println(i);
            }
        }
    }
}
