package codejavaptit;

import java.util.*;

public class J03009_tapTuRiengCuaHaiXau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            String g = sc.nextLine();
            TreeSet<String> se1 = new TreeSet<>();
            String[] arr = s.split("\\s+");
            for(String x : arr){
                if(!g.contains(x)) se1.add(x);
            }
            for(String x : se1){
                System.out.print(x + " ");
            }
            System.out.println("");
        }
    }
}
