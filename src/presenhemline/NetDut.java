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
public class NetDut extends Canvas {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    
    public NetDut (int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    
    @Override
    public void paint(Graphics g) {  
        setBackground(Color.WHITE);  //dat mau nen la white
        setForeground(Color.RED);  //dat mau hinh ve la red
        //khai bao cac bien trong thuat toan Presenhem
        int x, y, Dx, Dy, p;
        Dx = abs(x2 - x1);
        Dy = abs(y2 - y1);
        p = 2*Dy - Dx;
        x = x1;
        y = y1;
        int x_unit = 1, y_unit = 1;
        g.fillRect(x, y, 1, 1); //ve diem pixel dau tien
        int dem = 0;
        //xét trường hợp để cho y_unit và x_unit để vẽ tăng lên hay giảm xuống
        if (x2 - x1 < 0)
            x_unit = -x_unit;
        if (y2 - y1 < 0)
            y_unit = -y_unit;
 
        if (x1 == x2)   // trường hợp vẽ đường thẳng đứng
        {
            while (y != y2)
            {
                y += y_unit;
                if (dem < 10) {
                    g.fillRect(x, y, 1, 1);
                    dem++;
                }    
                else if (dem < 20)
                    dem++;
                else
                    dem = 0;
            }
        }
 
        else if (y1 == y2)  // trường hợp vẽ đường ngang
        {
            while (x != x2)
            {
                x += x_unit;
                if (dem < 10) {
                    g.fillRect(x, y, 1, 1);
                    dem++;
                }    
                else if (dem < 20)
                    dem++;
                else
                    dem = 0;
            }
        }
            // trường hợp vẽ các đường xiên
        else{          
            while(x != x2){
                if (p<0) p += 2*Dy;
                else{
                    p += 2*(Dy-Dx);
                    y += y_unit;
                }
                x += x_unit;
                if (dem < 10) {
                    g.fillRect(x, y, 1, 1);
                    dem++;
                }    
                else if (dem < 20)
                    dem++;
                else
                    dem = 0;
            }
        }
    }  
}
