package N20000_29999.N25000_25999;

import java.util.*;
import java.io.*;

public class N25630 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String s = br.readLine();
        Deque<Byte> deque = new ArrayDeque<>();
        for(int i=0; i<N; i++){
            if(s.charAt(i) == 's'){
                deque.addFirst((byte)0);
            }
            else{
                deque.addFirst((byte)1);
            }
        }

        int count = 0;
        for(int i=0; i<N/2; i++){
            byte first = deque.pollFirst();
            byte last = deque.pollLast();
            if(first != last){
                count++;
            }
        }

        System.out.println(count);
    }
}
