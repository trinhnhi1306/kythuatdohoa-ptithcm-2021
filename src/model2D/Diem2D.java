/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model2D;

import java.awt.Color;
import java.awt.Graphics2D;

/**
 *
 * @author Apple Bee
 */
public class Diem2D {

    private int x, y;

    public Diem2D() {
    }

    public Diem2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void draw(Graphics2D g, int flag) {

        g.setColor(Color.RED);  //dat mau hinh ve la red
        if (flag == 1) {
            String text = "Điểm (" + x + ", " + y + ")";
            g.drawString(text, ThamSoTruyenVao.backgroundWidth / 2 + x * 5 + 5, ThamSoTruyenVao.backgroundHeight / 2 - y * 5 - 10);
        }

        g.fillRect(ThamSoTruyenVao.backgroundWidth / 2 + x * 5 - 2, ThamSoTruyenVao.backgroundHeight / 2 - y * 5 - 2, 5, 5);
    }

    @Override
    public String toString() {
        return x + " " + y;
    }

}
