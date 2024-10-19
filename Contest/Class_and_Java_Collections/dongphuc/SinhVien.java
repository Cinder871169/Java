package Contest.Class_and_Java_Collections.dongphuc;

public class SinhVien {
    private String id;
    private String name;
    private String className;
    private String email;
    private String phone;
    private String gt;

    public SinhVien(String id, String name, String className, String email, String phone, String gt) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.email = email;
        this.phone = phone;
        this.gt = gt;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getClassName() {
        return className;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getGt() {
        return gt;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + className + " " + email + " " + phone;
    }
}
