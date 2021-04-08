/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presenhemline;

import java.awt.Color;
import java.awt.Graphics;
//import static java.lang.Math.abs;
import javax.swing.JPanel;

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

    public JPanel draw() {
        
        JPanel panel = new JPanel() {
            private static final long serialVersionUID = 1L;

            //Mục đích của biến này là để chắc chắn trước và sau khi chuyển đổi, đối tượng của chúng ta vẫn là một
            @Override
            protected void paintComponent(Graphics g) {
                // TODO Auto-generated method stub
                super.paintComponent(g);
                setForeground(Color.RED);  //dat mau hinh ve la red

                int x, y, Dx, Dy, p;
                Dx = Math.abs(x2 - x1);
                Dy = Math.abs(y2 - y1);

                x = x1;
                y = y1;
                int x_unit = 1, y_unit = 1;

                g.fillRect(x + 250, 250 - y, 1, 1);

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
                        g.fillRect(x + 250, 250 - y, 1, 1);
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
                        g.fillRect(x + 250, 250 - y, 1, 1);
                    }
                }
                
                //khai bao tọa độ các đỉnh
                int xB, yB, xH, yH, xC, yC, xD, yD, AB; 
                int a = x2-x1 ;
                int b = y1-y2 ;
                xB = x2 +250;
                yB = 250 - y2;
                AB = (int) Math.sqrt((Math.pow(a*1.0, 2.0))+Math.pow(b*1.0, 2.0));
                // Tính tọa độ của H
                xH = (int)(xB - a/(AB/10.0));  
                yH = (int)(yB - b/(AB/10.0));
                
                // Tính tọa độ của C
                if (a==0){
                    yC = yH;
                    xC = xH - (AB/20);
                }
                else{
                    yC = (int)(yH - Math.sqrt((double)((AB/20.0)/(Math.pow((double)(b/a), 2.0)+1))));
                    xC = (int)((a*xH+b*yH-b*yC)/a);            
                }
                // Tính tọa độ của D
                xD = 2*xH - xC;
                yD = 2*yH - yC;

                //khai bao cac bien trong thuat toan Presenhem
//                int x, y, Dx, Dy, p;
                //vẽ cạnh bên trái
                g.drawLine(xB, yB, xD, yD);
                //vẽ cạnh bên phải
                g.drawLine(xD, yD, xC, yC);
                //vẽ cạnh đáy
                g.drawLine(xB, yB, xC, yC);
//                g.drawLine(xB, yB, xH, yH);
                
            }
        };
        panel.setOpaque(false);
        panel.setSize(500, 500);//set size cho vua jpanel ma minh ve
        panel.setVisible(true);
        return panel;
    }
}