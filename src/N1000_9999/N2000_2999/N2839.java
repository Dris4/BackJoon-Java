package N1000_9999.N2000_2999;

import java.io.*;

public class N2839 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int bag = 0;

        while(N >= 0){
            if(N%5 == 0){
                bag += N/5;
                System.out.println(bag);
                return;
            }
            N -= 3;
            bag++;
        }
        System.out.println(-1);
    }
}
