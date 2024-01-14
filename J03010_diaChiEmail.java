package codejavaptit;

import java.util.*;

public class J03010_diaChiEmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<String> arr = new ArrayList<>();
        while(t-- > 0){
            String s = sc.nextLine();
            s = s.trim();
            s = s.toLowerCase();
            String ans = "";
            String[] a = s.split("\\s+");
            ans += a[a.length - 1];
            for(int i = 0; i < a.length - 1; i++){
                ans += a[i].charAt(0);
            }
            arr.add(ans);
            int dem = Collections.frequency(arr, ans);
            if(dem == 1){
                ans += "@ptit.edu.vn";
                System.out.println(ans);
            }
            else{
                ans += Integer.toString(dem) + "@ptit.edu.vn";
                System.out.println(ans);
            }
        }
    }
}
