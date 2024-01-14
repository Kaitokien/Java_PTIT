package codejavaptit;

import java.util.*;

public class J03024_soUuThe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            int chan = 0, le = 0;
            boolean check = true;
            for(char x : s.toCharArray()){
                if(Character.isDigit(x) == false){
                    check = false;
                    break;
                }
                if((x - '0') % 2 == 0) ++chan;
                else if((x - '0') % 2 == 1) ++le;
            }
            if(!check){
                System.out.println("INVALID");
                continue;
            }
            if((s.length() % 2 == 0 && chan > le) || (s.length() % 2 == 1 && le > chan)){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
