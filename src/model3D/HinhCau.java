/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model3D;

import java.awt.Color;
import java.awt.Graphics2D;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import model2D.Diem2D;
import model2D.DuongTron;
import model2D.Ellipse;
import model2D.ThamSoTruyenVao;
import phepchieu.Cabinet;
import phepchieu.Cavalier;

/**
 *
 * @author Admin
 */
public class HinhCau {

    public final int subFrameWidth = 320, subFrameHight = 260, labelSize = 40, textSize = 75;
    private int x, y, z, r;

    public HinhCau() {
    }

    public HinhCau(int x, int y, int z, int r) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.r = r;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public int getR() {
        return r;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public void setR(int r) {
        this.r = r;
    }

    public JFrame nhapToaDo3D() {
        JFrame frame = new JFrame("HÌNH CẦU");
        frame.setSize(subFrameWidth, subFrameHight);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.ORANGE);

        JLabel labelX, labelY, labelZ, labelR;

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

        labelR = new JLabel("r:");
        labelR.setBounds(150, 75, labelSize, 25);
        frame.add(labelR);
        ThamSoTruyenVao.r = new JTextField();
        ThamSoTruyenVao.r.setBounds(180, 75, textSize, 25);
        frame.add(ThamSoTruyenVao.r);

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
        ThamSoTruyenVao.x.requestFocus(); //Cho con trỏ ưu tiên vào JTextFieldx
        ThamSoTruyenVao.y.setText("");
        ThamSoTruyenVao.z.setText("");
        ThamSoTruyenVao.r.setText("");
    }

    public void xuLyDuLieu() {
        setX(Integer.parseInt(ThamSoTruyenVao.x.getText()));
        setY(Integer.parseInt(ThamSoTruyenVao.y.getText()));
        setZ(Integer.parseInt(ThamSoTruyenVao.z.getText()));
        setR(Integer.parseInt(ThamSoTruyenVao.r.getText()));
    }

    public String layDuLieu() {
        String str = "\n\t\tTỌA ĐỘ HÌNH CẦU\n\n\tTọa độ tâm\t\tBán kính\n\n";
        str += "\tO (" + x + ", " + y + ", " + z + ")";
        str += "\t\tr: " + r;
        return str;
    }

    public void draw(Graphics2D g) {
        //Tâm O
        Diem3D o = new Diem3D(x, y, z);
        Diem3D a = new Diem3D(x, y - r, z); // Thuộc hình cầu, nằm trên đường tròn đi qua tâm song song với mặt phẳng Oxy

        //chuyển đổi sang 2D bằng phép chiếu Cabinet
        Diem2D O = Cabinet.chieu(o.getX(), o.getY(), o.getZ());
        Diem2D A = Cabinet.chieu(a.getX(), a.getY(), a.getZ());

        //Vẽ hình tròn
        DuongTron T = new DuongTron(O.getX(), O.getY(), r);
        T.drawLien(g);

        //Vẽ tâm
        O.draw(g, 0);

        //Vẽ ellipse
//        Ellipse E = new Ellipse(O.getX(), O.getY(), r, (int) (r * Math.sqrt(2) / 4));
        Ellipse E = new Ellipse(O.getX(), O.getY(), r, (int) (Math.sqrt((o.getX() - A.getX()) * (o.getX() - A.getX()) + (o.getY() - A.getY()) * (o.getY() - A.getY()))));
        E.draw(g);

        //Vẽ tên các điểm
        g.setColor(Color.red);
        g.drawString("O", ThamSoTruyenVao.backgroundWidth / 2 + O.getX() * 5 - 10, ThamSoTruyenVao.backgroundHeight / 2 - O.getY() * 5 - 10);
    }
}
