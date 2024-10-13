package ThucHanh.TH2.baitoanbanhang;

public class KH {
    private static int NUM = 1;
    private String mkh;
    private String tenkh;
    private String gt;
    private String ns;
    private String dc;

    public KH(String tenkh, String gt, String ns, String dc) {
        this.mkh = String.format("KH%03d", NUM++);
        this.tenkh = tenkh;
        this.gt = gt;
        this.ns = ns;
        this.dc = dc;
    }

    public String getMkh() {
        return mkh;
    }

    public String getTenkh() {
        return tenkh;
    }

    public String getDc() {
        return dc;
    }

}
