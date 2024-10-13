package ThucHanh.TH2.thuctapcoso;

public class NhiemVu implements Comparable<NhiemVu> {
    private String msv;
    private String subjectID;
    private SinhVien sv;
    private DeTai mh;

    public NhiemVu(String msv, String subjectID) {
        this.msv = msv;
        this.subjectID = subjectID;
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
        return sv.toString() + " " + mh.toString();
    }
}
