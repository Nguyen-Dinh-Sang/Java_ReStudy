package com.sangnd.swing;

import java.util.Enumeration;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Demo extends javax.swing.JFrame {

	public Demo() {
		initComponents();
	}

	private void createComponents() {
		buttonGroup1 = new javax.swing.ButtonGroup();
		buttonGroup2 = new javax.swing.ButtonGroup();
		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		txtName = new javax.swing.JTextField();
		jLabel2 = new javax.swing.JLabel();
		txtBirthday = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		txtEmail = new javax.swing.JTextField();
		jLabel4 = new javax.swing.JLabel();
		radMale = new javax.swing.JRadioButton();
		radFemale = new javax.swing.JRadioButton();
		jLabel5 = new javax.swing.JLabel();
		cboProvine = new javax.swing.JComboBox();
		jPanel2 = new javax.swing.JPanel();
		btnRegister = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
	}

	private void setName() {
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Registration Form");

		jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Register Information"));
		jPanel1.setAutoscrolls(true);
		jPanel1.setName("jPanel1");

		jLabel1.setText("Name");
		jLabel1.setName("jLabel1");

		txtName.setName("tf_name");

		jLabel2.setText("Birth's day");
		jLabel2.setName("jLabel2");

		txtBirthday.setName("tf_birth");

		jLabel3.setText("Email");
		jLabel3.setName("jLabel3");

		txtEmail.setName("tf_email");

		jLabel4.setText("Sex");
		jLabel4.setName("jLabel4");

		buttonGroup1.add(radMale);
		radMale.setText("Male");
		radMale.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
		radMale.setName("radMale");

		buttonGroup1.add(radFemale);
		radFemale.setText("Female");
		radFemale.setName("radFemale");

		jLabel5.setText("Province");
		jLabel5.setName("jLabel5");

		cboProvine.setModel(
				new javax.swing.DefaultComboBoxModel(new String[] { "Ha Noi", "Hai Phong", "Quang Ninh", " " }));
		cboProvine.setName("cboProvine");
	}

	@SuppressWarnings("unchecked")
	private void initComponents() {
		createComponents();
		setName();

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel1).addComponent(jLabel2).addComponent(jLabel3).addComponent(jLabel4)
								.addComponent(jLabel5))
						.addGap(26, 26, 26)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(cboProvine, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGroup(jPanel1Layout.createSequentialGroup().addComponent(radMale).addGap(39, 39, 39)
										.addComponent(radFemale))
								.addGroup(jPanel1Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(txtBirthday)
										.addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 132,
												Short.MAX_VALUE)
										.addComponent(txtEmail)))
						.addContainerGap(84, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(19, 19, 19)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel1).addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(31, 31, 31)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel2).addComponent(txtBirthday, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(34, 34, 34)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel3).addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(27, 27, 27)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel4).addComponent(radMale).addComponent(radFemale))
						.addGap(30, 30, 30)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel5).addComponent(cboProvine, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Operations"));
		jPanel2.setName("jPanel2");

		btnRegister.setText("Register");
		btnRegister.setName("btn_register");
		btnRegister.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnRegisterActionPerformed(evt);
			}
		});

		jButton2.setText("Reset");
		jButton2.setName("btn_reset");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addGap(57, 57, 57).addComponent(btnRegister)
						.addGap(30, 30, 30).addComponent(jButton2).addContainerGap(115, Short.MAX_VALUE)));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel2Layout.createSequentialGroup().addContainerGap(25, Short.MAX_VALUE)
								.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(btnRegister).addComponent(jButton2))
								.addGap(23, 23, 23)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addGap(41, 41, 41)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
						.addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)
						.addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING,
								javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.PREFERRED_SIZE))
				.addContainerGap(49, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(33, 33, 33)
						.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(27, 27, 27)
						.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(68, Short.MAX_VALUE)));

		pack();
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		txtName.setText("");
		txtBirthday.setText("");
		txtEmail.setText("");
		cboProvine.setSelectedIndex(0);
	}

	private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {
		String name = "";
		String birth = "";
		String email = "";
		name = txtName.getText();
		birth = txtBirthday.getText();
		email = txtEmail.getText();
		if (name.matches("^[a-zA-Z ]{1,}$") == false) {
			JOptionPane.showMessageDialog(null, "Ban phai nhap ho ten");
			return;
		}
		if (birth.matches("^(\\d{2})-(\\d{2})-(\\d{4})$") == false) {
			JOptionPane.showMessageDialog(null, "Ban phai nhap vao ngay sinh dang dd-mm-yy'");
			return;
		}
		if (email.indexOf('@') == -1 || email.indexOf('.') == -1) {
			JOptionPane.showMessageDialog(null, "Ban phai nhap email co @ va .");
			return;
		}
		if (buttonGroup1.getSelection() == null) {
			JOptionPane.showMessageDialog(null, "Ban phai chon 1 muc !");
			return;
		}

		// combo box khong can kiem tra hop le vi mac dinh chon la muc 1
		// Ghi vao file
		System.out.println("=======Ban vua nhap vao la:======== ");
		System.out.println("Ho ten: " + txtName.getText());
		System.out.println("Ngay sinh: " + txtBirthday.getText());
		
		Enumeration e = buttonGroup1.getElements();
		String gioitinh = "";
		while (e.hasMoreElements()) {
			JRadioButton radiobutton = (JRadioButton) e.nextElement();
			if (radiobutton.isSelected()) {
				gioitinh = radiobutton.getText();
			}
		}
		System.out.println("Gioi tinh: " + gioitinh);
		System.out.println("Thanh pho: " + cboProvine.getSelectedItem());
	}

	private javax.swing.JButton btnRegister;
	private javax.swing.ButtonGroup buttonGroup1;
	private javax.swing.ButtonGroup buttonGroup2;
	private javax.swing.JComboBox cboProvine;
	private javax.swing.JButton jButton2;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JRadioButton radFemale;
	private javax.swing.JRadioButton radMale;
	private javax.swing.JTextField txtBirthday;
	private javax.swing.JTextField txtEmail;
	private javax.swing.JTextField txtName;
}
