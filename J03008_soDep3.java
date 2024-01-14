package codejavaptit;

import java.util.Scanner;

public class J03008_soDep3 {
    public static boolean xuly(String s){
        int l = 0, r = s.length() - 1;
        while(l <= r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            ++l; --r;
        }
        for(char c : s.toCharArray()){
            if(c != '2' && c != '3' && c != '5' && c != '7')
                return false;
        }
        return true;
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            if(xuly(s) == true){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
