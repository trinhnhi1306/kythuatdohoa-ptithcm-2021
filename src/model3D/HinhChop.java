/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model3D;

import phepchieu.Cabinet;
import java.awt.Color;
import java.awt.Graphics2D;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import model2D.ThamSoTruyenVao;
import model2D.Diem2D;
import model2D.DoanThang;
import model2D.NetDut;

public class HinhChop {

    public final int subFrameWidth = 320, subFrameHight = 260, labelSize = 40, textSize = 75;
    private int x, y, z, dai, rong, cao;

    public HinhChop() {
    }

    public HinhChop(int x, int y, int z, int dai, int rong, int cao) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.dai = dai;
        this.rong = rong;
        this.cao = cao;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int getDai() {
        return dai;
    }

    public void setDai(int dai) {
        this.dai = dai;
    }

    public int getRong() {
        return rong;
    }

    public void setRong(int rong) {
        this.rong = rong;
    }

    public int getCao() {
        return cao;
    }

    public void setCao(int cao) {
        this.cao = cao;
    }

    public JFrame nhapToaDo3D() {
        JFrame frame = new JFrame("HÌNH CHÓP");
        frame.setSize(subFrameWidth, subFrameHight);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.ORANGE);

        JLabel labelX, labelY, labelZ, labelDai, labelRong, labelCao;

        labelX = new JLabel("x:");
        labelX.setBounds(10, 25, labelSize, 25);
        frame.add(labelX);
        ThamSoTruyenVao.x = new JTextField();
        ThamSoTruyenVao.x.setBounds(60, 25, textSize, 25);
        frame.add(ThamSoTruyenVao.x);

        labelY = new JLabel("y:");
        labelY.setBounds(150, 25, labelSize, 25);
        frame.add(labelY);
        ThamSoTruyenVao.y = new JTextField();
        ThamSoTruyenVao.y.setBounds(180, 25, textSize, 25);
        frame.add(ThamSoTruyenVao.y);

        labelZ = new JLabel("z:");
        labelZ.setBounds(10, 75, labelSize, 25);
        frame.add(labelZ);
        ThamSoTruyenVao.z = new JTextField();
        ThamSoTruyenVao.z.setBounds(60, 75, textSize, 25);
        frame.add(ThamSoTruyenVao.z);

        labelDai = new JLabel("Dài:");
        labelDai.setBounds(150, 75, labelSize, 25);
        frame.add(labelDai);
        ThamSoTruyenVao.dai = new JTextField();
        ThamSoTruyenVao.dai.setBounds(180, 75, textSize, 25);
        frame.add(ThamSoTruyenVao.dai);

        labelRong = new JLabel("Rộng:");
        labelRong.setBounds(10, 125, labelSize, 25);
        frame.add(labelRong);
        ThamSoTruyenVao.rong = new JTextField();
        ThamSoTruyenVao.rong.setBounds(60, 125, textSize, 25);
        frame.add(ThamSoTruyenVao.rong);

        labelCao = new JLabel("Cao:");
        labelCao.setBounds(150, 125, labelSize, 25);
        frame.add(labelCao);
        ThamSoTruyenVao.cao = new JTextField();
        ThamSoTruyenVao.cao.setBounds(180, 125, textSize, 25);
        frame.add(ThamSoTruyenVao.cao);

        ThamSoTruyenVao.nutVe = new JButton("VẼ");
        ThamSoTruyenVao.nutVe.setFocusPainted(false);     	// xoa duong vien tren button khi click
        ThamSoTruyenVao.nutVe.setBackground(Color.white);	//background cho button
        ThamSoTruyenVao.nutVe.setContentAreaFilled(false);	//làm cho button khong con giong button nua
        ThamSoTruyenVao.nutVe.setOpaque(true);                  //làm cho nen khong trong suốt
        ThamSoTruyenVao.nutVe.setBounds(60, 175, textSize, 30);
        frame.add(ThamSoTruyenVao.nutVe);

