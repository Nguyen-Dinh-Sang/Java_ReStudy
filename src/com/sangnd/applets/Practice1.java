package com.sangnd.applets;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Practice1 extends Applet {
    TextField txtnum1,txtnum2,txtrs;
    Label lblnum1, lblnum2, lblrs;
    Button btnAdd;
    @Override
    public void init() {   //Khong dat trong paint()
        lblnum1 = new Label("Number 1:");
        lblnum2 = new Label("Number 2:");
        lblrs = new Label("Result:");
        txtnum1 = new TextField(20);
        txtnum2 = new TextField(20);
        txtrs = new TextField(20);
        BoxLayout b = new BoxLayout(this, BoxLayout.Y_AXIS);

        this.setLayout(b);
        this.add(lblnum1);this.add(txtnum1);
        this.add(lblnum2);this.add(txtnum2);
        this.add(lblrs);this.add(txtrs);
        btnAdd = new Button(" Add ");
        btnAdd.addActionListener(new addlistener());  //register
        this.add(btnAdd);
        this.setSize(500, 500);
        this.setVisible(true);
    }

    class addlistener implements ActionListener { //inner class
        public void actionPerformed(ActionEvent e) {
            int a = Integer.parseInt(txtnum1.getText());
            int b = Integer.parseInt(txtnum2.getText());
            int c = a + b;
            txtrs.setText(c + "");
        }
    }
}
