package N20000_29999.N24000_24999;

import java.util.*;
import java.io.*;

public class N24078 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int X = Integer.parseInt(br.readLine());
        bw.write((X%21) + "");
        bw.flush();
        bw.close();
    }
}
