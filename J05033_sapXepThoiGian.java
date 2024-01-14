package codejavaptit;

import java.util.*;

class Time{
    private int hour, minute, second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return hour + " " + minute + " " + second;
    }
    
    
}

public class J05033_sapXepThoiGian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Time[] n = new Time[t];
        for(int i = 0; i < t; i++){
            n[i] = new Time(sc.nextInt(), sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(n, new Comparator<Time>(){
            @Override
            public int compare(Time o1, Time o2) {
                if(o1.getHour() != o2.getHour()){
                    return o1.getHour() - o2.getHour();
                }
                else if(o1.getMinute() != o2.getMinute()){
                    return o1.getMinute() - o2.getMinute();
                }
                else{
                    return o1.getSecond() - o2.getSecond();
                }
            }
        });
        for(Time i : n){
            System.out.println(i);
        }
    }
}
