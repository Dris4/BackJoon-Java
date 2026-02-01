package N1000_9999.N2000_2999;

import java.util.*;
import java.io.*;

public class N2754 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String score = br.readLine() + "점";

        double[][] result = {
                {4.3, 4.0, 3.7},
                {3.3, 3.0, 2.7},
                {2.3, 2.0, 1.7},
                {1.3, 1.0, 0.7},
                {0.0, 0.0, 0.0}
            };

        int x = score.charAt(0) == 'A' ? 0 : score.charAt(0) == 'B' ? 1 : score.charAt(0) == 'C' ? 2 : score.charAt(0) == 'D' ? 3 : 4;
        int y = score.charAt(1) == '+' ? 0 : score.charAt(1) == '0' ? 1 : score.charAt(1) == '-' ? 2 : 0;

        bw.write(result[x][y] + "");
        bw.flush();
        bw.close();
    }
}