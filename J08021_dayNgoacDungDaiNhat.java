package codejavaptit;

import java.util.*;

public class J08021_dayNgoacDungDaiNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String s = sc.next();
            int[] a = new int[s.length()];
            Stack<Integer> st = new Stack();
            int ans = 0, res = 0;
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == ')'){
                    if(st.isEmpty()){
                        continue;
                    }
                    else{
                        int c = st.peek();
                        a[c] = 1; a[i] = 1;
                        st.pop();
                    }
                }
                else st.push(i);
            }
            for(int i = 0; i < s.length(); i++){
                while(i < s.length() && a[i] == 1){
                    res += 1;
                    i += 1;
                }
                ans = Math.max(res, ans);
                res = 0;
            }
            ans = Math.max(res, ans);
            System.out.println(ans);
        }
    }
}
