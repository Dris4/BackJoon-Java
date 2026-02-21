package N1000_9999.N2000_2999;

import java.util.*;
import java.io.*;

public class N2744 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = br.readLine().split("");
        for(String s : strArr){
            if(s.equals(s.toUpperCase())){
                System.out.print(s.toLowerCase());
            }
            else{
                System.out.print(s.toUpperCase());
            }
        }
    }
}
