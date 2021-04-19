/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap;

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
        this.xO = xO;
        this.yO = yO;
        this.r = r;
    }

    public JPanel draw () {
        JPanel panel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                setBackground(Color.WHITE);  //dat mau nen la white
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
                        g.fillRect(x + BasicParam.backgroundWidth/2 + xO - 1, y + BasicParam.backgroundHeight/2 - yO - 1, 2, 2);
                        g.fillRect(y + BasicParam.backgroundWidth/2 + xO - 1, x + BasicParam.backgroundHeight/2 - yO - 1, 2, 2);
                        g.fillRect(-y + BasicParam.backgroundWidth/2 + xO - 1, x + BasicParam.backgroundHeight/2 - yO - 1, 2, 2);
                        g.fillRect(-x + BasicParam.backgroundWidth/2 + xO - 1, y + BasicParam.backgroundHeight/2 - yO - 1, 2, 2);
                        g.fillRect(-x + BasicParam.backgroundWidth/2 + xO - 1, -y + BasicParam.backgroundHeight/2 - yO - 1, 2, 2);
                        g.fillRect(-y + BasicParam.backgroundWidth/2 + xO - 1, -x + BasicParam.backgroundHeight/2 - yO - 1, 2, 2);
                        g.fillRect(y + BasicParam.backgroundWidth/2 + xO - 1, -x + BasicParam.backgroundHeight/2 - yO - 1, 2, 2);
                        g.fillRect(x + BasicParam.backgroundWidth/2 + xO - 1, -y + BasicParam.backgroundHeight/2 - yO - 1, 2, 2);
                        dem++;
                    }
                    else if (dem < 10)
                        dem++;
                    else {
                        dem = 0;
                        g.fillRect(x + BasicParam.backgroundWidth/2 + xO - 1, y + BasicParam.backgroundHeight/2 - yO - 1, 2, 2);
                        g.fillRect(y + BasicParam.backgroundWidth/2 + xO - 1, x + BasicParam.backgroundHeight/2 - yO - 1, 2, 2);
                        g.fillRect(-y + BasicParam.backgroundWidth/2 + xO - 1, x + BasicParam.backgroundHeight/2 - yO - 1, 2, 2);
                        g.fillRect(-x + BasicParam.backgroundWidth/2 + xO - 1, y + BasicParam.backgroundHeight/2 - yO - 1, 2, 2);
                        g.fillRect(-x + BasicParam.backgroundWidth/2 + xO - 1, -y + BasicParam.backgroundHeight/2 - yO - 1, 2, 2);
                        g.fillRect(-y + BasicParam.backgroundWidth/2 + xO - 1, -x + BasicParam.backgroundHeight/2 - yO - 1, 2, 2);
                        g.fillRect(y + BasicParam.backgroundWidth/2 + xO - 1, -x + BasicParam.backgroundHeight/2 - yO - 1, 2, 2);
                        g.fillRect(x + BasicParam.backgroundWidth/2 + xO - 1, -y + BasicParam.backgroundHeight/2 - yO - 1, 2, 2);
                    }
                }
            }
        };
        panel.setOpaque(false);
        panel.setSize(500, 500);
        panel.setVisible(true);
        return panel;
    }
}
