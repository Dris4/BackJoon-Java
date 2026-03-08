package N20000_29999.N20000_20999;

import java.util.*;
import java.io.*;

public class N20362 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        String winner = st.nextToken();

        List<String> list = new ArrayList<>();
        while(N --> 0){
            st = new StringTokenizer(br.readLine());
            list.add(st.nextToken());
            list.add(st.nextToken());
        }

        String answer = "";
        for(int i=0; i<list.size(); i+=2){
            if(list.get(i).equals(winner)){
                answer = list.get(i+1);
            }
        }

        int result = 0;
        for(int i=0; i<list.size(); i++){
            if(i%2==0 && list.get(i).equals(winner)){
                break;
            }

            if(i%2!=0 && list.get(i).equals(answer)){
                result++;
            }
        }

        System.out.println(result);
    }
}
