package N10000_19999.N15000_15999;

import java.util.*;
import java.io.*;

public class N15829 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        String s = br.readLine();

        long result = 0;
        for (int i=s.length()-1; i>=0; i--) {
            int n = s.charAt(i) - 96;
            result = (result * 31 + n) % 1234567891;
        }

        System.out.println(result);
    }
}