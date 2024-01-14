package codejavaptit;

import java.util.*;

public class J03021_dienThoaiCucGach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String s = sc.nextLine();
            s = s.toLowerCase();
            String ans = "";
            for(char x : s.toCharArray()){
                if(x == 'a' || x == 'b' || x == 'c') ans += "2";
                else if(x == 'd' || x == 'e' || x == 'f') ans += "3";
                else if(x == 'g' || x == 'h' || x == 'i') ans += "4";
                else if(x == 'j' || x == 'k' || x == 'l') ans += "5";
                else if(x == 'm' || x == 'n' || x == 'o') ans += "6";
                else if(x == 'p' || x == 'q' || x == 'r' || x == 's') ans += "7";
                else if(x == 't' || x == 'u' || x == 'v') ans += "8";
                else if(x == 'w' || x == 'x' || x == 'y' || x == 'z') ans += "9";
            }
            int l = 0, r = s.length() - 1;
            boolean check = true;
            while(l <= r){
                if(ans.charAt(l) != ans.charAt(r)){
                    check = false;
                    break;
                }
                ++l; --r;
            }
            if(check) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
