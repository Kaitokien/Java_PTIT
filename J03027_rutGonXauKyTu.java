package codejavaptit;

import java.util.*;

public class J03027_rutGonXauKyTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        while(true){
            boolean check = true;
            for(int i = 0; i < s.length() - 1; i++){
                if(s.charAt(i) == s.charAt(i + 1)){
                    s = s.substring(0, i) + s.substring(i + 2);
                    check = false;
                    break;
                }
            }
            if(check) break;
        }
        if(s.isEmpty()) System.out.println("Empty String");
        else System.out.println(s);
    }
}
