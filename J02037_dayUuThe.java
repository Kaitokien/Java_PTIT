package codejavaptit;

import java.util.*;

public class J02037_dayUuThe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String s = sc.nextLine();
            String[] arr = s.split("\\s+");
            int soChan = 0, soLe = 0;
            for(int i = 0; i < arr.length; i++){
                if((arr[i].charAt(arr[i].length() - 1) - '0') % 2 == 0)
                    ++soChan;
                else ++soLe;
            }
            if((soChan > soLe && arr.length % 2 == 0) || (soLe > soChan && arr.length % 2 == 1)){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
