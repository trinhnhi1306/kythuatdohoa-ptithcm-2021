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
    
    public void draw(Graphics2D g) {
        g.setColor(Color.RED);  //dat mau hinh ve la red
        String text = "Điểm (" + x/5 + ", " + y/5 + ")";
        //g.drawString(text, ThamSoTruyenVao.backgroundWidth/2 + x + 5, ThamSoTruyenVao.backgroundHeight/2 - y - 10);
        g.fillOval(ThamSoTruyenVao.backgroundWidth/2 + x - 2, ThamSoTruyenVao.backgroundHeight/2 - y - 2, 5, 5);
    }
}
