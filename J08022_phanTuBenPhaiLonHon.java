/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codejavaptit;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author ACER
 */
public class J08022_phanTuBenPhaiLonHon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Stack<Integer> arr = new Stack();
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            ArrayList<Integer> ans = new ArrayList<>();
            for(int i = 0; i < n; i++){
                while(!arr.isEmpty() && a[i] > a[arr.peek()]){
                    b[arr.peek()] = a[i];
                    arr.pop();
                }
                arr.push(i);
            }
            while(!arr.isEmpty()){
                b[arr.peek()] = -1;
                arr.pop();
            }
            for(int i = 0; i < n; i++){
                System.out.print(b[i] + " ");
            }
            System.out.println("");
        }
    }
}
