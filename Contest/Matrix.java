package Contest;

class Matrix {
    private int hang, cot;
    private int[][] matrix;

    public Matrix(int[][] matrix, int hang, int cot) {
        this.matrix = matrix;
        this.hang = hang;
        this.cot = cot;
    }

    public int getHang() {
        return hang;
    }

    public int getCot() {
        return cot;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                sb.append(matrix[i][j]).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
