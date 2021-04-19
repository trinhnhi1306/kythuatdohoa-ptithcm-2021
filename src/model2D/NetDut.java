/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model2D;

import java.awt.Color;
import java.awt.Graphics;
//import static java.lang.Math.abs;
import javax.swing.JPanel;

/**
 *
 * @author Apple Bee
 */
public class NetDut {

    private int x1, x2, y1, y2;

    public NetDut(int x1, int y1, int x2, int y2) {
        this.x1 = x1*5;
        this.y1 = y1*5;
        this.x2 = x2*5;
        this.y2 = y2*5;
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

    public JPanel draw() {
        JPanel panel = new JPanel() {

            @Override
            protected void paintComponent(Graphics g) {
                // TODO Auto-generated method stub
                super.paintComponent(g);
                setForeground(Color.RED);  //dat mau hinh ve la red
                int dem = 0;
                int x, y, Dx, Dy, p;
                Dx = Math.abs(x2 - x1);
                Dy = Math.abs(y2 - y1);

                x = x1;
                y = y1;
                int x_unit = 1, y_unit = 1;

                g.fillRect(x + 250 - 1, 250 - y - 1, 3, 3);

                //xét trường hợp để cho y_unit và x_unit để vẽ tăng lên hay giảm xuống
                if (x2 - x1 < 0) {
                    x_unit = -x_unit;
                }
                if (y2 - y1 < 0) {
                    y_unit = -y_unit;
                }
                if (Dx >= Dy) {
                    p = 2 * Dy - Dx;

                    while (x != x2) {
                        if (p < 0) {
                            p += 2 * Dy;
                        } else {
                            p += 2 * (Dy - Dx);
                            y += y_unit;
                        }
                        x += x_unit;
                        if (dem < 10) {
                            g.fillRect(x + 250 - 1, 250 - y - 1, 3, 3);
                            dem++;
                        }
                        else if (dem < 20)
                            dem++;
                        else
                            dem = 0;
                    }
                } else {
                    p = 2 * Dx - Dy;

                    while (y != y2) {
                        if (p < 0) {
                            p += 2 * Dx;
                        } else {
                            p += 2 * (Dx - Dy);
                            x += x_unit;
                        }
                        y += y_unit;
                        if (dem < 10) {
                            g.fillRect(x + 250 - 1, 250 - y - 1, 3, 3);
                            dem++;
                        }
                        else if (dem < 20)
                            dem++;
                        else
                            dem = 0;
                        
                    }
                }
            }
        };
        panel.setOpaque(false);
        panel.setSize(500, 500);//set size cho vua jpanel ma minh ve
        panel.setVisible(true);
        return panel;
    }
}