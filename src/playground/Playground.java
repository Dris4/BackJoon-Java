package playground;

/**
 * 실험실
 *
 * <pre>
 * {@code
 *  System.out.println("hello world");
 * }
 * </pre>
 *
 * @author Dris
 * @version 1.0
 */

import java.io.IOException;

//10871번 문제
//10 5
//1 10 4 9 2 3 8 5 7 6


public class Playground {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        int count = readInt();
        int num = readInt();
        for (int i = 0; i < count; i++) {
            int temp = readInt();
            if (num > temp) sb.append(temp).append(' ');
        }

        System.out.println(sb);
    }

    private static final int ASCII_INPUT = 32;
    private static int readInt() {
        int asciiCode, sum = 0;
        try
        {
            while ((asciiCode = System.in.read()) > ASCII_INPUT)
            {
                sum = (sum << 3) + (sum << 1) + (asciiCode & 15);   // sum = sum * 10 + (asciiCode - 48);
            }
        } catch (IOException ignored) {}
        return sum;
    }
}



