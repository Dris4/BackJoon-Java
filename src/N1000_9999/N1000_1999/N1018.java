package N1000_9999.N1000_1999;

import java.util.*;

public class N1018{
    public static void main(String[] args){
        //정상적인 보드
        String[][] boardW = {
                {"W", "B", "W", "B", "W", "B", "W", "B"},
                {"B", "W", "B", "W", "B", "W", "B", "W"},
                {"W", "B", "W", "B", "W", "B", "W", "B"},
                {"B", "W", "B", "W", "B", "W", "B", "W"},
                {"W", "B", "W", "B", "W", "B", "W", "B"},
                {"B", "W", "B", "W", "B", "W", "B", "W"},
                {"W", "B", "W", "B", "W", "B", "W", "B"},
                {"B", "W", "B", "W", "B", "W", "B", "W"}
        };
        String[][] boardB = {
                {"B", "W", "B", "W", "B", "W", "B", "W"},
                {"W", "B", "W", "B", "W", "B", "W", "B"},
                {"B", "W", "B", "W", "B", "W", "B", "W"},
                {"W", "B", "W", "B", "W", "B", "W", "B"},
                {"B", "W", "B", "W", "B", "W", "B", "W"},
                {"W", "B", "W", "B", "W", "B", "W", "B"},
                {"B", "W", "B", "W", "B", "W", "B", "W"},
                {"W", "B", "W", "B", "W", "B", "W", "B"}
        };

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();

        //체스판 배열로 받기
        String[][] arr = new String[N][M];
        for (int i = 0; i < N; i++) {
            String line = sc.nextLine();
            for(int j = 0; j < M; j++) {
                arr[i][j] = line.charAt(j) + "";
            }
        }



        //M - ? = 8, ? = M - 8
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < N-7; i++) {
            for(int j = 0; j < M-7; j++) {

                //부분 체스판과 정상 체스판 비교
                int maxW = 0;
                int maxB = 0;
                for(int y=0; y<8; y++){
                    for(int x=0; x<8; x++){
                        if(!arr[i+y][j+x].equals(boardW[y][x])){
                            maxW++;
                        }

                        if(!arr[i+y][j+x].equals(boardB[y][x])) {
                            maxB++;
                        }
                    }
                }
                result.add(maxW);
                result.add(maxB);
                maxW = 0;
                maxB = 0;

            }
        }
        System.out.println(Collections.min(result));
    }
}