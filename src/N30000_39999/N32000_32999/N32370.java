package N30000_39999.N32000_32999;

import java.util.*;
import java.io.*;

public class N32370 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int Ax = Integer.parseInt(st.nextToken());
        int Ay = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int Bx = Integer.parseInt(st.nextToken());
        int By = Integer.parseInt(st.nextToken());


        if(Ax == Bx){
            if(Ax == 0) {
                if (Ay < By) {
                    System.out.println(1);
                } else {
                    System.out.println(3);
                }
            }
            else{
                System.out.println(2);
            }
        }
        else if(Ay == By){
            if(Ay == 0){
                if (Ax < Bx) {
                    System.out.println(1);
                } else {
                    System.out.println(3);
                }
            }
            else{
                System.out.println(2);
            }
        }
        else{
            if(Ax == 0 || Ay == 0){
                System.out.println(1);
            }
            else{
                System.out.println(2);
            }
        }
    }
}
