/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biendoi3D;

import matran.NhanMaTran;
import model3D.Diem3D;

/**
 *
 * @author Admin
 */
public class DoiXungQuaDiem {
    public static Diem3D LayDoiXung(Diem3D S, Diem3D tam) {
        Diem3D kq = new Diem3D(0, 0, 0);
        float[] Atn = new float[4];
        Atn[0] = S.getX();
        Atn[1] = S.getY();
        Atn[2] = S.getZ();
        Atn[3] = 1;
        float[][] tinhtien1 = new float[][]{{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 1, 0}, {-tam.getX(), -tam.getY(), -tam.getZ(), 1}}; //Tịnh tiến tâm về gốc tọa độ
        float[][] doixung = new float[][]{{-1, 0, 0, 0}, {0, -1, 0, 0}, {0, 0, -1, 0}, {0, 0, 0, 1}}; //Lấy đối xứng S qua gốc tọa độ
        float[][] tinhtien2 = new float[][]{{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 1, 0}, {tam.getX(), tam.getY(), tam.getZ(), 1}}; //Tịnh tiến các điểm về đúng vị trí
        Atn = NhanMaTran.NhanMotX(Atn.length, Atn, tinhtien1);
        Atn = NhanMaTran.NhanMotX(Atn.length, Atn, doixung);
        Atn = NhanMaTran.NhanMotX(Atn.length, Atn, tinhtien2);
        kq.setX((int) Atn[0]);
        kq.setY((int) Atn[1]);
        kq.setZ((int) Atn[2]);
        return kq;
    }
}
