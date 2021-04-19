/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model3D;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import model2D.ThamSoTruyenVao;
import model2D.Diem2D;
import model2D.DoanThang;
import model2D.NetDut;

/**
 *
 * @author Apple Bee
 */
public class HinhHop {
    public static int subFrameWidth=350,subFrameHight=260,xOBegin=10,yOBegin=25,khoangCach=100,labelSize=40,textSize=75;
    private int x, y, z, dai, rong, cao;

    public HinhHop() {
    }

    public HinhHop(int x, int y, int z, int dai, int rong, int cao) {
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
    
    public JFrame nhapToaDo3D(){
        JFrame frame = new JFrame("HINH CAU");
        frame.setSize(subFrameWidth, subFrameHight);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.ORANGE);


        JLabel labelX,labelY,labelZ,labelDai, labelRong, labelCao;

        labelX = new JLabel("x:");
        labelX.setBounds(10,25,labelSize,25);
        frame.add(labelX);
        ThamSoTruyenVao.x = new JTextField();
        ThamSoTruyenVao.x.setBounds(60,25,textSize,25);
        frame.add(ThamSoTruyenVao.x);

        labelY = new JLabel("y:");
        labelY.setBounds(150,25,labelSize,25);
        frame.add(labelY);
        ThamSoTruyenVao.y = new JTextField();
        ThamSoTruyenVao.y.setBounds(180,25,textSize,25);
        frame.add(ThamSoTruyenVao.y);

        labelZ = new JLabel("z:");
        labelZ.setBounds(10, 75, labelSize, 25);
        frame.add(labelZ);
        ThamSoTruyenVao.z = new JTextField();
        ThamSoTruyenVao.z.setBounds(60,75,textSize,25);
        frame.add(ThamSoTruyenVao.z);

        labelDai = new JLabel("Dài:");
        labelDai.setBounds(150,75,labelSize,25);
        frame.add(labelDai);
        ThamSoTruyenVao.dai = new JTextField();
        ThamSoTruyenVao.dai.setBounds(180,75,textSize,25);
        frame.add(ThamSoTruyenVao.dai);

        labelRong = new JLabel("Rộng:");
        labelRong.setBounds(10,125,labelSize,25);
        frame.add(labelRong);
        ThamSoTruyenVao.rong = new JTextField();
        ThamSoTruyenVao.rong.setBounds(60,125,textSize,25);
        frame.add(ThamSoTruyenVao.rong);

        labelCao = new JLabel("Cao:");
        labelCao.setBounds(150,125,labelSize,25);
        frame.add(labelCao);
        ThamSoTruyenVao.cao = new JTextField();
        ThamSoTruyenVao.cao.setBounds(180,125,textSize,25);
        frame.add(ThamSoTruyenVao.cao);



        ThamSoTruyenVao.nutVe = new JButton("VẼ");
        ThamSoTruyenVao.nutVe.setFocusPainted(false);     	// xoa duong vien tren button khi click
        ThamSoTruyenVao.nutVe.setBackground(Color.white);	//background cho button
        ThamSoTruyenVao.nutVe.setContentAreaFilled(false);	//làm cho button trong suốt
        ThamSoTruyenVao.nutVe.setOpaque(true);                  //làm cho hết trong suốt
        ThamSoTruyenVao.nutVe.setBounds(60,175,textSize,30);
        frame.add(ThamSoTruyenVao.nutVe);


        ThamSoTruyenVao.nutXoa = new JButton("XÓA");
        ThamSoTruyenVao.nutXoa.setFocusPainted(false);
        ThamSoTruyenVao.nutXoa.setBackground(Color.white);
        ThamSoTruyenVao.nutXoa.setContentAreaFilled(false);
        ThamSoTruyenVao.nutXoa.setOpaque(true);
        ThamSoTruyenVao.nutXoa.setBounds(180,175,textSize,30);
        frame.add(ThamSoTruyenVao.nutXoa);
        frame.setResizable(false);
        frame.setVisible(true);
        return frame;
    }
    
    public void xoaDuLieu(){
        ThamSoTruyenVao.x.setText("");
        ThamSoTruyenVao.x.requestFocus();
        ThamSoTruyenVao.y.setText("");
        ThamSoTruyenVao.z.setText("");
        ThamSoTruyenVao.dai.setText("");
        ThamSoTruyenVao.rong.setText("");
        ThamSoTruyenVao.cao.setText("");
    }
    public void xuLyDuLieu () {
        setX(Integer.parseInt(ThamSoTruyenVao.x.getText()));
        setY(Integer.parseInt(ThamSoTruyenVao.y.getText()));
        setZ(Integer.parseInt(ThamSoTruyenVao.z.getText()));
        setDai(Integer.parseInt(ThamSoTruyenVao.dai.getText()));
        setRong(Integer.parseInt(ThamSoTruyenVao.rong.getText()));
        setCao(Integer.parseInt(ThamSoTruyenVao.cao.getText()));
    }
    
