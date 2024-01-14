package codejavaptit;

import java.util.*;

public class JKT014_dauTuChungKhoan {
    public static int [] d = new int[100005];
    public static void solve(int a[], int n){
        Stack<Integer> st = new Stack<>();
        for(int i = n; i >= 1; i--){
            while(!st.empty() && a[i] > a[st.peek()]){
                    d[st.peek()] = i;
                    st.pop();
            }
            st.push(i);
	}
	for(int i = 1; i <= n; i++){
            if(d[i] == i - 1)
                System.out.print(1 + " ");
            else System.out.print((i - d[i]) + " ");;
	}
        System.out.println("");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.next());
        while(t-- > 0){
            Arrays.fill(d, 0);
            int n = sc.nextInt();
            int[] a = new int[n + 1];
            for(int i = 1; i <= n; i++){
                a[i] = sc.nextInt();
            }
            solve(a, n);
        }
    }
}
