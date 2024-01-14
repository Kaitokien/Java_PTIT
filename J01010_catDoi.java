package codejavaptit;

import java.util.Scanner;

public class J01010_catDoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            boolean check = false;
            String s = sc.nextLine();
            String ans = "";
            for(char x : s.toCharArray()){
                if(x == '0' || x == '8' || x == '9'){
                    ans += "0";
                }
                else if(x == '1') ans += "1";
                else{
                    check = true;
                    break;
                }
            }
            if(check == true || Long.parseLong(ans) == 0){
                System.out.println("INVALID");
            }
            else{
                System.out.println(Long.parseLong(ans));
            }
        }
    }
}
