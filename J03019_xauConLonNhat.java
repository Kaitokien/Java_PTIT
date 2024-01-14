package codejavaptit;

import java.util.*;

public class J03019_xauConLonNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = ""; ans += s.charAt(s.length() - 1);
        char c = s.charAt(s.length() - 1);
        for(int i = s.length() - 2; i >= 0; i--){
            if(s.charAt(i) == c) ans += s.charAt(i);
            else if(s.charAt(i) > c){
                ans += s.charAt(i);
                c = s.charAt(i);
            }
            else continue;
        }
        for(int i = ans.length() - 1; i >= 0; i--){
            System.out.print(ans.charAt(i));
        }
    }
}
