package N20000_29999.N27000_27999;

import java.util.*;
import java.io.*;

public class N27323 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        bw.write((A*B) + "");
        bw.flush();
        bw.close();
    }
}
