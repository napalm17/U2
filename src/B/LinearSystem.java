package B;

public class LinearSystem {
    public static int[] forwardSubstitution(int[][] L, int[] b) {
        int[] y = new int[b.length];
        for (int i = 0; i < b.length ; i++) {
            int sum = 0;
            for (int k = 0; k < i ; k++) {
                sum += L[i][k] * y[k];
            }
            y[i] = (1 / L[i][i]) * (b[i] - sum);
        }
        return y;
    }
    public static int[] backwardSubstitution(int[][] R, int[] y) {
        int[] x = new int[y.length];
        for (int i = y.length - 1; i >= 0; i--) {
            int sum = 0;
            for (int k = i + 1; k < y.length; k++) {
                sum += R[i][k] * x[k];
            }
            x[i] = (1 / R[i][i]) * (y[i] - sum);
        }
        return x;
    }
    public static int[] solve(int[][] L, int[][] R, int[] b) {
        return backwardSubstitution(R, forwardSubstitution(L, b));
    }
}