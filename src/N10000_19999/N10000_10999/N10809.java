package N10000_19999.N10000_10999;

import java.util.*;
import java.io.*;

public class N10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = br.readLine();

        for(int i=97; i<=122; i++){ //97~122
            sb.append(s.indexOf((char)i)).append(' ');
        }
        System.out.println(sb);
    }
}
