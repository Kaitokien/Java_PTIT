package codejavaptit;

import java.util.Scanner;

public class J01018_soKoLienKe {
    
    public static int xuly(String s){
        int tong = 0;
        for(char x : s.toCharArray()){
            tong = tong + (x - '0');
        }
        return tong;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            boolean check = true;
            String n = sc.nextLine();
            for(int i = 1; i < n.length(); i++){
                int o1 = n.charAt(i - 1) - '0';
                int o2 = n.charAt(i) - '0';
                if(Math.abs(o1 - o2) != 2){
                    check = false;
                    break;
                }
            }
            if(check == true){
                if(xuly(n) % 10 == 0)
                    System.out.println("YES");
                else System.out.println("NO");
            }
            else System.out.println("NO");
        }
    }
}
