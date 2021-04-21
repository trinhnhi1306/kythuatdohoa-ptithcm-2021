/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model2D;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Apple Bee
 */
public class DuongTron {
    private int xO, yO, r;

    public DuongTron(int xO, int yO, int r) {
        this.xO = xO*5;
        this.yO = yO*5;
        this.r = r*5;
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

    public JPanel draw () {
        JPanel panel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                setForeground(Color.RED);  //dat mau hinh ve la red
                //khai bao cac bien cua thuat toan Presenhem
                int dem = 0;
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
                    if (dem < 5) {
                        g.fillOval(x + ThamSoTruyenVao.backgroundWidth/2 + xO - 1, y + ThamSoTruyenVao.backgroundHeight/2 - yO - 1, 3, 3);
                        g.fillOval(y + ThamSoTruyenVao.backgroundWidth/2 + xO - 1, x + ThamSoTruyenVao.backgroundHeight/2 - yO - 1, 3, 3);
                        g.fillOval(-y + ThamSoTruyenVao.backgroundWidth/2 + xO - 1, x + ThamSoTruyenVao.backgroundHeight/2 - yO - 1, 3, 3);
                        g.fillOval(-x + ThamSoTruyenVao.backgroundWidth/2 + xO - 1, y + ThamSoTruyenVao.backgroundHeight/2 - yO - 1, 3, 3);
                        g.fillOval(-x + ThamSoTruyenVao.backgroundWidth/2 + xO - 1, -y + ThamSoTruyenVao.backgroundHeight/2 - yO - 1, 3, 3);
                        g.fillOval(-y + ThamSoTruyenVao.backgroundWidth/2 + xO - 1, -x + ThamSoTruyenVao.backgroundHeight/2 - yO - 1, 3, 3);
                        g.fillOval(y + ThamSoTruyenVao.backgroundWidth/2 + xO - 1, -x + ThamSoTruyenVao.backgroundHeight/2 - yO - 1, 3, 3);
                        g.fillOval(x + ThamSoTruyenVao.backgroundWidth/2 + xO - 1, -y + ThamSoTruyenVao.backgroundHeight/2 - yO - 1, 3, 3);
                        dem++;
                    }
                    else if (dem < 10)
                        dem++;
                    else {
                        dem = 0;
                        g.fillOval(x + ThamSoTruyenVao.backgroundWidth/2 + xO - 1, y + ThamSoTruyenVao.backgroundHeight/2 - yO - 1, 3, 3);
                        g.fillOval(y + ThamSoTruyenVao.backgroundWidth/2 + xO - 1, x + ThamSoTruyenVao.backgroundHeight/2 - yO - 1, 3, 3);
                        g.fillOval(-y + ThamSoTruyenVao.backgroundWidth/2 + xO - 1, x + ThamSoTruyenVao.backgroundHeight/2 - yO - 1, 3, 3);
                        g.fillOval(-x + ThamSoTruyenVao.backgroundWidth/2 + xO - 1, y + ThamSoTruyenVao.backgroundHeight/2 - yO - 1, 3, 3);
                        g.fillOval(-x + ThamSoTruyenVao.backgroundWidth/2 + xO - 1, -y + ThamSoTruyenVao.backgroundHeight/2 - yO - 1, 3, 3);
                        g.fillOval(-y + ThamSoTruyenVao.backgroundWidth/2 + xO - 1, -x + ThamSoTruyenVao.backgroundHeight/2 - yO - 1, 3, 3);
                        g.fillOval(y + ThamSoTruyenVao.backgroundWidth/2 + xO - 1, -x + ThamSoTruyenVao.backgroundHeight/2 - yO - 1, 3, 3);
                        g.fillOval(x + ThamSoTruyenVao.backgroundWidth/2 + xO - 1, -y + ThamSoTruyenVao.backgroundHeight/2 - yO - 1, 3, 3);
                    }
                }
            }
        };
        panel.setOpaque(false);
        panel.setSize(ThamSoTruyenVao.backgroundWidth, ThamSoTruyenVao.backgroundHeight);
        panel.setVisible(true);
        return panel;
    }
}
