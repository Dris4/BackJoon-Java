package N1000_9999.N2000_2999;

import java.util.*;
import java.io.*;

public class N2675 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for(int i = 0; i<T; i++){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            String s = st.nextToken();
            for(int j = 0; j<s.length(); j++){
                System.out.print(("" + s.charAt(j)).repeat(n));
            }
            System.out.print("\n");
        }
    }
}