/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phepchieu;

import model2D.Diem2D;

/**
 *
 * @author Apple Bee
 */
public class Cavalier {
    public static Diem2D chieu(int x, int y, int z) {
        int X = (int) (x - y * (Math.sqrt(2)) / 2);
        int Y = (int) (z - y * (Math.sqrt(2)) / 2);
        Diem2D d = new Diem2D(X, Y);
        return d;
    }
}
