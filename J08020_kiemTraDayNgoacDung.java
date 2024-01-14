package codejavaptit;

import java.util.*;

public class J08020_kiemTraDayNgoacDung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String s = sc.next();
            Stack<Integer> st = new Stack<>();
            boolean check = true;
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                    st.push(i);
                }
                else{
                    if(st.isEmpty()){
                        check = false;
                        break;
                    }
                    else if(s.charAt(i) == ')' && s.charAt(st.peek()) == '('){
                        st.pop();
                    }
                    else if(s.charAt(i) == ']' && s.charAt(st.peek()) == '['){
                        st.pop();
                    }
                    else if(s.charAt(i) == '}' && s.charAt(st.peek()) == '{'){
                        st.pop();
                    }
                    else{
                        check = false;
                        break;
                    }
                }
            }
            if(check)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
