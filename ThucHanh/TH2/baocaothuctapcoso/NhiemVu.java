package ThucHanh.TH2.baocaothuctapcoso;

public class NhiemVu implements Comparable<NhiemVu> {
    private String msv;
    private String subjectID;
    private String hdID;
    private SinhVien sv;
    private DeTai mh;

    public NhiemVu(String msv, String subjectID, String hdID) {
        this.msv = msv;
        this.subjectID = subjectID;
        this.hdID = hdID;
    }

    public String getMsv() {
        return msv;
    }

    public String getSubjectID() {
        return subjectID;
    }

    public String getHdID() {
        return hdID;
    }

    public SinhVien getSv() {
        return sv;
    }

    public DeTai getMh() {
        return mh;
    }

    public void setSv(SinhVien sv) {
        this.sv = sv;
    }

    public void setMh(DeTai mh) {
        this.mh = mh;
    }

    @Override
    public int compareTo(NhiemVu other) {
        return mh.getDetai().compareTo(other.mh.getDetai());
    }

    @Override
    public String toString() {
        return sv.getId() + " " + sv.getName() + " " + mh.getDetai() + " " + mh.getGv();
    }
}
