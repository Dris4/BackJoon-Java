package N1000_9999.N8000_8999;

import java.util.*;
import java.io.*;

public class N8320 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int count = 0;
        for (int i=1; i*i <= n; i++) {
            for (int j=i; i*j <= n; j++) {
                count++;
            }
        }

        System.out.println(count);
    }
}
