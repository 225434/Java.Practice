package com;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyActionListener implements ActionListener {
    JDialog dialog;

    public MyActionListener(JDialog dialog) {
        this.dialog = dialog;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String commend = e.getActionCommand();
        switch (commend) {
            case "模态对话框":
                dialog.setModal(true);
                dialog.setVisible(true);
                break;
            case "非模态对话框":
                dialog.setModal(false);
                dialog.setVisible(true);
                break;
            case "确定":
                dialog.setVisible(false);
                break;
        }
    }
}
