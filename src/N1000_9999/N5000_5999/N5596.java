package N1000_9999.N5000_5999;

import java.util.*;
import java.io.*;

public class N5596 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int minkuk = 0;
        int manshe = 0;

        //민국
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < 4; i++){
            minkuk += Integer.parseInt(st.nextToken());
        }

        //만세
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < 4; i++){
            manshe += Integer.parseInt(st.nextToken());
        }

        System.out.println(Math.max(minkuk, manshe));
    }
}
