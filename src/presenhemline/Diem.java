/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presenhemline;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Apple Bee
 */
public class Diem {
    private int x, y;

    public Diem(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public JPanel draw() {
        JPanel panel;
        panel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                setForeground(Color.RED);  //dat mau hinh ve la red
                String text = "Điểm (" + x/5 + ", " + y/5 + ")";
                g.drawString(text, 5, 20);
                for (int i = 1; i <= 3; i++) {
                    for (int j = 1; j <= 3; j++) {
                        g.drawLine(1, i, j, i);
                    }
                }
            }
        };
        int xPanel = BasicParam.backgroundWidth/2 + x - 2;
        int yPanel = BasicParam.backgroundWidth/2 - y - 2;
        panel.setOpaque(false);
        panel.setBounds(xPanel, yPanel, 200, 200);
        panel.setVisible(true);
        return panel;
    }
}
