package ThucHanh.TH2.dongphuc;

public class SinhVien {
    private String id;
    private String name;
    private String lop;
    private String phone;
    private String email;
    private String gt;

    public SinhVien(String id, String name, String lop, String email, String phone, String gt) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.lop = lop;
        this.gt = gt;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getLop() {
        return lop;
    }

    public String getGt() {
        return gt;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + phone + " " + email;
    }
}
