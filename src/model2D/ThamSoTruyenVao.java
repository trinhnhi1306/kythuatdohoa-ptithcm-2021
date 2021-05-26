package model2D;

import java.awt.Color;
import java.awt.Graphics2D;
import javax.swing.JButton;
import javax.swing.JTextField;

public class ThamSoTruyenVao {

    public final static int backgroundWidth = 500;
    public final static int backgroundHeight = 500;
    public final static int backgroundWidthChuyenDong = 700;
    public final static int backgroundHeightChuyenDong = 500;
    public static JTextField x, y, z, r, dai, rong, cao;
    public static JButton nutVe, nutXoa;                        //
    public static int xChongChong, yChongChong, bkChongChong;   //Khi thu phóng hình tròn sẽ có thể thành ellipse nên không lưu được các tọa độ sau thu phóng, nên có cái này để lưu tọa độ trước khi biền đổi thu phóng
    public static Diem2D tamBanh = new Diem2D();                //
    public static int bkBanh;
    public static void veToaDo (Graphics2D g) {
        g.setColor(Color.white);
        g.fillRect(0, 0, backgroundWidthChuyenDong, backgroundHeightChuyenDong);
        g.setColor(Color.LIGHT_GRAY);
        for (int j = 5; j < backgroundWidthChuyenDong; j += 5) {
            g.drawLine(j, 0, j, backgroundHeightChuyenDong);
        }
        for (int j = 5; j < backgroundHeightChuyenDong; j += 5) {
            g.drawLine(0, j, backgroundWidthChuyenDong, j);
        }
        g.setColor(Color.red);
        g.drawLine(backgroundWidthChuyenDong / 2, 0, backgroundWidthChuyenDong / 2, backgroundHeightChuyenDong);//y
        g.drawLine(0, backgroundHeightChuyenDong / 2, backgroundWidthChuyenDong, backgroundHeightChuyenDong / 2);//x
    }
    public static int tinhXY (int xy) {
        int temp = xy % 5;
        if (temp != 0) {
            if (temp <= 2.5) {
                xy -= temp;
            }
            else {
                xy += 5 - temp;
            }
        }
        return xy;
    }
}
