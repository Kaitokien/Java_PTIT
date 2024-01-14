/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codejavaptit;

import java.util.Scanner;

class Pair<T1, T2>{
    private T1 num1;
    private T2 num2;

    public Pair(T1 num1, T2 num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public boolean prime(Integer n){
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    
    public boolean isPrime(){
        return (prime((Integer) num1) && prime((Integer) num2));
    }

    @Override
    public String toString() {
        return num1 + " " + num2;
    }
    
}

public class J04020_lopPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break; 
                }
            }
            if(!check) System.out.println(-1);
        }
    }
}
