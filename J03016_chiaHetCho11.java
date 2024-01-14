package codejavaptit;

import java.math.BigInteger;
import java.util.*;

public class J03016_chiaHetCho11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.next());
        while(t-- > 0){
            String s = sc.next();
            BigInteger a = new BigInteger(s);
            BigInteger b = new BigInteger("11");
            BigInteger ans = a.mod(b);
            BigInteger soKhong = new BigInteger("0");
            if(ans.compareTo(soKhong) == 0){
                System.out.println(1);
            }
            else System.out.println(0);
        }
    }
}
