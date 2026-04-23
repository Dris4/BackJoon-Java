package N10000_19999.N10000_10999;

import java.util.*;
import java.io.*;

public class N10825 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        List<Student> list = new ArrayList<>();
        while(N --> 0){
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int korean = Integer.parseInt(st.nextToken());
            int english = Integer.parseInt(st.nextToken());
            int math = Integer.parseInt(st.nextToken());
            list.add(new Student(name, korean, english, math));
        }

        list.sort(Comparator
                .comparing(Student::getKorean, Comparator.reverseOrder())
                .thenComparing(Student::getEnglish)
                .thenComparing(Student::getMath, Comparator.reverseOrder())
                .thenComparing(Student::getName)
        );

        StringBuilder sb = new StringBuilder();
        list.forEach(s -> sb.append(s.getName()).append('\n'));
        System.out.println(sb);
    }
}

class Student{
    String name;
    int korean;
    int english;
    int math;

    Student(String name, int korean, int english, int math){
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }

    String getName(){
        return this.name;
    }
    int getKorean(){
        return this.korean;
    }
    int getEnglish(){
        return this.english;
    }
    int getMath(){
        return this.math;
    }
}