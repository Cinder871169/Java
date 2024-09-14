package J04006;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class SinhVien {
    private String msv = "B20DCCN001";
    private String name, lop, ns;
    private double gpa;

    public SinhVien(String name, String lop, String ns, double gpa) {
        this.name = name;
        this.lop = lop;
        this.ns = ns;
        this.gpa = gpa;
    }

    public String chuanHoa() {
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            Date d = formatter.parse(ns);
            return formatter.format(d);
        } catch (ParseException e) {
            System.out.println(e);
        }
        return "";
    }

    @Override
    public String toString() {
        return msv + " " + name + " " + lop + " " + chuanHoa() + " " + String.format("%.2f", gpa);
    }
}
