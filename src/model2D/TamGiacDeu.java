/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model2D;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 *
 * @author Apple Bee
 */
public class TamGiacDeu {

    private int xDinh, yDinh, canh;

    public TamGiacDeu(int xDinh, int yDinh, int canh) {
        this.xDinh = xDinh;
        this.yDinh = yDinh;
        this.canh = canh;
    }

    public int getxDinh() {
        return xDinh;
    }

    public void setxDinh(int xDinh) {
        this.xDinh = xDinh;
    }

    public int getyDinh() {
        return yDinh;
    }

    public void setyDinh(int yDinh) {
        this.yDinh = yDinh;
    }

    public int getCanh() {
        return canh;
    }

    public void setCanh(int canh) {
        this.canh = canh;
    }

    public void draw(Graphics2D g) {
        g.setColor(Color.RED);  //dat mau hinh ve la red
        //khai bao tọa độ các đỉnh
        Diem2D a = new Diem2D(xDinh, yDinh);
        Diem2D b = new Diem2D((int) (xDinh - canh / 2), (int) (yDinh - canh * (Math.sqrt(3.0) / 2)));
        Diem2D c = new Diem2D((int) (xDinh + canh / 2), (int) (yDinh - canh * (Math.sqrt(3.0) / 2)));

        //vẽ cạnh AB
        DoanThang ab = new DoanThang(a.getX(), a.getY(), b.getX(), b.getY());
        ab.draw(g);

        //vẽ cạnh BC
        DoanThang bc = new DoanThang(c.getX(), c.getY(), b.getX(), b.getY());
        bc.draw(g);

        //vẽ cạnh AC
        DoanThang ac = new DoanThang(a.getX(), a.getY(), c.getX(), c.getY());
        ac.draw(g);

    }

}
