package codejavaptit;

import java.math.BigInteger;
import java.util.*;

public class J03011_uocSoChungLonNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String a = sc.nextLine();
            String b = sc.nextLine();
            BigInteger num1 = new BigInteger(a);
            BigInteger num2 = new BigInteger(b);
            System.out.println(num1.gcd(num2));
        }
    }
}
