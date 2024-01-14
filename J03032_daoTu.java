package codejavaptit;

import java.util.*;

public class J03032_daoTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String s = sc.nextLine();
            String[] arr = s.split("\\s+");
            for(String x : arr){
                StringBuilder sb = new StringBuilder("");
                sb.append(x);
                sb.reverse();
                System.out.print(sb.toString() + " ");
            }
            System.out.println("");
        }
    }
}
