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
public class Ellipse {

    private int xO, yO, a, b;

    public Ellipse(int xO, int yO, int a, int b) {
        this.xO = xO * 5;
        this.yO = yO * 5;
        this.a = a * 5;
        this.b = b * 5;
    }

    public int getxO() {
        return xO;
    }

    public void setxO(int xO) {
        this.xO = xO;
    }

    public int getyO() {
        return yO;
    }

    public void setyO(int yO) {
        this.yO = yO;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void draw(Graphics2D g) {

        g.setColor(Color.RED);  //dat mau hinh ve la red
        //khai bao cac bien cua thuat toan Midpoint
        int dem = 0;
        int dx, dy, p0, q0, x, y;
        x = 0;
        y = b;

        //Khai bao cac bien vung I
        p0 = (int) ((b * b) - (a * a * b) + (0.25 * a * a));
        dx = 2 * b * b * x;
        dy = 2 * a * a * y;

        //Ve vung I
        while (dx < dy) {
            // Ve diem dua tren doi xung
            if (dem < 5) {
                g.fillOval(x + ThamSoTruyenVao.backgroundWidth / 2 + xO - 1, -y + ThamSoTruyenVao.backgroundHeight / 2 - yO - 1, 3, 3);
                g.fillOval(-x + ThamSoTruyenVao.backgroundWidth / 2 + xO - 1, -y + ThamSoTruyenVao.backgroundHeight / 2 - yO - 1, 3, 3);
                dem++;
            } else if (dem < 10) {
                dem++;
            } else {
                dem = 0;
                g.fillOval(x + ThamSoTruyenVao.backgroundWidth / 2 + xO - 1, -y + ThamSoTruyenVao.backgroundHeight / 2 - yO - 1, 3, 3);
                g.fillOval(-x + ThamSoTruyenVao.backgroundWidth / 2 + xO - 1, -y + ThamSoTruyenVao.backgroundHeight / 2 - yO - 1, 3, 3);
            }
            g.fillOval(x + ThamSoTruyenVao.backgroundWidth / 2 + xO - 1, y + ThamSoTruyenVao.backgroundHeight / 2 - yO - 1, 3, 3);
            g.fillOval(-x + ThamSoTruyenVao.backgroundWidth / 2 + xO - 1, y + ThamSoTruyenVao.backgroundHeight / 2 - yO - 1, 3, 3);

            // Kiem tra va cap nhat cac gia tri
            if (p0 < 0) {
                x++;
                dx = dx + (2 * b * b);
                p0 = p0 + dx + (b * b);
            } else {
                x++;
                y--;
                dx = dx + (2 * b * b);
                dy = dy - (2 * a * a);
                p0 = p0 + dx - dy + (b * b);
            }
        }
        // Ve vung II
        q0 = (int) (((b * b) * ((x + 0.5) * (x + 0.5))) + ((a * a) * ((y - 1) * (y - 1))) - (a * a * b * b));
        while (y >= 0) {

            // Ve 4 diem
            if (dem < 5) {
                g.fillOval(x + ThamSoTruyenVao.backgroundWidth / 2 + xO - 1, -y + ThamSoTruyenVao.backgroundHeight / 2 - yO - 1, 3, 3);
                g.fillOval(-x + ThamSoTruyenVao.backgroundWidth / 2 + xO - 1, -y + ThamSoTruyenVao.backgroundHeight / 2 - yO - 1, 3, 3);
                dem++;
            } else if (dem < 10) {
                dem++;
            } else {
                dem = 0;
                g.fillOval(x + ThamSoTruyenVao.backgroundWidth / 2 + xO - 1, -y + ThamSoTruyenVao.backgroundHeight / 2 - yO - 1, 3, 3);
                g.fillOval(-x + ThamSoTruyenVao.backgroundWidth / 2 + xO - 1, -y + ThamSoTruyenVao.backgroundHeight / 2 - yO - 1, 3, 3);
            }
            g.fillOval(x + ThamSoTruyenVao.backgroundWidth / 2 + xO - 1, y + ThamSoTruyenVao.backgroundHeight / 2 - yO - 1, 3, 3);
            g.fillOval(-x + ThamSoTruyenVao.backgroundWidth / 2 + xO - 1, y + ThamSoTruyenVao.backgroundHeight / 2 - yO - 1, 3, 3);

            // Kiem tra va cap nhat cac gia tri
            if (q0 > 0) {
                y--;
                dy = dy - (2 * a * a);
                q0 = q0 + (a * a) - dy;
            } else {
                y--;
                x++;
                dx = dx + (2 * b * b);
                dy = dy - (2 * a * a);
                q0 = q0 + dx - dy + (a * a);
            }
        }
    }

    public void drawLien(Graphics2D g) {

        g.setColor(Color.RED);  //dat mau hinh ve la red
        //khai bao cac bien cua thuat toan Midpoint
        int dx, dy, p0, q0, x, y;
        x = 0;
        y = b;

        //Khai bao cac bien vung I
        p0 = (int) ((b * b) - (a * a * b) + (0.25 * a * a));
        dx = 2 * b * b * x;
        dy = 2 * a * a * y;

        //Ve vung I
        while (dx < dy) {
            // Ve diem dua tren doi xung
            g.fillOval(x + 700 / 2 + xO - 1, y + ThamSoTruyenVao.backgroundHeight / 2 - yO - 1, 3, 3);
            g.fillOval(-x + 700 / 2 + xO - 1, y + ThamSoTruyenVao.backgroundHeight / 2 - yO - 1, 3, 3);

            // Kiem tra va cap nhat cac gia tri
            if (p0 < 0) {
                x++;
                dx = dx + (2 * b * b);
                p0 = p0 + dx + (b * b);
            } else {
                x++;
                y--;
                dx = dx + (2 * b * b);
                dy = dy - (2 * a * a);
                p0 = p0 + dx - dy + (b * b);
            }
        }
        // Ve vung II
        q0 = (int) (((b * b) * ((x + 0.5) * (x + 0.5))) + ((a * a) * ((y - 1) * (y - 1))) - (a * a * b * b));
        while (y >= 0) {

            // Ve 4 diem
            g.fillOval(x + 700 / 2 + xO - 1, y + ThamSoTruyenVao.backgroundHeight / 2 - yO - 1, 3, 3);
            g.fillOval(-x + 700 / 2 + xO - 1, y + ThamSoTruyenVao.backgroundHeight / 2 - yO - 1, 3, 3);

            // Kiem tra va cap nhat cac gia tri
            if (q0 > 0) {
                y--;
                dy = dy - (2 * a * a);
                q0 = q0 + (a * a) - dy;
            } else {
                y--;
                x++;
                dx = dx + (2 * b * b);
                dy = dy - (2 * a * a);
                q0 = q0 + dx - dy + (a * a);
            }
        }
    }
}
