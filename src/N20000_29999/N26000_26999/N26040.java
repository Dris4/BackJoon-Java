package N20000_29999.N26000_26999;

import java.util.*;
import java.io.*;

public class N26040 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(br.readLine());

        while(st.hasMoreTokens()){
            String alpabet = st.nextToken();
            s = s.replaceAll(alpabet, alpabet.toLowerCase());
        }

        System.out.println(s);
    }
}
