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
import javax.swing.JPanel;

/**
 *
 * @author Apple Bee
 */
public class HinhChuNhat extends Canvas {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    
    public HinhChuNhat (int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    
    public JPanel draw () {
        JPanel panel = new JPanel() {
            private static final long serialVersionUID = 1L;
            @Override
            public void paintComponent(Graphics g) {  
//                setBackground(Color.WHITE);  //dat mau nen la white
                setForeground(Color.RED);  //dat mau hinh ve la red
                //khai bao 4 diem hinh chu nhat
                int chieuCao = Math.abs(x1 - x2);    //           A----------------B (x2, y2)
                int chieuRong = Math.abs(y1 - y2);   //           |                |
                                                     //           |                |
                                                     //  (x1, y1) D----------------C

                int x = 0, y = 0;
                //ve AB va DC
                while (x != chieuRong)
                {
                    g.fillRect(x, 0, 1, 1);
                    g.fillRect(x, chieuCao, 1, 1);
                    x++;
                }
                //ve AD va BC
                while (y != chieuCao)
                {
                    g.fillRect(0, y, 1, 1);
                    g.fillRect(chieuRong, y, 1, 1);
                    y++;
                }
            }
        };
        int xPanel = (x1 < x2) ? x1 : x2;
        int yPanel = (y1 > y2) ? y1 : y2;
        panel.setOpaque(false);
        panel.setBounds(BasicParam.backgroundWidth/2 + xPanel, BasicParam.backgroundHeight/2 - yPanel, Math.abs(x1-x2) + 1, Math.abs(y1-y2)+ 1);
        panel.setVisible(true);
        return panel;
    }
}
