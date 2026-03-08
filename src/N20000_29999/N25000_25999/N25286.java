package N20000_29999.N25000_25999;

import java.util.*;
import java.io.*;

public class N25286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] days = {31, 0, 31,30,31,30,31, 31,30,31,30,31};

        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        while(T --> 0){
            st = new StringTokenizer(br.readLine());
            int year = Integer.parseInt(st.nextToken());
            int month = Integer.parseInt(st.nextToken());

            if(month == 1){
                sb.append(year-1).append(' ').append(12).append(' ').append(31);
            }
            else if(month == 3){
                if((year%100 != 0 && year%4 == 0) || year%400 == 0){
                    sb.append(year).append(' ').append(2).append(' ').append(29);
                }
                else{
                    sb.append(year).append(' ').append(2).append(' ').append(28);
                }
            }
            else{
                sb.append(year).append(' ').append(month-1).append(' ').append(days[month-2]);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
