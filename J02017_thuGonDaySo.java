/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codejavaptit;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author ACER
 */
public class J02017_thuGonDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, n = sc.nextInt();
        Stack<Integer> st = new Stack<Integer>();
        for (int i = 0; i < n; i++) {
            x = sc.nextInt();
            if (st.empty())
                st.push(x);
            else {
                if ((st.peek() + x) % 2 == 0)
                    st.pop();
                else
                    st.push(x);
            }
        }
        System.out.print(st.size());
    }
}
