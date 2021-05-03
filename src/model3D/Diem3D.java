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
import model2D.ThamSoTruyenVao;
import phepchieu.Cabinet;

/**
 *
 * @author Apple Bee
 */
public class Diem3D {

    public final int subFrameWidth = 320, subFrameHight = 260, labelSize = 40, textSize = 75;
    private int x, y, z;

    public Diem3D() {
    }

    public Diem3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
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

    public JFrame nhapToaDo3D() {
        JFrame frame = new JFrame("ĐIỂM 3D");
        frame.setSize(subFrameWidth, subFrameHight);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.ORANGE);

        JLabel labelX, labelY, labelZ;

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
    }

    public void xuLyDuLieu() {
        setX(Integer.parseInt(ThamSoTruyenVao.x.getText()));
        setY(Integer.parseInt(ThamSoTruyenVao.y.getText()));
        setZ(Integer.parseInt(ThamSoTruyenVao.z.getText()));
    }

    public String layDuLieu() {
        String str = "\n\t\tTỌA ĐỘ ĐIỂM\n\n";

        str += "\tA (" + x + ", " + y + ", " + z + ")";

        return str;
    }

    public void draw(Graphics2D g) {
        Diem3D a = new Diem3D(x, y, z);

        //Chuyển đổi sang 2D bằng phép chiếu Cabinet
        Diem2D A = Cabinet.chieu(a.getX(), a.getY(), a.getZ());
        
        //Vẽ điểm
        A.draw(g);

        //Vẽ tên điểm
        g.setColor(Color.red);
        g.drawString("A", ThamSoTruyenVao.backgroundWidth / 2 + A.getX() * 5 + 10, ThamSoTruyenVao.backgroundHeight / 2 - A.getY() * 5 - 7);
    }
}
