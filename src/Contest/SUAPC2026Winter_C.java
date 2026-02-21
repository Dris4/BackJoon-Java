package Contest;

import java.util.*;
import java.io.*;

//못풀었음

public class SUAPC2026Winter_C {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int b = Integer.parseInt(st.nextToken());
        int count = Integer.parseInt(st.nextToken());

        int i = 1;
        int n;
        int length;
        String s;
        while(count!=0){
            n = i;
            s = Integer.toString(n, b);

            length = s.length();
            if(n % length == 0){
                while(true){
                    n /= length;
                    s = Integer.toString(n / length, b);

                    if(s.length() == 1){ //찾음
                        System.out.println(i);
                        count--;
                        break;
                    }
                    else if(n % length != 0){ // 한 자리 수가 안됨
                        break;
                    }
                }
            }
            i++;
        }
    }
}
