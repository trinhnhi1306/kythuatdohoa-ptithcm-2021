/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presenhemline;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Apple Bee
 */
public class DuongTron extends Canvas{
    private int xO, yO, r;

    public DuongTron(int xO, int yO, int r) {
        this.xO = xO;
        this.yO = yO;
        this.r = r;
    }

    @Override
    public void paint(Graphics g) {
        setBackground(Color.WHITE);  //dat mau nen la white
        setForeground(Color.RED);  //dat mau hinh ve la red
        //khai bao cac bien cua thuat toan Presenhem
        int x, y, p, x0;
        p = 3 - 2*r;
        x = 0;
        y = r;
        g.fillRect(x, y, 1, 1);
        while (x < y) { //ve 1/8 duong tron
            if (p < 0) p += 4*x + 6;
            else {
                p += 4*(x - y) + 10;
                y -= 1;
            }
            x += 1;
            g.fillRect(x + xO, y + yO, 1, 1);
            g.fillRect(y + xO, x + yO, 1, 1);
            g.fillRect(-y + xO, x + yO, 1, 1);
            g.fillRect(-x + xO, y + yO, 1, 1);
            g.fillRect(-x + xO, -y + yO, 1, 1);
            g.fillRect(-y + xO, -x + yO, 1, 1);
            g.fillRect(y + xO, -x + yO, 1, 1);
            g.fillRect(x + xO, -y + yO, 1, 1);
        }
    }
}
