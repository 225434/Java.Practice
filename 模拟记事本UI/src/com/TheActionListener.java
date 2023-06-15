package com;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TheActionListener implements ActionListener {
    JDialog dialog;

    public TheActionListener(JDialog dialog) {
        this.dialog = dialog;
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        switch (command) {
            case "新建":
                dialog.setModal(true);
                dialog.setVisible(true);
                break;
            case "打开":
                dialog.setModal(false);
                dialog.setVisible(true);
                break;
            case "确定":
                dialog.setVisible(false);
                break;
        }
    }
}
