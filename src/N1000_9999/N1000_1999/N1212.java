package N1000_9999.N1000_1999;

import java.util.*;
import java.io.*;

public class N1212 {
    static final String[] binFir = {"0", "1", "10", "11", "100", "101", "110", "111"};
    static final String[] binArr = {"000", "001", "010", "011", "100", "101", "110", "111"};

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String octal = br.readLine();

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<octal.length(); i++){
            int n = octal.charAt(i) - '0';
            if(i==0){
                sb.append(binFir[n]);
            }
            else{
                sb.append(binArr[n]);
            }
        }

        System.out.println(sb);
    }
}