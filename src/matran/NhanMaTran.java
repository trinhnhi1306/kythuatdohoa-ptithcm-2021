package matran;

public class NhanMaTran {

    private int n; //n là số phần tử trên một hàng
    private float[] a; //Ma trận 1x3 hoặc 1x4
    private float[][] b; //Ma trận 3x3 hoặc 4x4

    public static float[] NhanMotX(int n, float[] a, float[][] b) {
        float[] kq = new float[n];
        for (int i = 0; i < n; i++) {
            kq[i] = 0;
            for (int j = 0; j < n; j++) {
                kq[i] = kq[i] + a[j] * b[j][i];
            }
        }
        return kq;
    }
}
