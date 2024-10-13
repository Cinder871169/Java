package ThucHanh.TH2.baitoanbanhang;

public class MH {
    private static int NUM = 1;
    private String mmh;
    private String tenmh;
    private String dvi;
    private int mua;
    private int ban;

    public MH(String tenmh, String dvi, int mua, int ban) {
        this.mmh = String.format("MH%03d", NUM++);
        this.tenmh = tenmh;
        this.dvi = dvi;
        this.mua = mua;
        this.ban = ban;
    }

    public String getMmh() {
        return mmh;
    }

    public String getTenmh() {
        return tenmh;
    }

    public String getDvi() {
        return dvi;
    }

    public int getMua() {
        return mua;
    }

    public int getBan() {
        return ban;
    }
}
