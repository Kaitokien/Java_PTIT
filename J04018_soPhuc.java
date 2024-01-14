package codejavaptit;

import java.util.*;

class soPhuc{
    private int a, b;

    public soPhuc(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    public soPhuc tinhToan_1(soPhuc x, soPhuc y){
        soPhuc ans = new soPhuc(0, 0);
        ans.a = x.a * x.a + x.a * y.a - x.b * x.b - x.b * y.b;
        ans.b = x.a * y.b + x.b * y.a + 2 * x.a * x.b;
        return ans;
    }
    
    public soPhuc tinhToan_2(soPhuc x, soPhuc y){
        soPhuc ans = new soPhuc(0, 0);
        ans.a = (x.a + y.a) * (x.a + y.a) - (x.b + y.b) * (x.b + y.b);
        ans.b = 2 * (x.a + y.a) * (x.b + y.b);
        return ans;
    }

    @Override
    public String toString() {
        if(this.b >= 0){
            return String.valueOf(this.a) + " + " + String.valueOf(this.b) + "i";
        }
        else{
            return String.valueOf(this.a) + " - " + String.valueOf(Math.abs(this.b)) + "i";
        }
    }
}

public class J04018_soPhuc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            soPhuc x = new soPhuc(sc.nextInt(), sc.nextInt());
            soPhuc y = new soPhuc(sc.nextInt(), sc.nextInt());
            soPhuc C = x.tinhToan_1(x, y);
            soPhuc D = x.tinhToan_2(x, y);
            System.out.println(C + ", " + D);
        }
    }
}
