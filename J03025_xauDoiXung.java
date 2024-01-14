package codejavaptit;

import java.util.*;

public class J03025_xauDoiXung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            if(s.length() == 0){
                System.out.println("NO");
                continue;
            }
            int l = 0, r = s.length() - 1;
            int dem = 0;
            boolean check = true;
            while(l <= r){
                if(s.charAt(l) != s.charAt(r)){
                    ++dem;
                    if(dem > 1){
                        check = false;
                        break;
                    }
                }
                ++l; --r;
            }
            if(dem == 0){
                if(s.length() % 2 == 1){
                    System.out.println("YES");
                    continue;
                }
                else{
                    System.out.println("NO");
                    continue;
                }
            }
            if(check) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
