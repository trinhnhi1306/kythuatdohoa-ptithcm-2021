package matran;

public class NhanMaTran {

    public static float[] NhanMotX(int n, float[] a, float[][] b) { //Ma trận 1x3 với 3x3 hoặc 1x4 với 4x4...
        float[] kq = new float[n];
        for (int i = 0; i < n; i++) {
            kq[i] = 0;
            for (int j = 0; j < n; j++) {
                kq[i] = kq[i] + a[j] * b[j][i];
            }
        }
        return kq;
    }
    public static float[][] NhanXX(int n, float[][] a, float[][] b) { //Ma trận 3x3 với 3x3 hoặc 4x4 với 4x4
        float[][] kq = new float[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                kq[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    kq[i][j] = kq[i][j] + a[i][k] * b[k][j];
                }
            }
        }
        return kq;
    }
}
