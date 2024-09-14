package J05033;

class Time implements Comparable<Time> {
    private int h, m, s;

    public Time(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }

    public int getH() {
        return h;
    }

    public int getM() {
        return m;
    }

    public int getS() {
        return s;
    }

    @Override
    public int compareTo(Time other) {
        int a = h * 3600 + m * 60 + s;
        int b = other.h * 3600 + other.m * 60 + other.s;
        return a - b;
    }

    @Override
    public String toString() {
        return h + " " + m + " " + s;
    }
}
