package N20000_29999.N29000_29999;

import java.util.*;
import java.io.*;

public class N29713 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String tibutibu = br.readLine();

        int[] myArr = new int[10];
        String brsi = "BILNOSVZER";
        for (int i = 0; i < N; i++) {
            int index = brsi.indexOf(tibutibu.charAt(i));
            if (index < 0) {
                continue;
            }
            myArr[index] += 1;
        }

        int result = 0;
        while (true) {
            for (int j = 0; j < 10; j++) {
                if ((j < 8) && (myArr[j] <= 0) || (j >= 8) && (myArr[j] <= 1)) {
                    System.out.println(result);
                    return;
                }

                if (j >= 8) {
                    myArr[j] -= 2;
                } else {
                    myArr[j] -= 1;
                }
            }
            result += 1;
        }
    }
}

