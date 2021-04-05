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
public class TamGiacDeu {
    private int xDinh, yDinh, canh;

    public TamGiacDeu(int xDinh, int yDinh, int canh) {
        this.xDinh = xDinh;
        this.yDinh = yDinh;
        this.canh = canh;
    }
    
    public JPanel draw() {
        JPanel panel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                setForeground(Color.RED);  //dat mau hinh ve la red
                //khai bao tọa độ các đỉnh
                int xA, yA, xB, yB, xC, yC;
                xA = canh/2;
                yA = 0;
                xB = 0;
                yB = (int)(0.866 * canh);
                xC = canh;
                yC = (int)(0.866 * canh);
                //khai bao cac bien trong thuat toan Presenhem
                int x, y, Dx, Dy, p;
                //vẽ cạnh bên trái
                g.drawLine(xB, yB, xA, yA);
                //vẽ cạnh bên phải
                g.drawLine(xA, yA, xC, yC);
                //vẽ cạnh đáy
                g.drawLine(xB, yB, xC, yC);
                
            }
        };
        int xPanel = BasicParam.backgroundWidth/2 + xDinh - (canh/2);
        int yPanel = BasicParam.backgroundWidth/2 - yDinh;
        panel.setOpaque(false);
        panel.setBounds(xPanel, yPanel, canh, canh);
        panel.setVisible(true);
        return panel;
    }
}
