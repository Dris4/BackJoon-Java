package N20000_29999.N29000_29999;

import java.util.*;
import java.io.*;

public class N29807 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] s = new int[5];
        for(int i = 0; i<N; i++){
            s[i] = Integer.parseInt(st.nextToken());
        }
        for(int j = N; j<5; j++){
            s[j] = 0;
        }

        //국, 수, 영, 탐구, 제2외국어 (1~5)
        //1) if 국>영 then (국-영) * 508 else (영-국) * 108
        //2) if 수>탐 then (수-탐) * 212 else (탐-수) * 305
        //3) if 외 then 외 * 707
        //답: ( 1) + 2) +3) ) * 4763

        int n1 = s[0] > s[2] ? (s[0] - s[2]) * 508 : (s[2] - s[0]) * 108;
        int n2 = s[1] > s[3] ? (s[1] - s[3]) * 212 : (s[3] - s[1]) * 305;
        int n3 = s[4] * 707;
        long result = ((long)n1 + n2 + n3) * 4763;
        bw.write(result + "");
        bw.flush();
        bw.close();
    }
}
