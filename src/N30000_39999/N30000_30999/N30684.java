package N30000_39999.N30000_30999;

import java.util.*;
import java.io.*;

public class N30684 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<>();
        while(N --> 0){
            String name = br.readLine();
            if(name.length() == 3) list.add(name);
        }
        Collections.sort(list);
        System.out.println(list.get(0));
    }
}
