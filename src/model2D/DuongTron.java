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
public class DuongTron {

    private int xO, yO, r;

    public DuongTron(int xO, int yO, int r) {
        this.xO = xO * 5;
        this.yO = yO * 5;
        this.r = r * 5;
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

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public void draw(Graphics2D g) {

        g.setColor(Color.RED);  //dat mau hinh ve la red
        //khai bao cac bien cua thuat toan Bresenham
        int dem = 0;
        int x, y, p;
        p = 3 - 2 * r;
        x = 0;
        y = r;
        g.fillRect(x, y, 1, 1);
        while (x < y) { //ve 1/8 duong tron
            if (p < 0) {
                p += 4 * x + 6;
            } else {
                p += 4 * (x - y) + 10;
                y -= 5;
            }
            x += 5;
            if (dem < 2) {
                g.fillRect(x + ThamSoTruyenVao.backgroundWidth / 2 + xO - 2, y + ThamSoTruyenVao.backgroundHeight / 2 - yO - 2, 5, 5);
                g.fillRect(y + ThamSoTruyenVao.backgroundWidth / 2 + xO - 2, x + ThamSoTruyenVao.backgroundHeight / 2 - yO - 2, 5, 5);
                g.fillRect(-y + ThamSoTruyenVao.backgroundWidth / 2 + xO - 2, x + ThamSoTruyenVao.backgroundHeight / 2 - yO - 2, 5, 5);
                g.fillRect(-x + ThamSoTruyenVao.backgroundWidth / 2 + xO - 2, y + ThamSoTruyenVao.backgroundHeight / 2 - yO - 2, 5, 5);
                g.fillRect(-x + ThamSoTruyenVao.backgroundWidth / 2 + xO - 2, -y + ThamSoTruyenVao.backgroundHeight / 2 - yO - 2, 5, 5);
                g.fillRect(-y + ThamSoTruyenVao.backgroundWidth / 2 + xO - 2, -x + ThamSoTruyenVao.backgroundHeight / 2 - yO - 2, 5, 5);
                g.fillRect(y + ThamSoTruyenVao.backgroundWidth / 2 + xO - 2, -x + ThamSoTruyenVao.backgroundHeight / 2 - yO - 2, 5, 5);
                g.fillRect(x + ThamSoTruyenVao.backgroundWidth / 2 + xO - 2, -y + ThamSoTruyenVao.backgroundHeight / 2 - yO - 2, 5, 5);
                dem++;
            } else if (dem < 5) {
                dem++;
            } else {
                dem = 0;
                g.fillRect(x + ThamSoTruyenVao.backgroundWidth / 2 + xO - 2, y + ThamSoTruyenVao.backgroundHeight / 2 - yO - 2, 5, 5);
                g.fillRect(y + ThamSoTruyenVao.backgroundWidth / 2 + xO - 2, x + ThamSoTruyenVao.backgroundHeight / 2 - yO - 2, 5, 5);
                g.fillRect(-y + ThamSoTruyenVao.backgroundWidth / 2 + xO - 2, x + ThamSoTruyenVao.backgroundHeight / 2 - yO - 2, 5, 5);
                g.fillRect(-x + ThamSoTruyenVao.backgroundWidth / 2 + xO - 2, y + ThamSoTruyenVao.backgroundHeight / 2 - yO - 2, 5, 5);
                g.fillRect(-x + ThamSoTruyenVao.backgroundWidth / 2 + xO - 2, -y + ThamSoTruyenVao.backgroundHeight / 2 - yO - 2, 5, 5);
                g.fillRect(-y + ThamSoTruyenVao.backgroundWidth / 2 + xO - 2, -x + ThamSoTruyenVao.backgroundHeight / 2 - yO - 2, 5, 5);
                g.fillRect(y + ThamSoTruyenVao.backgroundWidth / 2 + xO - 2, -x + ThamSoTruyenVao.backgroundHeight / 2 - yO - 2, 5, 5);
                g.fillRect(x + ThamSoTruyenVao.backgroundWidth / 2 + xO - 2, -y + ThamSoTruyenVao.backgroundHeight / 2 - yO - 2, 5, 5);
            }
        }
    }

    public void drawLien(Graphics2D g) {

//        g.setColor(Color.RED);  //dat mau hinh ve la red
//        //khai bao cac bien cua thuat toan Bresenham
//        int x, y, p;
//        p = 3 - 2 * r;
//        x = 0;
//        y = r;
//        while (x <= y) { //ve 1/8 duong tron
//            g.fillRect(x + ThamSoTruyenVao.backgroundWidth / 2 + xO - 2, y + ThamSoTruyenVao.backgroundHeight / 2 - yO - 2, 5, 5);
//            g.fillRect(y + ThamSoTruyenVao.backgroundWidth / 2 + xO - 2, x + ThamSoTruyenVao.backgroundHeight / 2 - yO - 2, 5, 5);
//            g.fillRect(-y + ThamSoTruyenVao.backgroundWidth / 2 + xO - 2, x + ThamSoTruyenVao.backgroundHeight / 2 - yO - 2, 5, 5);
//            g.fillRect(-x + ThamSoTruyenVao.backgroundWidth / 2 + xO - 2, y + ThamSoTruyenVao.backgroundHeight / 2 - yO - 2, 5, 5);
//            g.fillRect(-x + ThamSoTruyenVao.backgroundWidth / 2 + xO - 2, -y + ThamSoTruyenVao.backgroundHeight / 2 - yO - 2, 5, 5);
//            g.fillRect(-y + ThamSoTruyenVao.backgroundWidth / 2 + xO - 2, -x + ThamSoTruyenVao.backgroundHeight / 2 - yO - 2, 5, 5);
//            g.fillRect(y + ThamSoTruyenVao.backgroundWidth / 2 + xO - 2, -x + ThamSoTruyenVao.backgroundHeight / 2 - yO - 2, 5, 5);
//            g.fillRect(x + ThamSoTruyenVao.backgroundWidth / 2 + xO - 2, -y + ThamSoTruyenVao.backgroundHeight / 2 - yO - 2, 5, 5);
//            if (p < 0) {
//                p += 4 * x + 6;
//            } else {
//                p += 4 * (x - y) + 10;
//                y -= 5;
//            }
//            x += 5;
//        }
        g.setColor(Color.RED);  //dat mau hinh ve la red
        //khai bao cac bien cua thuat toan MidPoint
        int x, y;
        float p = 125.0f / 4 - 5 * r;
        x = 0;
        y = r;
        while (x <= y) { //ve 1/8 duong tron
            g.fillRect(x + ThamSoTruyenVao.backgroundWidth / 2 + xO - 2, y + ThamSoTruyenVao.backgroundHeight / 2 - yO - 2, 5, 5);
            g.fillRect(y + ThamSoTruyenVao.backgroundWidth / 2 + xO - 2, x + ThamSoTruyenVao.backgroundHeight / 2 - yO - 2, 5, 5);
            g.fillRect(-y + ThamSoTruyenVao.backgroundWidth / 2 + xO - 2, x + ThamSoTruyenVao.backgroundHeight / 2 - yO - 2, 5, 5);
            g.fillRect(-x + ThamSoTruyenVao.backgroundWidth / 2 + xO - 2, y + ThamSoTruyenVao.backgroundHeight / 2 - yO - 2, 5, 5);
            g.fillRect(-x + ThamSoTruyenVao.backgroundWidth / 2 + xO - 2, -y + ThamSoTruyenVao.backgroundHeight / 2 - yO - 2, 5, 5);
            g.fillRect(-y + ThamSoTruyenVao.backgroundWidth / 2 + xO - 2, -x + ThamSoTruyenVao.backgroundHeight / 2 - yO - 2, 5, 5);
            g.fillRect(y + ThamSoTruyenVao.backgroundWidth / 2 + xO - 2, -x + ThamSoTruyenVao.backgroundHeight / 2 - yO - 2, 5, 5);
            g.fillRect(x + ThamSoTruyenVao.backgroundWidth / 2 + xO - 2, -y + ThamSoTruyenVao.backgroundHeight / 2 - yO - 2, 5, 5);
            if (p < 0) {
                p += 10 * x + 75;
            } else {
                p += 10 * (x - y) + 125;
                y -= 5;
            }
            x += 5;
        }
    }

    public void drawLien1(Graphics2D g, Color c) {

//        g.setColor(c);  //dat mau hinh ve la red
//        //khai bao cac bien cua thuat toan Bresenham
//        int x, y, p;
//        p = 3 - 2 * r;
//        x = 0;
//        y = r;
//        while (x <= y) { //ve 1/8 duong tron
//            g.fillRect(x + 700 / 2 + xO - 2, y + ThamSoTruyenVao.backgroundHeight / 2 - yO - 2, 5, 5);
//            g.fillRect(y + 700 / 2 + xO - 2, x + ThamSoTruyenVao.backgroundHeight / 2 - yO - 2, 5, 5);
//            g.fillRect(-y + 700 / 2 + xO - 2, x + ThamSoTruyenVao.backgroundHeight / 2 - yO - 2, 5, 5);
//            g.fillRect(-x + 700 / 2 + xO - 2, y + ThamSoTruyenVao.backgroundHeight / 2 - yO - 2, 5, 5);
//            g.fillRect(-x + 700 / 2 + xO - 2, -y + ThamSoTruyenVao.backgroundHeight / 2 - yO - 2, 5, 5);
//            g.fillRect(-y + 700 / 2 + xO - 2, -x + ThamSoTruyenVao.backgroundHeight / 2 - yO - 2, 5, 5);
//            g.fillRect(y + 700 / 2 + xO - 2, -x + ThamSoTruyenVao.backgroundHeight / 2 - yO - 2, 5, 5);
//            g.fillRect(x + 700 / 2 + xO - 2, -y + ThamSoTruyenVao.backgroundHeight / 2 - yO - 2, 5, 5);
//            if (p < 0) {
//                p += 4 * x + 6;
//            } else {
//                p += 4 * (x - y) + 10;
//                y -= 5;
//            }
//            x += 5;
//        }
        
        g.setColor(c);  //dat mau hinh ve la red
        //khai bao cac bien cua thuat toan MidPoint
        int x, y;
        float p = 125.0f / 4 - 5 * r;
        x = 0;
        y = r;
        while (x <= y) { //ve 1/8 duong tron
            g.fillRect(x + ThamSoTruyenVao.backgroundWidthChuyenDong / 2 + xO - 2, y + ThamSoTruyenVao.backgroundHeightChuyenDong / 2 - yO - 2, 5, 5);
            g.fillRect(y + ThamSoTruyenVao.backgroundWidthChuyenDong / 2 + xO - 2, x + ThamSoTruyenVao.backgroundHeightChuyenDong / 2 - yO - 2, 5, 5);
            g.fillRect(-y + ThamSoTruyenVao.backgroundWidthChuyenDong / 2 + xO - 2, x + ThamSoTruyenVao.backgroundHeightChuyenDong / 2 - yO - 2, 5, 5);
            g.fillRect(-x + ThamSoTruyenVao.backgroundWidthChuyenDong / 2 + xO - 2, y + ThamSoTruyenVao.backgroundHeightChuyenDong / 2 - yO - 2, 5, 5);
            g.fillRect(-x + ThamSoTruyenVao.backgroundWidthChuyenDong / 2 + xO - 2, -y + ThamSoTruyenVao.backgroundHeightChuyenDong / 2 - yO - 2, 5, 5);
            g.fillRect(-y + ThamSoTruyenVao.backgroundWidthChuyenDong / 2 + xO - 2, -x + ThamSoTruyenVao.backgroundHeightChuyenDong / 2 - yO - 2, 5, 5);
            g.fillRect(y + ThamSoTruyenVao.backgroundWidthChuyenDong / 2 + xO - 2, -x + ThamSoTruyenVao.backgroundHeightChuyenDong / 2 - yO - 2, 5, 5);
            g.fillRect(x + ThamSoTruyenVao.backgroundWidthChuyenDong / 2 + xO - 2, -y + ThamSoTruyenVao.backgroundHeightChuyenDong / 2 - yO - 2, 5, 5);
            if (p < 0) {
                p += 10 * x + 75;
            } else {
                p += 10 * (x - y) + 125;
                y -= 5;
            }
            x += 5;
        }
    }
}
