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
public class MuiTen {

    private int x1, x2, y1, y2;

    public MuiTen(int x1, int y1, int x2, int y2) {
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

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public void draw(Graphics2D g) {
        g.setColor(Color.RED);  //dat mau hinh ve la red

        //khai bao tọa độ các đỉnh
        int xB, yB, xH, yH, xC, yC, xD, yD, AB;
        int a = x2 - x1;
        int b = y2 - y1;
        xB = x2;
        yB = y2;
        AB = (int) Math.sqrt((Math.pow(a * 1.0, 2.0)) + Math.pow(b * 1.0, 2.0));
        // Tính tọa độ của H
        xH = (int) (xB - (a / (AB / 10.0)));
        yH = (int) (yB - (b / (AB / 10.0)));

        // Tính tọa độ của C
        if (a == 0) {
            yC = yH;
            xC = xH - (AB / 10);
        } else {
            yC = (int) (yH - Math.sqrt((double) ((AB/5.0) / (Math.pow((double) (b / a), 2.0) + 1)))); // 
            xC = (int) ((a * xH + b * yH - b * yC) / a);
        }
        // Tính tọa độ của D
        xD = 2 * xH - xC;
        yD = 2 * yH - yC;
//        System.out.println(xB + "-" + yB + " " + xD + "-" + yD + " " + xC + "-" + yC);
//        System.out.println(x1 + "-" + y1 + " " + x2 + "-" + y2 + " " + AB);
        //vẽ dường thẳng
        DoanThang dt = new DoanThang(x1, y1, x2, y2);
        dt.draw(g);
        
        //vẽ cạnh bên trái BD
        DoanThang bd = new DoanThang(xB, yB, xD, yD);
        bd.draw(g);

        //vẽ cạnh bên phải BC
        DoanThang bc = new DoanThang(xB, yB, xC, yC);
        bc.draw(g);

        //vẽ cạnh đáy DC
        DoanThang dc = new DoanThang(xD, yD, xC, yC);
        dc.draw(g);
        
    }
}
