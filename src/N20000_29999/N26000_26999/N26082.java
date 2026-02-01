package N20000_29999.N26000_26999;

import java.util.*;
import java.io.*;

public class N26082 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken()); //경쟁사 제품 가격
        int B = Integer.parseInt(st.nextToken()); //경쟁사 제품 성능
        int C = Integer.parseInt(st.nextToken()); //WARBOY 가격

        //가격 대비 성능 = 성능/가격
        //WARBOY 가격 대비 성능 == 경쟁사 제품 가격 대비 성능 * 3
        //WARBOY 성능 == B/A * C * 3
        double result = (double)B / A * C * 3;
        bw.write((int)result + "");
        bw.flush();
        bw.close();
    }
}
