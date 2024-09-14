package J04007;

public class NhanVien {
    private String id = "00001";
    private String name, sex, ns, address, tax, contract;

    public NhanVien(String name, String sex, String ns, String address, String tax, String contract) {
        this.name = name;
        this.sex = sex;
        this.ns = ns;
        this.address = address;
        this.tax = tax;
        this.contract = contract;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + sex + " " + ns + " " + address + " " + tax + " " + contract;
    }
}
