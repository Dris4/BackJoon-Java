package N10000_19999.N10000_10999;

import java.util.*;
import java.io.*;

public class N10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        long T = Long.parseLong(br.readLine());
        StringTokenizer st;
        while(T --> 0){
            st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken()); //층수
            int W = Integer.parseInt(st.nextToken()); //방수
            int N = Integer.parseInt(st.nextToken()); //손님 번호

            int YY;
            int XX;
            if( N%H == 0 ){
                YY = H;
                XX = (N / H-1) + 1;
            }
            else{
                YY = N % H;
                XX = (N / H) + 1;
            }
            sb.append(YY*100 + XX).append("\n");
        }
        System.out.println(sb);
    }
}
