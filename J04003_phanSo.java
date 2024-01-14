package codejavaptit;

import java.util.*;

public class J04003_phanSo {
    private long tuSo, mauSo;
    
    public J04003_phanSo(long tuSo, long mauSo){
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

    @Override
    public String toString() {
        return (tuSo / gcd(tuSo, mauSo)) + "/" + (mauSo / gcd(tuSo, mauSo));
    }
    
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        J04003_phanSo a = new J04003_phanSo(sc.nextLong(), sc.nextLong());
        System.out.println(a.toString());
    }
}
