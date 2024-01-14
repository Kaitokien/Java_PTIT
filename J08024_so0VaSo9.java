package codejavaptit;

import java.util.*;

public class J08024_so0VaSo9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            Queue<String> q = new LinkedList<>();
            q.add("9");
            while(!q.isEmpty()){
                String res = q.remove();
                int tmp = Integer.parseInt(res);
                if(tmp % n == 0){
                    System.out.println(tmp);
                    break;
                }
                q.add(res + "0");
                q.add(res + "9");
            }
        }
    }
}