    public JPanel draw() {
        JPanel panel = new JPanel();
        //các điểm đáy dưới
        Diem3D a1 = new Diem3D(x, y, z);
        Diem3D b1 = new Diem3D(x + dai, y, z);
        Diem3D d1 = new Diem3D(x, y + rong, z);
        Diem3D c1 = new Diem3D(x + dai, y + rong, z);
        //các điểm đáy trên
        Diem3D a2 = new Diem3D(x, y, z + cao);
        Diem3D b2 = new Diem3D(x + dai, y, z + cao);
        Diem3D d2 = new Diem3D(x, y + rong, z + cao);
        Diem3D c2 = new Diem3D(x+ dai, y + rong, z + cao);
        //chuyển đổi sang 2D bằng phép chiếu Cabinet
        Diem2D A1 = phepchieu.Cabinet.chieu(a1.getX(), a1.getY(), a1.getZ());
        Diem2D B1 = phepchieu.Cabinet.chieu(b1.getX(), b1.getY(), b1.getZ());
        Diem2D C1 = phepchieu.Cabinet.chieu(c1.getX(), c1.getY(), c1.getZ());
        Diem2D D1 = phepchieu.Cabinet.chieu(d1.getX(), d1.getY(), d1.getZ());
        
        Diem2D A2 = phepchieu.Cabinet.chieu(a2.getX(), a2.getY(), a2.getZ());
        Diem2D B2 = phepchieu.Cabinet.chieu(b2.getX(), b2.getY(), b2.getZ());
        Diem2D C2 = phepchieu.Cabinet.chieu(c2.getX(), c2.getY(), c2.getZ());
        Diem2D D2 = phepchieu.Cabinet.chieu(d2.getX(), d2.getY(), d2.getZ());
        //Vẽ các đoạn thẳng đáy dưới
        NetDut A1B1 = new NetDut (A1.getX(), A1.getY(), B1.getX(), B1.getY());
        panel.add(A1B1.draw());
        DoanThang B1C1 = new DoanThang (B1.getX(), B1.getY(), C1.getX(), C1.getY());
        panel.add(B1C1.draw());
        DoanThang D1C1 = new DoanThang (D1.getX(), D1.getY(), C1.getX(), C1.getY());
        panel.add(D1C1.draw());
        NetDut D1A1 = new NetDut (D1.getX(), D1.getY(), A1.getX(), A1.getY());
        panel.add(D1A1.draw());
        //Vẽ các đoạn thẳng đáy trên
        DoanThang A2B2 = new DoanThang (A2.getX(), A2.getY(), B2.getX(), B2.getY());
        panel.add(A2B2.draw());
        DoanThang B2C2 = new DoanThang (B2.getX(), B2.getY(), C2.getX(), C2.getY());
        panel.add(B2C2.draw());
        DoanThang D2C2 = new DoanThang (D2.getX(), D2.getY(), C2.getX(), C2.getY());
        panel.add(D2C2.draw());
        DoanThang D2A2 = new DoanThang (D2.getX(), D2.getY(), A2.getX(), A2.getY());
        panel.add(D2A2.draw());
        //Vẽ các cạnh bên
        NetDut A1A2 = new NetDut(A1.getX(), A1.getY(), A2.getX(), A2.getY());
        panel.add(A1A2.draw());
        DoanThang B1B2 = new DoanThang (B1.getX(), B1.getY(), B2.getX(), B2.getY());
        panel.add(B1B2.draw());
        DoanThang C1C2 = new DoanThang (C1.getX(), C1.getY(), C2.getX(), C2.getY());
        panel.add(C1C2.draw());
        DoanThang D1D2 = new DoanThang (D1.getX(), D1.getY(), D2.getX(), D2.getY());
        panel.add(D1D2.draw());
        //============================================================================
        panel.setOpaque(false);
        panel.setSize(ThamSoTruyenVao.backgroundWidth, ThamSoTruyenVao.backgroundHeight);//set size cho vua jpanel ma minh ve
        panel.setVisible(true);
        return panel;
    }
}
