package com;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame notebook = new JFrame("新建文本文档 - 记事本");
        notebook.setBounds(300,100,800,800);
        notebook.setVisible(true);
        notebook.setLayout(new BorderLayout());
        notebook.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();

        JMenu file = new JMenu("文件");
        JMenu edit = new JMenu("编辑");
        JMenu form = new JMenu("格式");
        JMenu view = new JMenu("查看");
        JMenu help = new JMenu("帮助");

        JMenuItem item1 = new JMenuItem("新建");
        JMenuItem item2 = new JMenuItem("打开");
        file.add(item1);
        file.add(item2);
        file.add(new JMenuItem("保存"));
        file.add(new JMenuItem("另存为"));
        file.add(new JMenuItem("页面设置"));
        file.add(new JMenuItem("打印"));
        file.add(new JMenuItem("退出"));

        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(form);
        menuBar.add(view);
        menuBar.add(help);

        notebook.add(menuBar,BorderLayout.NORTH);

        final JDialog dialog = new JDialog(notebook, "Dialog");

        dialog.setLayout(new FlowLayout(FlowLayout.CENTER));
        dialog.setBounds(350, 250, 200, 200);
        JButton button3 = new JButton("确定");
        dialog.add(button3);

        TheActionListener action = new TheActionListener(dialog);

        item1.addActionListener(action);
        item2.addActionListener(action);
        button3.addActionListener(action);

        JTextArea text = new JTextArea();
        text.setBounds(5,20,795,780);
        notebook.add(text);
    }
}
