package codejavaptit;

import java.util.*;

class PhanSo{
    private long tuSo, mauSo;
    public PhanSo(long tuSo, long mauSo){
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }
    
    public long gcd(long a, long b){
        while(b != 0){
            long r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    
    public long lcm(long a, long b){
        return a / gcd(a, b) * b;
    }
    
    public PhanSo tinhToanC(PhanSo a, PhanSo b){
        long mau = lcm(a.mauSo, b.mauSo);
        PhanSo ans = new PhanSo(0, 0);
        ans.tuSo = a.tuSo * mau / a.mauSo + b.tuSo * mau / b.mauSo;
        ans.tuSo = ans.tuSo * ans.tuSo;
        ans.mauSo = mau * mau;
        long res = gcd(ans.tuSo, ans.mauSo);
        ans.tuSo /= res;
        ans.mauSo /= res;
        return ans;
    }
    
    public PhanSo tinhToanD(PhanSo a, PhanSo b){
        PhanSo c = tinhToanC(a, b);
        PhanSo ans = new PhanSo(0,0);
        ans.tuSo = a.tuSo * b.tuSo * c.tuSo;
        ans.mauSo = a.mauSo * b.mauSo * c.mauSo;
        long res = gcd(ans.tuSo, ans.mauSo);
        ans.tuSo /= res;
        ans.mauSo /= res;
        return ans;
    }
    
    @Override
    public String toString(){
        return this.tuSo + "/" + this.mauSo;
    }
}

public class J04014_tinhToanPhanSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            PhanSo a = new PhanSo(sc.nextInt(), sc.nextInt());
            PhanSo b = new PhanSo(sc.nextInt(), sc.nextInt());
            PhanSo c = a.tinhToanC(a, b);
            PhanSo d = a.tinhToanD(a, b);
            System.out.println(c + " " + d);
        }
    }
}
