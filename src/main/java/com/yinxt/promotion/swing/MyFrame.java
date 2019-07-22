package com.yinxt.promotion.swing;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MyFrame extends JFrame {

    public MyFrame(){
        JPanel jPanel = new JPanel();
        JPanel jPanel1 =  new JPanel();

        jPanel1.setSize(20,20);

        jPanel1.setLayout(new GridLayout(4, 6, 2 ,2));

        jPanel1.add(new JLabel("姓名："));
        jPanel1.add(new JTextField());
        jPanel1.add(new JLabel("密码："));
        jPanel1.add(new JPasswordField());
        jPanel1.add(new JButton("登录"));
        jPanel1.add(new JButton("取消"));

        JPanel jPanel2 = new JPanel(new BorderLayout());

        jPanel2.add(new Label("用户登录"), BorderLayout.NORTH);

        jPanel2.add(jPanel1, BorderLayout.CENTER);


        add(new JButton("左边区域"), BorderLayout.CENTER);
        add(jPanel2, BorderLayout.EAST);
    }

    public static void main(String[] args){

        MyFrame myFrame = new MyFrame();
        myFrame.setTitle("登陆界面");
        myFrame.setSize(500, 400);
        myFrame.setLocationRelativeTo(null);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);

    }

}
