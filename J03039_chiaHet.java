package codejavaptit;

import java.math.BigInteger;
import java.util.*;

public class J03039_chiaHet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s1 = sc.next();
            String s2 = sc.next();
            BigInteger a = new BigInteger(s1);
            BigInteger b = new BigInteger(s2);
            if(a.mod(b).toString() == "0" || b.mod(a).toString() == "0"){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
