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
public class JKT015_goBanPhim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '<') {
                if (s1.size() > 0) {
                    s2.push(s1.peek());
                    s1.pop();
                }
            } else if (s.charAt(i) == '>') {
                if (s2.size() > 0) {
                    s1.push(s2.peek());
                    s2.pop();
                }
            } else if (s.charAt(i) == '-') {
                if (s1.size() > 0)
                    s1.pop();
            } else
                s1.push(s.charAt(i));
        }
        while (s1.size() > 0) {
            s2.push(s1.peek());
            s1.pop();
        }
        while (s2.size() > 0) {
            System.out.print(s2.peek());
            s2.pop();
        }
    }
}
