package codejavaptit;

import java.util.*;

public class J03022_xuLyVanBan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringTokenizer st = null;
        ArrayList<String> arr = new ArrayList<>();
        //arr chua cau
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            st = new StringTokenizer(s, ".?!");
            while(st.hasMoreTokens()){
                arr.add(st.nextToken().trim());
            }
        }
        for(String cau : arr){
            int idx = 0;
            String[] tu = cau.split("\\s+");
            for(String x : tu){
                String ans = "";
                x = x.toLowerCase();
                for(int i = 0; i < x.length(); i++){
                    if(idx == 0){
                        ans += Character.toUpperCase(x.charAt(0));
                        idx = 1;
                    }
                    else ans += x.charAt(i);
                }
                System.out.print(ans + " ");
            }
            System.out.println("");
        }
    }
}
