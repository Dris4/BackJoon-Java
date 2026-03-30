package N10000_19999.N16000_16999;

import java.util.*;
import java.io.*;

public class N16916 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        String P = br.readLine();

        if (kmp(S, P)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    public static int[] getPi(String p) {
        int[] pi = new int[p.length()];
        int j = 0;
        for (int i = 1; i < p.length(); i++) {
            while (j > 0 && p.charAt(i) != p.charAt(j)) {
                j = pi[j - 1];
            }
            if (p.charAt(i) == p.charAt(j)) {
                pi[i] = ++j;
            }
        }
        return pi;
    }

    public static boolean kmp(String s, String p) {
        int[] pi = getPi(p);
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            while (j > 0 && s.charAt(i) != p.charAt(j)) {
                j = pi[j - 1];
            }
            if (s.charAt(i) == p.charAt(j)) {
                if (j == p.length() - 1) {
                    return true;
                } else {
                    ++j;
                }
            }
        }
        return false;
    }
}
