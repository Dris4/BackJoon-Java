package N30000_39999.N32000_32999;

import java.util.*;
import java.io.*;

public class N32978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Set<String> recipe = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()){
            recipe.add(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()){
            recipe.remove(st.nextToken());
        }

        for(String s: recipe){
            System.out.println(s);
        }
    }
}