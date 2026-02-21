package N20000_29999.N29000_29999;

import java.util.*;
import java.io.*;

public class N29699 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine()) % 14;

        String sentence = "CWelcomeToSMUP";
        System.out.println(sentence.charAt((int)N));
    }
}
