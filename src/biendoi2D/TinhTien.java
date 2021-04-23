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
 * @author Admin
 */
public class TinhTien {
    public static Diem2D TinhTien(Diem2D A, int dx, int dy) {
        Diem2D kq = new Diem2D(0, 0);
        float[] Atn = new float[3];
        Atn[0] = A.getX();
        Atn[1] = A.getY();
        Atn[2] = 1;
        float[][] tt = new float[][]{{1, 0, 0}, {0, 1, 0}, {dx, dy, 1}}; //Ma trận tịnh tiến
        Atn = NhanMaTran.NhanMotX(Atn.length, Atn, tt);
        kq.setX((int)Atn[0]);
        kq.setY((int)Atn[1]);
        return kq;
    }
}
