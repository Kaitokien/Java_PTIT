package codejavaptit;

import java.util.*;

public class J03040_bienSoDep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String s = sc.nextLine();
            String num = "";
            for(int i = 5; i < s.length(); i++){
                if(Character.isDigit(s.charAt(i))){
                    num += s.charAt(i);
                }
            }
            boolean check = true;
            for(int i = 0; i < 5; i++){
                if(num.charAt(i) != '6' && num.charAt(i) != '8'){
                    check = false;
                    break;
                }
            }
            if(check){
                System.out.println("YES");
                continue;
            }
            check = true;
            for(int i = 1; i < 5; i++){
                if(num.charAt(i) != num.charAt(i - 1)){
                    check = false;
                    break;
                }
            }
            if(check){
                System.out.println("YES");
                continue;
            }
            if(num.charAt(0) == num.charAt(1) && num.charAt(0) == num.charAt(2) && num.charAt(3) == num.charAt(4)){
                System.out.println("YES");
                continue;
            }
            check = true;
            for(int i = 1; i < 5; i++){
                if(num.charAt(i) <= num.charAt(i - 1)){
                    check = false;
                    break;
                }
            }
            if(check) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
