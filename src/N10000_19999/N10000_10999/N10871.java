package N10000_19999.N10000_10999;

import java.util.*;
import java.io.*;

public class N10871 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++){
            int a = Integer.parseInt(st.nextToken());
            if(a < X) sb.append(a).append(" ");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
