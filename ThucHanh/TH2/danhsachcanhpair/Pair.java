package ThucHanh.TH2.danhsachcanhpair;

public class Pair<T, S> {
    private T fi;
    private S se;

    public Pair() {

    }

    public Pair(T fi, S se) {
        this.fi = fi;
        this.se = se;
    }

    public T getFi() {
        return fi;
    }

    public void setFi(T fi) {
        this.fi = fi;
    }

    public S getSe() {
        return se;
    }

    public void setSe(S se) {
        this.se = se;
    }

    @Override
    public String toString() {
        return "(" + fi + "," + se + ")";
    }
}
