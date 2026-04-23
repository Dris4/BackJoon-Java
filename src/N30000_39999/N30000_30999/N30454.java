package N30000_39999.N30000_30999;

import java.util.*;
import java.io.*;

public class N30454 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        int max = 0;
        int count = 0;
        List<String> lines;
        while(N --> 0){
            String zebra = br.readLine();
            lines = new ArrayList<>(Arrays.asList(zebra.split("0")));

            for(int i=lines.size()-1; i>=0; i--){
                if(lines.get(i).isEmpty()){
                    lines.remove(i);
                }
            }

            if(lines.size() > max){
                max = lines.size();
                count = 1;
            }
            else if(lines.size() == max){
                count++;
            }
        }

        System.out.println(max + " " + count);
    }
}
