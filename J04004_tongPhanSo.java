package codejavaptit;

import java.util.*;

public class J04004_tongPhanSo {
    private int tuSo, mauSo;

    public J04004_tongPhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }
    
    public static long tongTu(J04004_tongPhanSo a, J04004_tongPhanSo b){
        return 1l * a.tuSo * b.mauSo + 1l * a.mauSo * b.tuSo;
    }
    
    public static long tichMau(J04004_tongPhanSo a, J04004_tongPhanSo b){
        return 1l * a.mauSo * b.mauSo;
    }
    
    public static long gcd(long a, long b){
        while(b != 0){
            long r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        J04004_tongPhanSo a = new J04004_tongPhanSo(sc.nextInt(), sc.nextInt());
        J04004_tongPhanSo b = new J04004_tongPhanSo(sc.nextInt(), sc.nextInt());
        long up = tongTu(a, b);
        long down = tichMau(a, b);
        long res = gcd(up, down);
        System.out.println((up / res) + "/" + (down / res));
    }
}
