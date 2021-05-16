package biendoi2D;

import matran.NhanMaTran;
import model2D.Diem2D;

public class ThuPhong {

    public static Diem2D ThuPhong(Diem2D A, float Sx, float Sy) {
        float[] Atn = new float[3];
        Atn[0] = A.getX();
        Atn[1] = A.getY();
        Atn[2] = 1;
        float[][] tp = new float[][]{{Sx, 0, 0}, {0, Sy, 0}, {0, 0, 1}}; //Ma trận thu phóng
        Atn = NhanMaTran.NhanMotX(Atn.length, Atn, tp);
        Diem2D kq = new Diem2D((int) Atn[0], (int) Atn[1]);
        return kq;
    }
    
    public static Diem2D ThuPhongDungTam(Diem2D A, Diem2D tam, float Sx, float Sy) {
        float[] Atn = new float[3];
        Atn[0] = A.getX();
        Atn[1] = A.getY();
        Atn[2] = 1;
        float[][] tp = new float[][]{{Sx, 0, 0}, {0, Sy, 0}, {0, 0, 1}}; //Ma trận thu phóng
        Atn = NhanMaTran.NhanMotX(Atn.length, Atn, tp);
        Diem2D kq = new Diem2D((int) (Atn[0] - (Sx - 1) * tam.getX()), (int) (Atn[1] - (Sy - 1) * tam.getY()));
        return kq;
    }
}
