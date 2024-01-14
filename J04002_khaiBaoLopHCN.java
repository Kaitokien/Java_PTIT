package codejavaptit;

import java.util.*;

public class J04002_khaiBaoLopHCN {
    private double w;
    private double h;
    private String color;
    
    public void J04002_khaiBaoLopHCN(){
        this.w = 1;
        this.h = 1;
    }
    
    public void J04002_khaiBaoLopHCN(double w, double h, String color){
        this.w = w;
        this.h = h;
        this.color = color;
    }

    public double getW() {
        return w;
    }

    public double getH() {
        return h;
    }

    public String getColor(String color) {
        this.color = color;
        return this.color;
    }

    public void setW(double w) {
        this.w = w;
    }

    public void setH(double h) {
        this.h = h;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public double findArea(){
        return w * h;
    }
    
    public double findPerimeter(){
        return (w + h) * 2;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m; String s;
        
    }
}
