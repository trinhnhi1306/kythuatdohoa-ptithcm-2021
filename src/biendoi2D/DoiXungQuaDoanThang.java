/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biendoi2D;

import matran.NhanMaTran;
import model2D.Diem2D;

/**
 *
 * @author Apple Bee
 */
public class DoiXungQuaDoanThang {

    public static Diem2D layDoiXung(Diem2D S, Diem2D A, Diem2D B) {
        Diem2D kq = new Diem2D(0, 0);
        float dx, dy, cos1, cos2, sin1, sin2;
        dx = A.getX() - B.getX();
        dy = A.getY() - B.getY();
        cos1 = cos2 = (float) (dy / Math.sqrt(dx * dx + dy * dy));
        sin1 = (float) (dx / Math.sqrt(dx * dx + dy * dy));
        sin2 = -sin1;
        float[] Atn = new float[3];
        Atn[0] = S.getX();
        Atn[1] = S.getY();
        Atn[2] = 1;
        float[][] tinhtien1 = new float[][]{{1, 0, 0}, {0, 1, 0}, {-A.getX(), -A.getY(), 1}}; //Ma trận tinh tien 1
        float[][] quay1 = new float[][]{{cos1, sin1, 0}, {-sin1, cos1, 0}, {0, 0, 1}}; //Ma trận quay 1
        float[][] tinhtien2 = new float[][]{{1, 0, 0}, {0, 1, 0}, {A.getX(), A.getY(), 1}}; //Ma trận tinh tien 2
        float[][] quay2 = new float[][]{{cos2, sin2, 0}, {-sin2, cos2, 0}, {0, 0, 1}}; //Ma trận quay 2
        float[][] doixung = new float[][]{{-1, 0, 0}, {0, 1, 0}, {0, 0, 1}}; //Ma trận đối xứng. đối xứng qua Oy
        Atn = NhanMaTran.NhanMotX(Atn.length, Atn, tinhtien1);
        Atn = NhanMaTran.NhanMotX(Atn.length, Atn, quay1);
        Atn = NhanMaTran.NhanMotX(Atn.length, Atn, doixung);
        Atn = NhanMaTran.NhanMotX(Atn.length, Atn, quay2);
        Atn = NhanMaTran.NhanMotX(Atn.length, Atn, tinhtien2);
        kq.setX((int) Atn[0]);
        kq.setY((int) Atn[1]);
        return kq;
    }
}
