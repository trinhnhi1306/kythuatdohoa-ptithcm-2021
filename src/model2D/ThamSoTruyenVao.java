package model2D;

import java.awt.Color;
import java.awt.Graphics2D;
import javax.swing.JButton;
import javax.swing.JTextField;

public class ThamSoTruyenVao {

    public final static int backgroundWidth = 500;
    public final static int backgroundHeight = 500;
    public static JTextField x, y, z, r, dai, rong, cao;
    public static JButton nutVe, nutXoa;
    public static int xChongChong, yChongChong, bkChongChong;
    public static Diem2D tamBanh = new Diem2D();
    public static int bkBanh;
    public static void veToaDo (Graphics2D g) {
        g.setColor(Color.white);
        g.fillRect(0, 0, 700, 500);
        g.setColor(Color.LIGHT_GRAY);
        for (int j = 5; j < 700; j += 5) {
            g.drawLine(j, 0, j, ThamSoTruyenVao.backgroundHeight);
        }
        for (int j = 5; j < ThamSoTruyenVao.backgroundHeight; j += 5) {
            g.drawLine(0, j, 700, j);
        }
        g.setColor(Color.red);
        g.drawLine(700 / 2, 0, 700 / 2, ThamSoTruyenVao.backgroundHeight);//y
        g.drawLine(0, ThamSoTruyenVao.backgroundHeight / 2, 700, ThamSoTruyenVao.backgroundHeight / 2);//x
    }
}
