package N20000_29999.N27000_27999;

import java.util.*;
import java.io.*;

public class N27160 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] cards = new int[4];
        StringTokenizer st;
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            String fruit = st.nextToken();
            if (fruit.equals("STRAWBERRY")) {
                cards[0] += Integer.parseInt(st.nextToken());
            } else if (fruit.equals("BANANA")) {
                cards[1] += Integer.parseInt(st.nextToken());
            } else if (fruit.equals("LIME")) {
                cards[2] += Integer.parseInt(st.nextToken());
            } else {
                cards[3] += Integer.parseInt(st.nextToken());
            }
        }

        for(int j=0; j<4; j++){
            if(cards[j] == 5){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
