package codejavaptit;

import java.math.BigInteger;
import java.util.*;

public class J03033_boiSoChungNhoNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            BigInteger a = new BigInteger(sc.next());
            BigInteger b = new BigInteger(sc.next());
            BigInteger tich = a.multiply(b);
            BigInteger gcd = a.gcd(b);
            System.out.println(tich.divide(gcd));
        }
    }
}
