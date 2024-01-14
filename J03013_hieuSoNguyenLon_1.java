package codejavaptit;

import java.math.BigInteger;
import java.util.Scanner;

public class J03013_hieuSoNguyenLon_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String s1 = sc.next();
            String s2 = sc.next();
            BigInteger tmp;
            BigInteger a = new BigInteger(s1);
            BigInteger b = new BigInteger(s2);
            tmp = a.subtract(b).abs();
            StringBuilder sb = new StringBuilder(tmp.toString());
            int to = Math.max(a.toString().length(), b.toString().length());
            while(sb.length() < to){
                sb.insert(0, "0");
            }
            System.out.println(sb);
        }
    }
}
