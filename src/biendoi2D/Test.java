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
public class Test {

    public static void main(String[] args) {
        Diem2D A = new Diem2D(0, 20);
        Diem2D tam = new Diem2D(0, 10);
        A = Quay.QuayTamBatKy(tam, A, -(Math.PI) / 2);
        System.out.println(A.getX() + "    " + A.getY());
//        A = TinhTien.TinhTien(A, -A.getX(), -A.getY());
//        System.out.println(A.getX() + "    " + A.getY());
//        float[][] kq = new float[3][3];
//        float[][] A = new float[][]{{1, 0, 0}, {0, 1, 0}, {1, 2, 1}};
//        float[][] B = new float[][]{{1, 2, 3}, {0, 1, 0}, {1, 2, 1}};
//        kq = NhanMaTran.NhanXX(3, A, B);
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(kq[i][j] + "   ");
//            }
//            System.out.println("");
//        }
    }
}
