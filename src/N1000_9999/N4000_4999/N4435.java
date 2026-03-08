package N1000_9999.N4000_4999;

import java.util.*;
import java.io.*;

public class N4435 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        int[] gandalf_score = {1,2,3,3,4,10};
        int[] sauron_score = {1,2,2,2,3,5,10};
        StringTokenizer st;
        for(int i=1; i<=T; i++){
            int gandalf = 0;
            int sauron = 0;

            st = new StringTokenizer(br.readLine());
            for(int g : gandalf_score){
                gandalf += g * Integer.parseInt(st.nextToken());
            }

            st = new StringTokenizer(br.readLine());
            for(int s : sauron_score){
                sauron += s * Integer.parseInt(st.nextToken());
            }

            if(gandalf > sauron){
                sb.append("Battle ").append(i).append(": Good triumphs over Evil").append("\n");
            }
            else if(gandalf < sauron){
                sb.append("Battle ").append(i).append(": Evil eradicates all trace of Good").append("\n");
            }
            else{
                sb.append("Battle ").append(i).append(": No victor on this battle field").append("\n");
            }
        }
        System.out.println(sb);
    }
}
