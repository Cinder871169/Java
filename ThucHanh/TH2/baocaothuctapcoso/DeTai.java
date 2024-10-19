package ThucHanh.TH2.baocaothuctapcoso;

public class DeTai {
    private static int num = 1;
    private String id;
    private String gv;
    private String detai;

    public DeTai(String gv, String detai) {
        this.id = String.format("DT%03d", num++);
        this.gv = gv;
        this.detai = detai;
    }

    public String getId() {
        return id;
    }

    public String getGv() {
        return gv;
    }

    public String getDetai() {
        return detai;
    }

    @Override
    public String toString() {
        return String.format("Lecturer: %s, Project Title: %s", gv, detai);
    }
}
