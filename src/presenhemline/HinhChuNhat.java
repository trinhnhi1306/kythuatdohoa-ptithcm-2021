/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presenhemline;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import static java.lang.Math.abs;

/**
 *
 * @author Apple Bee
 */
public class HinhChuNhat extends Canvas {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    
    public HinhChuNhat (int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    
    @Override
    public void paint(Graphics g) {  
        setBackground(Color.WHITE);  //dat mau nen la white
        setForeground(Color.RED);  //dat mau hinh ve la red
        //khai bao 4 diem hinh chu nhat
        int xA = x1, yA = y2;   //           A----------------B (x2, y2)
        int xB = x2, yB = y2;   //           |                |
        int xC = x2, yC = y1;   //           |                |
        int xD = x1, yD = y1;   //  (x1, y1) D----------------C
        //khai bao cac bien trong thuat toan Presenhem, vi chi ve duong thang ngang va doc nen khong can Dx, Dy, P
        int x = x1, y = y1;
        int x_unit = 1, y_unit = 1;
 
        //xét trường hợp để cho y_unit và x_unit để vẽ tăng lên hay giảm xuống
        if (x2 - x1 < 0)
            x_unit = -x_unit;
        if (y2 - y1 < 0)
            y_unit = -y_unit;
        //ve hai doan thang doc DA va CB
        g.fillRect(xD, yD, 1, 1); //ve diem D
        g.fillRect(xC, yC, 1, 1); //ve diem C
        while (y != y2)
        {
            y += y_unit;
            g.fillRect(xD, y, 1, 1);
            g.fillRect(xC, y, 1, 1);
        }
        //ve hai doan thang ngang AB va DC
        g.fillRect(xD, yD, 1, 1); //ve diem A
        while (x != x2)
        {
            x += x_unit;
            g.fillRect(x, yA, 1, 1);
            g.fillRect(x, yD, 1, 1);
        }
    }  
    
}
