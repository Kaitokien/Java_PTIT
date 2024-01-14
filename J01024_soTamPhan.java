package codejavaptit;

import java.util.Scanner;

public class J01024_soTamPhan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            boolean check = true;
            String s = sc.nextLine();
            for(char x : s.toCharArray()){
                if(x != '0' && x != '1' && x != '2'){
                    check = false;
                    break;
                }
            }
            if(check == true)
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
