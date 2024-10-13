package ThucHanh.TH2.baitoanbanhang;

public class HD {
    private static int NUM = 1;
    private String mhd;
    private KH k;
    private MH m;
    private String kh;
    private String mh;
    private int sl;

    public HD(String kh, String mh, int sl) {
        this.mhd = String.format("HD%03d", NUM++);
        this.kh = kh;
        this.mh = mh;
        this.sl = sl;
    }

    public void setK(KH k) {
        this.k = k;
    }

    public void setM(MH m) {
        this.m = m;
    }

    @Override
    public String toString() {
        return mhd + " " + k.getTenkh() + " " + k.getDc() + " " + m.getTenmh() + " " + m.getDvi() + " " + m.getMua()
                + " " + m.getBan() + " " + sl + " " + sl * m.getBan();
    }
}
