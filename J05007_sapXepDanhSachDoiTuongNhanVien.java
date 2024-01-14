package codejavaptit;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class NhanVien {
    private String mnv, name, gender, dob, add, num, contract;
    private long tuoi;

    public NhanVien(int mnv, String name, String gender, String dob, String add, String num, String contract) throws ParseException {
        this.mnv = String.format("%05d", mnv);
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.add = add;
        this.num = num;
        this.contract = contract;
        this.tuoi = tinhTuoi();
    }

    public long getTuoi() {
        return tuoi;
    }
    
    public long tinhTuoi() throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        long milisec = new Date().getTime() - sdf.parse(dob).getTime();
        return milisec / (1000 * 60 * 60 * 24 * 365);
    }

    @Override
    public String toString() {
        return mnv + " " + name + " " + gender + " " + dob + " " + add + " " + num + " " + contract;
    }
    
}

public class J05007_sapXepDanhSachDoiTuongNhanVien {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        NhanVien[] arr = new NhanVien[t];
        for(int i = 0; i < t; i++){
            arr[i] = new NhanVien(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(arr, new Comparator<NhanVien>(){
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                long a = o1.getTuoi();
                long b = o2.getTuoi();
                if(a > b) return -1;
                else if(a < b) return 1;
                return 0;
            }
        });
        for(int i = 0; i < t; i++){
            System.out.println(arr[i]);
        }
    }
}
