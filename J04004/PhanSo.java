package J04004;

public class PhanSo {
    private long tu, mau;

    PhanSo() {
        tu = 0;
        mau = 1;
    }

    PhanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }

    private long gcd(long x, long y) {
        while (y != 0) {
            long k = x % y;
            x = y;
            y = k;
        }
        return x;
    }

    @Override
    public String toString() {
        long k = gcd(this.tu, this.mau);
        return tu / k + "/" + mau / k;
    }
}
