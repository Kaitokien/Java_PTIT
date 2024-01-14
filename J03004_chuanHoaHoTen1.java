package codejavaptit;

import java.util.Scanner;

public class J03004_chuanHoaHoTen1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String first = "";
            int dem = 0;
            String s = sc.nextLine();
            s = s.trim();
            StringBuilder sb = new StringBuilder("");
            String[] arr = s.split("\\s+");
            for(String x : arr){
                if(dem == 0){
                    first += x.toUpperCase();
                    dem = 1;
                    continue;
                }
                sb.append(Character.toUpperCase(x.charAt(0)));
                for(int j = 1; j < x.length(); j++){
                    sb.append(Character.toLowerCase(x.charAt(j)));
                }
                sb.append(" ");
            }
            sb.deleteCharAt(sb.length() - 1);
            System.out.print(sb); System.out.print(", ");
            System.out.println(first);
        }
    }
}
