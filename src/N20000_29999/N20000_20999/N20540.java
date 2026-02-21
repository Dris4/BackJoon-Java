package N20000_29999.N20000_20999;

import java.util.*;
import java.io.*;

public class N20540 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String mbti = br.readLine();
        String mbtiArr = "ESTJINFP";

        for(int i = 0; i<4; i++){
            int x = mbtiArr.indexOf(mbti.charAt(i));
            System.out.print(mbtiArr.charAt((x+4)%8));
        }
    }
}