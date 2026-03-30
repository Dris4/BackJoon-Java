package N20000_29999.N25000_25999;

import java.util.*;
import java.io.*;

public class N25400 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        int count = 0;
        int finding = 1;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            if(finding == Integer.parseInt(st.nextToken())){
                finding++;
                count++;
            }
        }

        bw.write(N-count + "");
        bw.flush();
        bw.close();
    }
}
