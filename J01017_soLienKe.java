package codejavaptit;

import java.util.Scanner;

public class J01017_soLienKe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            boolean check = true;
            String s = sc.nextLine();
            for(int i = 1; i < s.length(); i++){
                int o1 = s.charAt(i - 1) - '0';
                int o2 = s.charAt(i) - '0';
                if(Math.abs(o1 - o2) != 1){
                    check = false;
                    break;
                }
            }
            if(check == false){
                System.out.println("NO");
            }
            else System.out.println("YES");
        }
    }
}
