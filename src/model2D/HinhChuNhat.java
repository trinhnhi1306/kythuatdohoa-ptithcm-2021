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
public class HinhChuNhat {

    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public HinhChuNhat(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public void draw(Graphics2D g) {
        g.setColor(Color.red);
        int ax, ay, bx, by, cx, cy, dx, dy;
        ax = x1;
        ay = y1;
        bx = x2;
        by = y1;
        cx = x2;
        cy = y2;
        dx = x1;
        dy = y2;
        DoanThang ab = new DoanThang(ax, ay, bx, by);
        ab.draw(g);
        DoanThang bc = new DoanThang(bx, by, cx, cy);
        bc.draw(g);
        DoanThang cd = new DoanThang(cx, cy, dx, dy);
        cd.draw(g);
        DoanThang da = new DoanThang(dx, dy, ax, ay);
        da.draw(g);
        
//        int xUnit = 1, yUnit = 1; //Để xét x, y tăng hay giảm
//        int x = x1;
//        int y = y1;
//        g.fillRect(ThamSoTruyenVao.backgroundWidth / 2 - 1 + x, ThamSoTruyenVao.backgroundHeight / 2 - 1 - y, 3, 3);
//        if (x1 - x2 > 0) {
//            xUnit = -xUnit;
//        }
//        if (y1 - y2 > 0) {
//            yUnit = -yUnit;
//        }
//        while (x != x2) {
//            g.fillRect(ThamSoTruyenVao.backgroundWidth / 2 - 1 + x, ThamSoTruyenVao.backgroundHeight / 2 - 1 - y1, 3, 3);
//            g.fillRect(ThamSoTruyenVao.backgroundWidth / 2 - 1 + x, ThamSoTruyenVao.backgroundHeight / 2 - 1 - y2, 3, 3);
//            x = x + xUnit;
//        }
//        while (y != y2) {
//            g.fillRect(ThamSoTruyenVao.backgroundWidth / 2 - 1 + x1, ThamSoTruyenVao.backgroundHeight / 2 - 1 - y, 3, 4);
//            g.fillRect(ThamSoTruyenVao.backgroundWidth / 2 - 1 + x2, ThamSoTruyenVao.backgroundHeight / 2 - 1 - y, 3, 3);
//            y = y + yUnit;
//        }
    }

}
