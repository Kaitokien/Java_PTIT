package codejavaptit;

import java.util.*;

public class JKT013_soLocPhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            ArrayList<String> arr = new ArrayList<>();
            int n = sc.nextInt();
            Queue<String> q = new LinkedList<>();
            q.add("6"); q.add("8");
            while(!q.isEmpty()){
                String res = q.remove();
                if(res.length() > n) break;
                arr.add(res);
                q.add(res + "6");
                q.add(res + "8");
            }
            System.out.println(arr.size());
            for(int i = arr.size() - 1; i >= 0; i--){
                System.out.print(arr.get(i) + " ");
            }
            System.out.println("");
        }
    }
}
