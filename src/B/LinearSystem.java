package B;

/**
 * This utility class contains methods
 * that help us solve a system of linear equations.
 *
 * @author ugpsy
 * @version 1.0
 */
public class LinearSystem {
    private LinearSystem() {}
    /**
     * Returns the vector "y" as the solution of the LGS Ly = b.
     *
     * @param L a lower triangular nxn matrix.
     * @param b a vector with n components.
     * @return vector y with n components with Ly = b being the LGS.
     */
    public static int[] forwardSubstitution(int[][] L, int[] b) {
        int[] y = new int[b.length];
        // The formula given in the assignment sheet is applied here.
        for (int i = 0; i < b.length ; i++) {
            int sum = 0;
            for (int k = 0; k < i ; k++) {
                sum += L[i][k] * y[k];
            }
            y[i] = (1 / L[i][i]) * (b[i] - sum);
        }
        return y;
    }

    /**
     * Returns the vector "x" as the solution of the LGS Rx = y.
     *
     * @param R an upper triangular nxn matrix.
     * @param y a vector with n components.
     * @return vector x with n components with Rx = y being the LGS.
     */
    public static int[] backwardSubstitution(int[][] R, int[] y) {
        int[] x = new int[y.length];
        // The formula given in the assignment sheet is applied here.
        // But this time,
        for (int i = y.length - 1; i >= 0; i--) {
            int sum = 0;
            for (int k = i + 1; k < y.length; k++) {
                sum += R[i][k] * x[k];
            }
            x[i] = (1 / R[i][i]) * (y[i] - sum);
        }
        return x;
    }

    /**
     * Returns the vector "x" as the solution of the LGS Ax = b.
     *
     * @param R an upper triangular nxn matrix.
     * @param L an upper triangular nxn matrix with LR = A
     * @return vector x with n components with Ax = b being the LGS.
     */
    public static int[] solve(int[][] L, int[][] R, int[] b) {
        // Here we first apply forword substitution to find vector y.
        // Then we plug in the solution "y" we got from forword substitution to backward
        // substitution as a parameter alongside matrix to finally compute vector "x".
        return backwardSubstitution(R, forwardSubstitution(L, b));
    }
}