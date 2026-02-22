package N10000_19999.N12000_12999;

import java.util.*;
import java.io.*;

public class N12605 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Deque<String> stack = new ArrayDeque<>();
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<N+1; i++){
            st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()){
                stack.push(st.nextToken());
            }

            sb.append("Case #").append(i).append(':');

            while(!stack.isEmpty()){
                sb.append(" ").append(stack.pop());
            }

            sb.append("\n");
        }
        System.out.println(sb);
    }
}