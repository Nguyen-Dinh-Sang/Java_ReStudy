package com.sangnd.swing;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import static java.lang.System.out;

public class ButtonCountHit {
	JFrame frm;
	JButton btnClick;
	JLabel lblMessage;
	private int count;

	public ButtonCountHit() {
		frm = new JFrame("Count Button Hit");
		lblMessage = new JLabel("Click to the button");
		lblMessage.setFont(new Font("Arial", 1, 25));
		btnClick = new JButton("Click here");
		btnClick.setFont(new Font("Arial", 1, 25));
		count = 0;
		
		frm.add(btnClick, BorderLayout.CENTER);
		frm.add(lblMessage, BorderLayout.SOUTH);
		btnClick.addActionListener(new CustomActionButton());
		
		frm.setSize(300, 200);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setLocationRelativeTo(null);
		frm.setVisible(true);
	}
	
	class CustomActionButton implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			count++;
			lblMessage.setText(count + "");
		}
		
	}
}