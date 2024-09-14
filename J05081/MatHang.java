package J05081;

public class MatHang implements Comparable<MatHang> {
    private String id, ten, dvi;
    private int mua, ban, lai;

    public MatHang(int id, String ten, String dvi, int mua, int ban) {
        this.id = String.format("MH%03d", id);
        this.ten = ten;
        this.dvi = dvi;
        this.mua = mua;
        this.ban = ban;
        lai = ban - mua;
    }

    @Override
    public String toString() {
        return this.id + " " + this.ten + " " + this.dvi + " " + this.mua + " " + this.ban + " " + this.lai;

    }

    @Override
    public int compareTo(MatHang a) {
        if (this.lai == a.lai) {
            return this.id.compareTo(a.id);
        }
        return a.lai - this.lai;
    }
}
