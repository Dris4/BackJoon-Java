package N1000_9999.N3000_3999;

import java.util.*;
import java.io.*;
import java.time.*;

public class N3029 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        LocalTime currentTime = LocalTime.parse(br.readLine());
        LocalTime throwTime = LocalTime.parse(br.readLine());
        Duration diff = Duration.between(currentTime, throwTime);

        if (diff.isNegative() || diff.isZero()) {
            diff = diff.plusDays(1);
        }

        long h = diff.toHours();
        int m = diff.toMinutesPart();
        int s = diff.toSecondsPart();

        String result = String.format("%02d:%02d:%02d", h, m, s);
        System.out.println(result);
    }
}