        ThamSoTruyenVao.nutXoa = new JButton("XÓA");
        ThamSoTruyenVao.nutXoa.setFocusPainted(false);
        ThamSoTruyenVao.nutXoa.setBackground(Color.white);
        ThamSoTruyenVao.nutXoa.setContentAreaFilled(false);
        ThamSoTruyenVao.nutXoa.setOpaque(true);
        ThamSoTruyenVao.nutXoa.setBounds(180, 175, textSize, 30);
        frame.add(ThamSoTruyenVao.nutXoa);
        frame.setResizable(false);
        frame.setVisible(true);
        return frame;
    }

    public void xoaDuLieu() {
        ThamSoTruyenVao.x.setText("");
        ThamSoTruyenVao.x.requestFocus();
        ThamSoTruyenVao.y.setText("");
        ThamSoTruyenVao.z.setText("");
        ThamSoTruyenVao.dai.setText("");
        ThamSoTruyenVao.rong.setText("");
        ThamSoTruyenVao.cao.setText("");
    }

    public void xuLyDuLieu() {
        setX(Integer.parseInt(ThamSoTruyenVao.x.getText()));
        setY(Integer.parseInt(ThamSoTruyenVao.y.getText()));
        setZ(Integer.parseInt(ThamSoTruyenVao.z.getText()));
        setDai(Integer.parseInt(ThamSoTruyenVao.dai.getText()));
        setRong(Integer.parseInt(ThamSoTruyenVao.rong.getText()));
        setCao(Integer.parseInt(ThamSoTruyenVao.cao.getText()));
    }

    public String layDuLieu() {
        String str = "\n\t\tTỌA ĐỘ HÌNH CHÓP\n\n\tTọa độ đáy\t\tTọa độ đỉnh\n\n";

        str += "\tA (" + x + ", " + y + ", " + z + ")";
        str += "\t\tS (" + (x + dai / 2) + ", " + (y + rong / 2) + ", " + (z + cao) + ")\n\n";

        str += "\tB (" + (x + dai) + ", " + y + ", " + z + ")\n\n";

        str += "\tC (" + (x + dai) + ", " + (y + rong) + ", " + z + ")\n\n";

        str += "\tD (" + x + ", " + (y + rong) + ", " + z + ")\n\n";

        str += "\tO (" + (x + dai / 2) + ", " + (y + rong / 2) + ", " + z + ")";

        return str;
    }

    public void draw(Graphics2D g) {
        //4 điểm đáy dưới
        Diem3D a = new Diem3D(x, y, z);
        Diem3D b = new Diem3D(x + dai, y, z);
        Diem3D c = new Diem3D(x + dai, y + rong, z);
        Diem3D d = new Diem3D(x, y + rong, z);

        //giao điểm hai đường chéo đáy
        Diem3D o = new Diem3D(x + dai / 2, y + rong / 2, z);

        //điểm chóp
        Diem3D s = new Diem3D(o.getX(), o.getY(), z + cao);

        //chuyển đổi sang 2D bằng phép chiếu Cabinet
        Diem2D A = Cabinet.chieu(a.getX(), a.getY(), a.getZ());
        Diem2D B = Cabinet.chieu(b.getX(), b.getY(), b.getZ());
        Diem2D C = Cabinet.chieu(c.getX(), c.getY(), c.getZ());
        Diem2D D = Cabinet.chieu(d.getX(), d.getY(), d.getZ());

        Diem2D O = Cabinet.chieu(o.getX(), o.getY(), o.getZ());

        Diem2D S = Cabinet.chieu(s.getX(), s.getY(), s.getZ());

        //Vẽ các đoạn thẳng đáy
        NetDut AB = new NetDut(A.getX(), A.getY(), B.getX(), B.getY());
        AB.draw(g);
        DoanThang BC = new DoanThang(B.getX(), B.getY(), C.getX(), C.getY());
        BC.draw(g);
        DoanThang DC = new DoanThang(D.getX(), D.getY(), C.getX(), C.getY());
        DC.draw(g);
        NetDut DA = new NetDut(D.getX(), D.getY(), A.getX(), A.getY());
        DA.draw(g);

        //Vẽ hai đường chéo đáy
        NetDut AC = new NetDut(A.getX(), A.getY(), C.getX(), C.getY());
        AC.draw(g);
        NetDut BD = new NetDut(B.getX(), B.getY(), D.getX(), D.getY());
        BD.draw(g);

        //Vẽ các cạnh bên
        NetDut SA = new NetDut(S.getX(), S.getY(), A.getX(), A.getY());
        SA.draw(g);
        DoanThang SB = new DoanThang(S.getX(), S.getY(), B.getX(), B.getY());
        SB.draw(g);
        DoanThang SC = new DoanThang(S.getX(), S.getY(), C.getX(), C.getY());
        SC.draw(g);
        DoanThang SD = new DoanThang(S.getX(), S.getY(), D.getX(), D.getY());
        SD.draw(g);

        //Vẽ trục SO
        NetDut SO = new NetDut(S.getX(), S.getY(), O.getX(), O.getY());
        SO.draw(g);

        //Vẽ tên các điểm
        g.setColor(Color.red);
        g.drawString("A", ThamSoTruyenVao.backgroundWidth / 2 + A.getX() * 5 + 10, ThamSoTruyenVao.backgroundHeight / 2 - A.getY() * 5 - 10);
        g.drawString("B", ThamSoTruyenVao.backgroundWidth / 2 + B.getX() * 5 + 5, ThamSoTruyenVao.backgroundHeight / 2 - B.getY() * 5 - 10);
        g.drawString("C", ThamSoTruyenVao.backgroundWidth / 2 + C.getX() * 5 - 10, ThamSoTruyenVao.backgroundHeight / 2 - C.getY() * 5 + 15);
        g.drawString("D", ThamSoTruyenVao.backgroundWidth / 2 + D.getX() * 5 - 10, ThamSoTruyenVao.backgroundHeight / 2 - D.getY() * 5 + 15);
        g.drawString("S", ThamSoTruyenVao.backgroundWidth / 2 + S.getX() * 5 + 5, ThamSoTruyenVao.backgroundHeight / 2 - S.getY() * 5 - 10);
        g.drawString("O", ThamSoTruyenVao.backgroundWidth / 2 + O.getX() * 5 + 5, ThamSoTruyenVao.backgroundHeight / 2 - O.getY() * 5 - 5);
    }
}
