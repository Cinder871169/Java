package ThucHanh.B8;

public class Number implements Comparable<Number> {
    private int value, firstIndex, count;

    public Number(int value, int firstIndex, int count) {
        this.value = value;
        this.firstIndex = firstIndex;
        this.count = count;
    }

    public int getValue() {
        return value;
    }

    public int getFirstIndex() {
        return firstIndex;
    }

    public int getCount() {
        return count;
    }

    @Override
    public int compareTo(Number other) {
        if (this.count == other.count) {
            return this.firstIndex - other.firstIndex;
        }
        return -(this.count - other.count);
    }
}
