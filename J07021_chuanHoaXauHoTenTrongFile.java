package codejavaptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07021_chuanHoaXauHoTenTrongFile {
    public static String chuanHoaTen(String s){
        s = s.toLowerCase();
        String[] arr = s.trim().split("\\s+");
        String ans = "";
        for(String x : arr){
            ans += Character.toUpperCase(x.charAt(0)) + x.substring(1);
            ans += " ";
        }
        ans = ans.substring(0, ans.length() - 1);
        return ans;
    }
    
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DATA.in"));
        while(sc.hasNext()){
            String s = sc.nextLine();
            if(s.compareToIgnoreCase("END") == 0) break;
            System.out.println(chuanHoaTen(s));
        }
    }
}
