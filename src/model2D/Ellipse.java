/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model2D;

import java.awt.Color;
import java.awt.Graphics2D;
import static java.lang.Math.pow;

/**
 *
 * @author Apple Bee
 */
public class Ellipse {

    private int xO, yO, a, b;

    public Ellipse(int xO, int yO, int a, int b) {
        this.xO = xO * 5;
        this.yO = yO * 5;
        this.a = a * 5;
        this.b = b * 5;
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

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void draw(Graphics2D g) {

        g.setColor(Color.RED);  //dat mau hinh ve la red
        //khai bao cac bien cua thuat toan Midpoint
        int dem = 0;
        int dx, dy, p0, q0, x, y;
        x = 0;
        y = b;

        //Khai bao cac bien vung I
        p0 = (int) ((b * b) - (a * a * b) + (0.25 * a * a));
        dx = 2 * b * b * x;
        dy = 2 * a * a * y;
        g.fillRect(x + ThamSoTruyenVao.backgroundWidth / 2 + xO - 2, -y + ThamSoTruyenVao.backgroundHeight / 2 - yO - 2, 5, 5);
        g.fillRect(-x + ThamSoTruyenVao.backgroundWidth / 2 + xO - 2, -y + ThamSoTruyenVao.backgroundHeight / 2 - yO - 2, 5, 5);
        g.fillRect(x + ThamSoTruyenVao.backgroundWidth / 2 + xO - 2, y + ThamSoTruyenVao.backgroundHeight / 2 - yO - 2, 5, 5);
        g.fillRect(-x + ThamSoTruyenVao.backgroundWidth / 2 + xO - 2, y + ThamSoTruyenVao.backgroundHeight / 2 - yO - 2, 5, 5);
        //Ve vung I
        while (dx < dy) {
            // Ve diem dua tren doi xung
            
            // Kiem tra va cap nhat cac gia tri
            if (p0 < 0) {
                x++;
                dx = dx + (2 * b * b);
                p0 = p0 + dx + (b * b);
            } else {
                x++;
                y--;
                dx = dx + (2 * b * b);
                dy = dy - (2 * a * a);
                p0 = p0 + dx - dy + (b * b);
            }
            if ( x % 5 == 0) {
                int tempY = ThamSoTruyenVao.tinhXY(y);
                if (dem < 3) {
                    g.fillRect(x + ThamSoTruyenVao.backgroundWidth / 2 + xO - 2, -tempY + ThamSoTruyenVao.backgroundHeight / 2 - yO - 2, 5, 5);
                    g.fillRect(-x + ThamSoTruyenVao.backgroundWidth / 2 + xO - 2, -tempY + ThamSoTruyenVao.backgroundHeight / 2 - yO - 2, 5, 5);
                    dem++;
                } else if (dem < 5) {
                    dem++;
                } else {
                    dem = 0;
                    g.fillRect(x + ThamSoTruyenVao.backgroundWidth / 2 + xO - 2, -tempY + ThamSoTruyenVao.backgroundHeight / 2 - yO - 2, 5, 5);
                    g.fillRect(-x + ThamSoTruyenVao.backgroundWidth / 2 + xO - 2, -tempY + ThamSoTruyenVao.backgroundHeight / 2 - yO - 2, 5, 5);
                }
                g.fillRect(x + ThamSoTruyenVao.backgroundWidth / 2 + xO - 2, tempY + ThamSoTruyenVao.backgroundHeight / 2 - yO - 2, 5, 5);
                g.fillRect(-x + ThamSoTruyenVao.backgroundWidth / 2 + xO - 2, tempY + ThamSoTruyenVao.backgroundHeight / 2 - yO - 2, 5, 5);
            }
        }
        // Ve vung II
        q0 = Math.round(((b * b) * ((x + 0.5f) * (x + 0.5f))) + ((a * a) * ((y - 1) * (y - 1))) - (a * a * b * b));
        while (y > 0) {

            
            // Kiem tra va cap nhat cac gia tri
            if (q0 > 0) {
                y--;
                dy = dy - (2 * a * a);
                q0 = q0 + (a * a) - dy;
            } else {
                y--;
                x++;
                dx = dx + (2 * b * b);
                dy = dy - (2 * a * a);
                q0 = q0 + dx - dy + (a * a);
            }
            // Ve 4 diem
            if ( y % 5 == 0) {
                int tempX = ThamSoTruyenVao.tinhXY(x);
                if (dem < 3) {
                    g.fillRect(tempX + ThamSoTruyenVao.backgroundWidth / 2 + xO - 2, -y + ThamSoTruyenVao.backgroundHeight / 2 - yO - 2, 5, 5);
                    g.fillRect(-tempX + ThamSoTruyenVao.backgroundWidth / 2 + xO - 2, -y + ThamSoTruyenVao.backgroundHeight / 2 - yO - 2, 5, 5);
                    dem++;
                } else if (dem < 5) {
                    dem++;
                } else {
                    dem = 0;
                    g.fillRect(tempX + ThamSoTruyenVao.backgroundWidth / 2 + xO - 2, -y + ThamSoTruyenVao.backgroundHeight / 2 - yO - 2, 5, 5);
                    g.fillRect(-tempX + ThamSoTruyenVao.backgroundWidth / 2 + xO - 2, -y + ThamSoTruyenVao.backgroundHeight / 2 - yO - 2, 5, 5);
                }
                g.fillRect(tempX + ThamSoTruyenVao.backgroundWidth / 2 + xO - 2, y + ThamSoTruyenVao.backgroundHeight / 2 - yO - 2, 5, 5);
                g.fillRect(-tempX + ThamSoTruyenVao.backgroundWidth / 2 + xO - 2, y + ThamSoTruyenVao.backgroundHeight / 2 - yO - 2, 5, 5);
            }

        }
    }

    public void drawLien(Graphics2D g) {

        g.setColor(Color.RED);  //dat mau hinh ve la red
        //khai bao cac bien cua thuat toan Midpoint
        int dx, dy, p0, q0, x, y;
        x = 0;
        y = b;

        //Khai bao cac bien vung I
        p0 = (int) ((b * b) - (a * a * b) + (0.25 * a * a));
        dx = 2 * b * b * x;
        dy = 2 * a * a * y;

        //Ve vung I
        while (dx < dy) {
            // Ve diem dua tren doi xung
            g.fillRect(x + 700 / 2 + xO - 1, y + ThamSoTruyenVao.backgroundHeight / 2 - yO - 1, 3, 3);
            g.fillRect(-x + 700 / 2 + xO - 1, y + ThamSoTruyenVao.backgroundHeight / 2 - yO - 1, 3, 3);

            // Kiem tra va cap nhat cac gia tri
            if (p0 < 0) {
                x += 1;
                dx = dx + (2 * b * b);
                p0 = p0 + dx + (b * b);
            } else {
                x += 1;
                y -= 1;
                dx = dx + (2 * b * b);
                dy = dy - (2 * a * a);
                p0 = p0 + dx - dy + (b * b);
            }
        }
        // Ve vung II
        q0 = (int) (((b * b) * ((x + 0.5) * (x + 0.5))) + ((a * a) * ((y - 1) * (y - 1))) - (a * a * b * b));
        while (y >= 0) {

            // Ve 4 diem
            g.fillRect(x + 700 / 2 + xO - 1, y + ThamSoTruyenVao.backgroundHeight / 2 - yO - 1, 3, 3);
            g.fillRect(-x + 700 / 2 + xO - 1, y + ThamSoTruyenVao.backgroundHeight / 2 - yO - 1, 3, 3);

            // Kiem tra va cap nhat cac gia tri
            if (q0 > 0) {
                y -= 1;
                dy = dy - (2 * a * a);
                q0 = q0 + (a * a) - dy;
            } else {
                y -= 1;
                x += 1;
                dx = dx + (2 * b * b);
                dy = dy - (2 * a * a);
                q0 = q0 + dx - dy + (a * a);
            }
        }
    }

    public void drawBresenhem(Graphics2D g) {
        g.setColor(Color.red);
        int dem = 0;
        float p, a2, b2;
        int x, y;
        a2 = (float) pow(a, 2);
        b2 = (float) pow(b, 2);
        x = 0;
        y = b;

        p = 2 * ((float) b2 / a2) - (2 * b) + 1;

        //ve nhanh thu 1 (tu tren xuong)
        while (((float) b2 / a2) * x <= y - 5) {
//            if (x % 5 == 0) {
                if (dem < 3) {
                    g.fillRect(x + ThamSoTruyenVao.backgroundWidth / 2 + xO - 2, -y + ThamSoTruyenVao.backgroundHeight / 2 - yO - 2, 5, 5);
                    g.fillRect(-x + ThamSoTruyenVao.backgroundWidth / 2 + xO - 2, -y + ThamSoTruyenVao.backgroundHeight / 2 - yO - 2, 5, 5);
                    dem++;
                } else if (dem < 5) {
                    dem++;
                } else {
                    dem = 0;
                    g.fillRect(x + ThamSoTruyenVao.backgroundWidth / 2 + xO - 2, -y + ThamSoTruyenVao.backgroundHeight / 2 - yO - 2, 5, 5);
                    g.fillRect(-x + ThamSoTruyenVao.backgroundWidth / 2 + xO - 2, -y + ThamSoTruyenVao.backgroundHeight / 2 - yO - 2, 5, 5);
                }
                g.fillRect(x + ThamSoTruyenVao.backgroundWidth / 2 + xO - 2, y + ThamSoTruyenVao.backgroundHeight / 2 - yO - 2, 5, 5);
                g.fillRect(-x + ThamSoTruyenVao.backgroundWidth / 2 + xO - 2, y + ThamSoTruyenVao.backgroundHeight / 2 - yO - 2, 5, 5);
//            }
            if (p < 0) {
                p = p + 2 * ((float) b2 / a2) * (2 * x + 3);
            } else {
                p = p - 4 * y + 2 * ((float) b2 / a2) * (2 * x + 3);
                y -= 5;
            }
            x += 5;
        }
        //ve nhanh thu 2 (tu duoi len)
        y = 0;
        x = a;
        p = 2 * ((float) a2 / b2) - 2 * a + 1;
        while (((float) a2 / b2) * y <= x) {
//            if (x % 5 == 0) { 
                if (dem < 3) {
                    g.fillRect(x + ThamSoTruyenVao.backgroundWidth / 2 + xO - 2, -y + ThamSoTruyenVao.backgroundHeight / 2 - yO - 2, 5, 5);
                    g.fillRect(-x + ThamSoTruyenVao.backgroundWidth / 2 + xO - 2, -y + ThamSoTruyenVao.backgroundHeight / 2 - yO - 2, 5, 5);
                    dem++;
                } else if (dem < 5) {
                    dem++;
                } else {
                    dem = 0;
                    g.fillRect(x + ThamSoTruyenVao.backgroundWidth / 2 + xO - 2, -y + ThamSoTruyenVao.backgroundHeight / 2 - yO - 2, 5, 5);
                    g.fillRect(-x + ThamSoTruyenVao.backgroundWidth / 2 + xO - 2, -y + ThamSoTruyenVao.backgroundHeight / 2 - yO - 2, 5, 5);
                }
                g.fillRect(x + ThamSoTruyenVao.backgroundWidth / 2 + xO - 2, y + ThamSoTruyenVao.backgroundHeight / 2 - yO - 2, 5, 5);
                g.fillRect(-x + ThamSoTruyenVao.backgroundWidth / 2 + xO - 2, y + ThamSoTruyenVao.backgroundHeight / 2 - yO - 2, 5, 5);
//            }
            if (p < 0) {
                p = p + 2 * ((float) a2 / b2) * (2 * y + 3);
            } else {
                p = p - 4 * x + 2 * ((float) a2 / b2) * (2 * y + 3);
                x -= 5;
            }
            y += 5;
        }
    }
    
    public void drawBresenhem1(Graphics2D g, Color c) {
        g.setColor(c);
        float p, a2, b2;
        int x, y;
        a2 = (float) pow(a, 2);
        b2 = (float) pow(b, 2);
        x = 0;
        y = b;

        p = 2 * ((float) b2 / a2) - (2 * b) + 1;

        //ve nhanh thu 1(tu tren xuong )
        while (((float) b2 / a2) * x <= y) {
            g.fillRect(x + 700 / 2 + xO - 2, -y + 500 / 2 - yO - 2, 5, 5);
            g.fillRect(-x + 700 / 2 + xO - 2, -y + 500 / 2 - yO - 2, 5, 5);
            g.fillRect(x + 700 / 2 + xO - 2, y + 500 / 2 - yO - 2, 5, 5);
            g.fillRect(-x + 700 / 2 + xO - 2, y + 500 / 2 - yO - 2, 5, 5);
            if (p < 0) {
                p = p + 2 * ((float) b2 / a2) * (2 * x + 3);
            } else {
                p = p - 4 * y + 2 * ((float) b2 / a2) * (2 * x + 3);
                y -= 5;
            }
            x += 5;
        }
        //ve nhanh thu 2(tu duoi len )
        y = 0;
        x = a;
        p = 2 * ((float) a2 / b2) - 2 * a + 1;
        while (((float) a2 / b2) * y <= x) {
            g.fillRect(x + 700 / 2 + xO - 2, -y + 500 / 2 - yO - 2, 5, 5);
            g.fillRect(-x + 700 / 2 + xO - 2, -y + 500 / 2 - yO - 2, 5, 5);
            g.fillRect(x + 700 / 2 + xO - 2, y + 500 / 2 - yO - 2, 5, 5);
            g.fillRect(-x + 700 / 2 + xO - 2, y + 500 / 2 - yO - 2, 5, 5);
            if (p < 0) {
                p = p + 2 * ((float) a2 / b2) * (2 * y + 3);
            } else {
                p = p - 4 * x + 2 * ((float) a2 / b2) * (2 * y + 3);
                x = x - 5;
            }
            y = y + 5;
        }
    }
}
