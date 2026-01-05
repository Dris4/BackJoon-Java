package N1000_9999.N1000_1999;

import java.io.*;
import java.util.StringTokenizer;

public class N1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        int number = 665;
        while(N != 0){
            number++;
            if(String.valueOf(number).contains("666")){
                N--;
            }
        }

        System.out.println(number);
    }
}
