package com;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame win = new JFrame("对话框窗口");
        win.setBounds(300, 300, 400, 300);
        win.setResizable(true);
        win.setVisible(true);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton button1 = new JButton("模态对话框");
        JButton button2 = new JButton("非模态对话框");
        Dimension d = new Dimension(100, 100);
        button1.setSize(d);
        button2.setSize(d);
        win.add(button1);
        win.add(button2);
        win.setLayout(new FlowLayout(FlowLayout.CENTER));
        final JDialog dialog = new JDialog(win, "Dialog");
        dialog.setBounds(350, 250, 200, 200);
        dialog.setLayout(new FlowLayout(FlowLayout.CENTER));
        JButton button3 = new JButton("确定");
        dialog.add(button3);
        MyActionListener action = new MyActionListener(dialog);
        button1.addActionListener(action);
        button2.addActionListener(action);
        button3.addActionListener(action);
    }
}

