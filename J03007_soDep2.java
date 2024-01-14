package codejavaptit;

import java.util.Scanner;

public class J03007_soDep2 {
    
    public static boolean xuly(String s){
        int ans = 0;
        if(s.charAt(0) != '8' || s.charAt(s.length() - 1 ) != '8'){
            return false;
        }
        for(char c : s.toCharArray()){
            ans += (c - '0');
        }
        if(ans % 10 != 0) return false;
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
