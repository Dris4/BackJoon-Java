package N1000_9999.N1000_1999;

import java.util.*;
import java.io.*;

public class N1268 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] data = new int[N][5];
        StringTokenizer st;
        for(int y=0; y<N; y++){
            st = new StringTokenizer(br.readLine());
            for(int x=0; x<5; x++){
                data[y][x] = Integer.parseInt(st.nextToken());
            }
        }

        int leader = 1;
        int max = 0;
        for(int i=1; i<=N; i++){
            int score = getScore(data, i);
            if(max < score){
                leader = i;
                max = score;
            }
        }

        System.out.println(leader);
    }

    public static int getScore(int[][] data, int n){
        boolean[] is_ban = new boolean[data.length];
        is_ban[n-1] = true;
        int score = 0;
        for(int x=0; x<5; x++){
            int room_num = data[(n-1)][x];
            for(int y=0; y<data.length; y++){
                if(data[y][x] == room_num && !is_ban[y]){
                    score++;
                    is_ban[y] = true;
                }
            }
        }
        return score;
    }
}
