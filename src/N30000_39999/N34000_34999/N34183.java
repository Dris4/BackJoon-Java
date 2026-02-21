package N30000_39999.N34000_34999;

import java.util.*;
import java.io.*;

public class N34183 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long N = Long.parseLong(st.nextToken());
        long M = Long.parseLong(st.nextToken());
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        long result = (N*3 - M) * A + B;
        if(N*3 < M) result = 0;

        bw.write(result + "");
        bw.flush();
        bw.close();
    }
}
