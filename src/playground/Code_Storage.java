package playground;

import java.io.*;


//소문자일때는 - '`' 96 , a 97
//대문자일때는 - '@' 64 , A 65
//숫자일 때는 - '0' , 0 48

public class Code_Storage {
    public static void main(String[] args) throws IOException {


    }











    //Horner's Method (매우 큰 수의 나머지 구하기)
    //horner(피제수, 제수, 진법)
    //해시값(소문자) 구할 때는 - '0' 을 -96 로
    public static long horner(String dividend, long divisor, int base){
        long remainder = 0;
        for(int i=0; i<dividend.length(); i++){
            int digit =  dividend.charAt(i) - '0';
            remainder = (remainder * base + digit) % divisor;
        }
        return remainder;
    }

    //15829
    public static long hornerHashing(String dividend, long divisor, int base){
        long remainder = 0;
        for (int i=dividend.length()-1; i>=0; i--) {
            int digit = dividend.charAt(i) - 96;
            remainder = (remainder * base + digit) % divisor;
        }
        return remainder;
    }






    //그냥 뽑아 본 것들
    public static String add(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1, carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';
            sb.append(sum % 10);
            carry = sum / 10;
        }
        return sb.reverse().toString();
    }

    public static String subtract(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1, borrow = 0;

        while (i >= 0) {
            int sub = (a.charAt(i--) - '0') - borrow;
            if (j >= 0) sub -= (b.charAt(j--) - '0');

            if (sub < 0) {
                sub += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }
            sb.append(sub);
        }
        // 앞부분의 의미 없는 0 제거 (예: 100 - 95 = 005 -> 5)
        while (sb.length() > 1 && sb.charAt(sb.length() - 1) == '0') {
            sb.setLength(sb.length() - 1);
        }
        return sb.reverse().toString();
    }

    public static String multiply(String a, long b) {
        if (b == 0) return "0";
        StringBuilder sb = new StringBuilder();
        long carry = 0;

        for (int i = a.length() - 1; i >= 0; i--) {
            long val = (a.charAt(i) - '0') * b + carry;
            sb.append(val % 10);
            carry = val / 10;
        }
        if (carry > 0) sb.append(new StringBuilder(String.valueOf(carry)).reverse());

        return sb.reverse().toString();
    }
}
