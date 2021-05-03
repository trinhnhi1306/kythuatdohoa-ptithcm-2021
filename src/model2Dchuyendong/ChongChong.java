/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model2Dchuyendong;

import biendoi2D.Quay;
import biendoi2D.TinhTien;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;
import model2D.Diem2D;
import model2D.DoanThang;
import model2D.DuongTron;
import model2D.ThamSoTruyenVao;

/**
 *
 * @author Apple Bee
 */
public class ChongChong {

    private int x, y, banKinh;
    public Diem2D a1, a2, a3, a4, b1, b2, b3, b4;

    public ChongChong(int x, int y, int banKinh) {
        this.x = x;
        this.y = y;
        this.banKinh = banKinh;
        this.a1 = new Diem2D(x, y + banKinh);
        this.a2 = new Diem2D(x + banKinh, y);
        this.a3 = new Diem2D(x, y - banKinh);
        this.a4 = new Diem2D(x - banKinh, y);
        this.b1 = new Diem2D(x + banKinh / 2, y + banKinh / 2);
        this.b2 = new Diem2D(x + banKinh / 2, y - banKinh / 2);
        this.b3 = new Diem2D(x - banKinh / 2, y - banKinh / 2);
        this.b4 = new Diem2D(x - banKinh / 2, y + banKinh / 2);
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

    public Diem2D getA1() {
        return a1;
    }

    public void setA1(Diem2D a1) {
        this.a1 = a1;
    }

    public Diem2D getA2() {
        return a2;
    }

    public void setA2(Diem2D a2) {
        this.a2 = a2;
    }

    public Diem2D getA3() {
        return a3;
    }

    public void setA3(Diem2D a3) {
        this.a3 = a3;
    }

    public Diem2D getA4() {
        return a4;
    }

    public void setA4(Diem2D a4) {
        this.a4 = a4;
    }

    public Diem2D getB1() {
        return b1;
    }

    public void setB1(Diem2D b1) {
        this.b1 = b1;
    }

    public Diem2D getB2() {
        return b2;
    }

    public void setB2(Diem2D b2) {
        this.b2 = b2;
    }

    public Diem2D getB3() {
        return b3;
    }

    public void setB3(Diem2D b3) {
        this.b3 = b3;
    }

    public Diem2D getB4() {
        return b4;
    }

    public void setB4(Diem2D b4) {
        this.b4 = b4;
    }

    public void draw(Graphics2D g) {
        BufferedImage Buferr = new BufferedImage(850, 850, BufferedImage.TYPE_INT_ARGB);
        Graphics BufGraphics = Buferr.getGraphics();
        DoanThang a1a3 = new DoanThang(a1.getX(), a1.getY(), a3.getX(), a3.getY());
        a1a3.draw1((Graphics2D) BufGraphics);

        DoanThang a2a4 = new DoanThang(a2.getX(), a2.getY(), a4.getX(), a4.getY());
        a2a4.draw1((Graphics2D) BufGraphics);

        DoanThang b1b3 = new DoanThang(b1.getX(), b1.getY(), b3.getX(), b3.getY());
        b1b3.draw1((Graphics2D) BufGraphics);

        DoanThang b2b4 = new DoanThang(b2.getX(), b2.getY(), b4.getX(), b4.getY());
        b2b4.draw1((Graphics2D) BufGraphics);

        DoanThang a1b1 = new DoanThang(a1.getX(), a1.getY(), b1.getX(), b1.getY());
        a1b1.draw1((Graphics2D) BufGraphics);

        DoanThang a2b2 = new DoanThang(a2.getX(), a2.getY(), b2.getX(), b2.getY());
        a2b2.draw1((Graphics2D) BufGraphics);

        DoanThang a3b3 = new DoanThang(a3.getX(), a3.getY(), b3.getX(), b3.getY());
        a3b3.draw1((Graphics2D) BufGraphics);

        DoanThang a4b4 = new DoanThang(a4.getX(), a4.getY(), b4.getX(), b4.getY());
        a4b4.draw1((Graphics2D) BufGraphics);

        DuongTron dt = new DuongTron(x, y, banKinh / 10);
        dt.drawLien1((Graphics2D) BufGraphics);

        //to mau canh 1        
        BufGraphics.setColor(Color.yellow);
        int xCanh1[] = {700 / 2 + a1.getX() * 5, 700 / 2 + b1.getX() * 5, 700 / 2 + x * 5};
        int yCanh1[] = {500 / 2 - a1.getY() * 5, 500 / 2 - b1.getY() * 5, 500 / 2 - y * 5};
        BufGraphics.fillPolygon(xCanh1, yCanh1, 3);
        //to mau canh 2    
        BufGraphics.setColor(Color.yellow);
        int xCanh2[] = {700 / 2 + a2.getX() * 5, 700 / 2 + b2.getX() * 5, 700 / 2 + x * 5};
        int yCanh2[] = {500 / 2 - a2.getY() * 5, 500 / 2 - b2.getY() * 5, 500 / 2 - y * 5};
        BufGraphics.fillPolygon(xCanh2, yCanh2, 3);
        //to mau canh 3       
        BufGraphics.setColor(Color.yellow);
        int xCanh3[] = {700 / 2 + a3.getX() * 5, 700 / 2 + b3.getX() * 5, 700 / 2 + x * 5};
        int yCanh3[] = {500 / 2 - a3.getY() * 5, 500 / 2 - b3.getY() * 5, 500 / 2 - y * 5};
        BufGraphics.fillPolygon(xCanh3, yCanh3, 3);
        //to mau canh 4      
        BufGraphics.setColor(Color.yellow);
        int xCanh4[] = {700 / 2 + a4.getX() * 5, 700 / 2 + b4.getX() * 5, 700 / 2 + x * 5};
        int yCanh4[] = {500 / 2 - a4.getY() * 5, 500 / 2 - b4.getY() * 5, 500 / 2 - y * 5};
        BufGraphics.fillPolygon(xCanh4, yCanh4, 3);
        //to mau tam
        BufGraphics.setColor(Color.blue);
        BufGraphics.fillOval(700 / 2 + x * 5 - banKinh / 2, 500 / 2 - y * 5 - banKinh / 2, banKinh + 1, banKinh + 1);
        g.drawImage(Buferr, 0, 0, null);
    }

    public void drawQuay(Graphics2D g, float goc) {
        goc = goc * (float) Math.PI / 180;

        Diem2D tam = new Diem2D(x, y);
        a1 = Quay.QuayTamBatKy(tam, a1, goc);
        a2 = Quay.QuayTamBatKy(tam, a2, goc);
        a3 = Quay.QuayTamBatKy(tam, a3, goc);
        a4 = Quay.QuayTamBatKy(tam, a4, goc);

        b1 = Quay.QuayTamBatKy(tam, b1, goc);
        b2 = Quay.QuayTamBatKy(tam, b2, goc);
        b3 = Quay.QuayTamBatKy(tam, b3, goc);
        b4 = Quay.QuayTamBatKy(tam, b4, goc);
        
        draw(g);
    }

    public void drawTinhTien(Graphics2D g, int dx, int dy) {
        a1 = TinhTien.TinhTien(a1, dx, dy);
        a2 = TinhTien.TinhTien(a2, dx, dy);
        a3 = TinhTien.TinhTien(a3, dx, dy);
        a4 = TinhTien.TinhTien(a4, dx, dy);

        b1 = TinhTien.TinhTien(b1, dx, dy);
        b2 = TinhTien.TinhTien(b2, dx, dy);
        b3 = TinhTien.TinhTien(b3, dx, dy);
        b4 = TinhTien.TinhTien(b4, dx, dy);

        x += dx;
        y += dy;
        
        ThamSoTruyenVao.xChongChong = x;
        ThamSoTruyenVao.yChongChong = y;

        draw(g);
//        DoanThang a1a3 = new DoanThang(a1.getX(), a1.getY(), a3.getX(), a3.getY());
//        a1a3.draw1(g);
//
//        DoanThang a2a4 = new DoanThang(a2.getX(), a2.getY(), a4.getX(), a4.getY());
//        a2a4.draw1(g);
//
//        DoanThang b1b3 = new DoanThang(b1.getX(), b1.getY(), b3.getX(), b3.getY());
//        b1b3.draw1(g);
//
//        DoanThang b2b4 = new DoanThang(b2.getX(), b2.getY(), b4.getX(), b4.getY());
//        b2b4.draw1(g);
//
//        DoanThang a1b1 = new DoanThang(a1.getX(), a1.getY(), b1.getX(), b1.getY());
//        a1b1.draw1(g);
//
//        DoanThang a2b2 = new DoanThang(a2.getX(), a2.getY(), b2.getX(), b2.getY());
//        a2b2.draw1(g);
//
//        DoanThang a3b3 = new DoanThang(a3.getX(), a3.getY(), b3.getX(), b3.getY());
//        a3b3.draw1(g);
//
//        DoanThang a4b4 = new DoanThang(a4.getX(), a4.getY(), b4.getX(), b4.getY());
//        a4b4.draw1(g);
//
//        DuongTron dt = new DuongTron(x, y, banKinh / 10);
//        dt.drawLien1(g);
//
//        //to mau canh 1        
//        g.setColor(Color.yellow);
//        int xCanh1[] = {700 / 2 + a1.getX() * 5, 700 / 2 + b1.getX() * 5, 700 / 2 + x * 5};
//        int yCanh1[] = {500 / 2 - a1.getY() * 5, 500 / 2 - b1.getY() * 5, 500 / 2 - y * 5};
//        g.fillPolygon(xCanh1, yCanh1, 3);
//        //to mau canh 2    
//        g.setColor(Color.yellow);
//        int xCanh2[] = {700 / 2 + a2.getX() * 5, 700 / 2 + b2.getX() * 5, 700 / 2 + x * 5};
//        int yCanh2[] = {500 / 2 - a2.getY() * 5, 500 / 2 - b2.getY() * 5, 500 / 2 - y * 5};
//        g.fillPolygon(xCanh2, yCanh2, 3);
//        //to mau canh 3       
//        g.setColor(Color.yellow);
//        int xCanh3[] = {700 / 2 + a3.getX() * 5, 700 / 2 + b3.getX() * 5, 700 / 2 + x * 5};
//        int yCanh3[] = {500 / 2 - a3.getY() * 5, 500 / 2 - b3.getY() * 5, 500 / 2 - y * 5};
//        g.fillPolygon(xCanh3, yCanh3, 3);
//        //to mau canh 4      
//        g.setColor(Color.yellow);
//        int xCanh4[] = {700 / 2 + a4.getX() * 5, 700 / 2 + b4.getX() * 5, 700 / 2 + x * 5};
//        int yCanh4[] = {500 / 2 - a4.getY() * 5, 500 / 2 - b4.getY() * 5, 500 / 2 - y * 5};
//        g.fillPolygon(xCanh4, yCanh4, 3);
//        //to mau tam
//        g.setColor(Color.blue);
//        g.fillOval(700 / 2 + x * 5 - banKinh / 2, 500 / 2 - y * 5 - banKinh / 2, banKinh + 1, banKinh + 1);

    }
}
