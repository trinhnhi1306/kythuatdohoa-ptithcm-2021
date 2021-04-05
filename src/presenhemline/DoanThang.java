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
public class DoanThang {

    private int x1, x2, y1, y2;

    public DoanThang(int x1, int y1, int x2, int y2) {
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
            }
        };
        panel.setOpaque(false);
        panel.setSize(500, 500);//set size cho vuwaf jpanel ma mh ve
        panel.setVisible(true);
        return panel;
    }
}