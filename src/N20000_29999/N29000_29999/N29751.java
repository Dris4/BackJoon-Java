package N20000_29999.N29000_29999;

import java.util.*;
import java.io.*;

public class N29751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double W = Double.parseDouble(st.nextToken());
        double H = Double.parseDouble(st.nextToken());
        System.out.printf("%.1f\n", (W * H) / 2.0);
    }
}