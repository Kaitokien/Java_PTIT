package codejavaptit;

import java.util.*;

public class J08015_capSoCoTongBangK {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.next());
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            long ans = 0;
            long[] a = new long[n];
            HashMap<Long, Long> mp = new HashMap<>();
            for(int i = 0; i < n; i++){
                a[i] = sc.nextLong();
                if(mp.containsKey(a[i])){
                    long fre = mp.get(a[i]);
                    fre += 1;
                    mp.put(a[i], fre);
                }
                else mp.put(a[i], 1l);
            }
            for(int i = 0; i < n; i++){
                if(mp.containsKey(k - a[i])){
                    ans += mp.get(k - a[i]);
                    if(a[i] * 2 == k) --ans;
                }
            }
            System.out.println(ans / 2);
        }
    }
}
