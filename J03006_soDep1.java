package codejavaptit;

import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class J03006_soDep1 {
    
    public static boolean xuly(String s){
        int l = 0, r = s.length() - 1;
        while(l <= r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            if((s.charAt(l) - '0') % 2 != 0 || (s.charAt(r) - '0') % 2 != 0)
                return false;
            ++l; --r;
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
