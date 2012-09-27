package com.ccms.UI;

import java.awt.EventQueue;

import javax.swing.JFrame;

import com.ccms.account.Costumer;
import com.ccms.log.sys.User;
import com.ccms.db.*;
import com.sun.jndi.url.corbaname.corbanameURLContextFactory;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.text.DefaultEditorKit.InsertBreakAction;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Date;

public class AccountManage {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(User args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AccountManage window = new AccountManage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AccountManage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("賬戶管理");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		JPanel panel = new JPanel();
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(
				Alignment.LEADING).addGroup(
				groupLayout
						.createSequentialGroup()
						.addContainerGap()
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 422,
								Short.MAX_VALUE).addContainerGap()));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(
				Alignment.LEADING).addGroup(
				groupLayout
						.createSequentialGroup()
						.addContainerGap()
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 249,
								Short.MAX_VALUE).addContainerGap()));

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(
				Alignment.LEADING).addComponent(tabbedPane,
				GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(
				Alignment.LEADING).addComponent(tabbedPane,
				GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE));

		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("开户", null, panel_1, null);

		JLabel lblNewLabel = new JLabel("身份证号");

		JLabel lblNewLabel_1 = new JLabel("姓");

		JLabel lblNewLabel_2 = new JLabel("出生日期");

		textField = new JTextField();
		textField.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("名");

		textField_1 = new JTextField();
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("电话号码");

		JLabel lblNewLabel_5 = new JLabel("住址");

		JLabel label = new JLabel("电子邮件");

		textField_3 = new JTextField();
		textField_3.setColumns(10);

		JLabel label_1 = new JLabel("@");

		textField_4 = new JTextField();
		textField_4.setColumns(10);

		textField_5 = new JTextField();
		textField_5.setColumns(10);

		textField_6 = new JTextField();
		textField_6.setColumns(10);

		textField_7 = new JTextField();
		textField_7.setText("年");
		textField_7.setColumns(10);

		textField_8 = new JTextField();
		textField_8.setText("月");
		textField_8.setColumns(10);

		textField_9 = new JTextField();
		textField_9.setText("日");
		textField_9.setColumns(10);

		JButton button = new JButton("开户");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setAction(action);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1
				.setHorizontalGroup(gl_panel_1
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								gl_panel_1
										.createSequentialGroup()
										.addGap(30)
										.addGroup(
												gl_panel_1
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																gl_panel_1
																		.createSequentialGroup()
																		.addComponent(
																				label)
																		.addPreferredGap(
																				ComponentPlacement.RELATED)
																		.addComponent(
																				textField_3,
																				GroupLayout.PREFERRED_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.PREFERRED_SIZE)
																		.addGap(4)
																		.addComponent(
																				label_1)
																		.addPreferredGap(
																				ComponentPlacement.RELATED)
																		.addComponent(
																				textField_4,
																				GroupLayout.PREFERRED_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				ComponentPlacement.RELATED)
																		.addComponent(
																				button))
														.addGroup(
																gl_panel_1
																		.createSequentialGroup()
																		.addComponent(
																				lblNewLabel_5)
																		.addPreferredGap(
																				ComponentPlacement.RELATED)
																		.addComponent(
																				textField_5,
																				282,
																				282,
																				282))
														.addGroup(
																gl_panel_1
																		.createSequentialGroup()
																		.addComponent(
																				lblNewLabel)
																		.addPreferredGap(
																				ComponentPlacement.RELATED)
																		.addComponent(
																				textField_2,
																				256,
																				256,
																				256))
														.addGroup(
																gl_panel_1
																		.createParallelGroup(
																				Alignment.LEADING,
																				false)
																		.addGroup(
																				gl_panel_1
																						.createSequentialGroup()
																						.addGroup(
																								gl_panel_1
																										.createParallelGroup(
																												Alignment.LEADING,
																												false)
																										.addGroup(
																												gl_panel_1
																														.createSequentialGroup()
																														.addComponent(
																																lblNewLabel_2)
																														.addPreferredGap(
																																ComponentPlacement.RELATED)
																														.addComponent(
																																textField_7,
																																GroupLayout.PREFERRED_SIZE,
																																58,
																																GroupLayout.PREFERRED_SIZE)
																														.addPreferredGap(
																																ComponentPlacement.RELATED)
																														.addComponent(
																																textField_8,
																																0,
																																0,
																																Short.MAX_VALUE))
																										.addGroup(
																												gl_panel_1
																														.createSequentialGroup()
																														.addComponent(
																																lblNewLabel_4)
																														.addPreferredGap(
																																ComponentPlacement.RELATED)
																														.addComponent(
																																textField_6,
																																GroupLayout.PREFERRED_SIZE,
																																GroupLayout.DEFAULT_SIZE,
																																GroupLayout.PREFERRED_SIZE)))
																						.addPreferredGap(
																								ComponentPlacement.RELATED)
																						.addComponent(
																								textField_9,
																								0,
																								0,
																								Short.MAX_VALUE))
																		.addGroup(
																				gl_panel_1
																						.createSequentialGroup()
																						.addComponent(
																								lblNewLabel_1)
																						.addPreferredGap(
																								ComponentPlacement.RELATED)
																						.addComponent(
																								textField,
																								GroupLayout.PREFERRED_SIZE,
																								56,
																								GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								ComponentPlacement.RELATED)
																						.addComponent(
																								lblNewLabel_3)
																						.addPreferredGap(
																								ComponentPlacement.RELATED)
																						.addComponent(
																								textField_1,
																								GroupLayout.PREFERRED_SIZE,
																								GroupLayout.DEFAULT_SIZE,
																								GroupLayout.PREFERRED_SIZE))))
										.addContainerGap(
												GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));
		gl_panel_1
				.setVerticalGroup(gl_panel_1
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								gl_panel_1
										.createSequentialGroup()
										.addGap(24)
										.addGroup(
												gl_panel_1
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(
																lblNewLabel)
														.addComponent(
																textField_2,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												ComponentPlacement.UNRELATED)
										.addGroup(
												gl_panel_1
														.createParallelGroup(
																Alignment.LEADING)
														.addComponent(
																lblNewLabel_1)
														.addGroup(
																gl_panel_1
																		.createParallelGroup(
																				Alignment.BASELINE)
																		.addComponent(
																				textField,
																				GroupLayout.PREFERRED_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				lblNewLabel_3)
																		.addComponent(
																				textField_1,
																				GroupLayout.PREFERRED_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.PREFERRED_SIZE)))
										.addPreferredGap(
												ComponentPlacement.UNRELATED)
										.addGroup(
												gl_panel_1
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(
																lblNewLabel_2)
														.addComponent(
																textField_7,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																textField_8,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																textField_9,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												ComponentPlacement.UNRELATED)
										.addGroup(
												gl_panel_1
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(
																lblNewLabel_4)
														.addComponent(
																textField_6,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												ComponentPlacement.UNRELATED)
										.addGroup(
												gl_panel_1
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(
																lblNewLabel_5)
														.addComponent(
																textField_5,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												ComponentPlacement.UNRELATED)
										.addGroup(
												gl_panel_1
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(label)
														.addComponent(
																textField_3,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(label_1)
														.addComponent(
																textField_4,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(button))
										.addContainerGap(18, Short.MAX_VALUE)));
		panel_1.setLayout(gl_panel_1);

		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("客户信息维护", null, panel_2, null);

		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);

		JPanel panel_6 = new JPanel();
		tabbedPane_1.addTab("查询", null, panel_6, null);

		JPanel panel_7 = new JPanel();
		tabbedPane_1.addTab("修改", null, panel_7, null);
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(gl_panel_2.createParallelGroup(
				Alignment.LEADING).addGroup(
				gl_panel_2
						.createSequentialGroup()
						.addContainerGap()
						.addComponent(tabbedPane_1, GroupLayout.PREFERRED_SIZE,
								393, GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));
		gl_panel_2.setVerticalGroup(gl_panel_2.createParallelGroup(
				Alignment.LEADING).addGroup(
				gl_panel_2
						.createSequentialGroup()
						.addGap(5)
						.addComponent(tabbedPane_1, GroupLayout.DEFAULT_SIZE,
								205, Short.MAX_VALUE).addContainerGap()));
		panel_2.setLayout(gl_panel_2);

		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("存款", null, panel_3, null);

		JLabel label_2 = new JLabel("帐号");

		JLabel label_3 = new JLabel("金额");

		textField_10 = new JTextField();
		textField_10.setColumns(10);

		textField_11 = new JTextField();
		textField_11.setColumns(10);

		JButton button_1 = new JButton("存入");
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3
				.setHorizontalGroup(gl_panel_3
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								gl_panel_3
										.createSequentialGroup()
										.addGroup(
												gl_panel_3
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																gl_panel_3
																		.createSequentialGroup()
																		.addGap(102)
																		.addGroup(
																				gl_panel_3
																						.createParallelGroup(
																								Alignment.LEADING)
																						.addGroup(
																								gl_panel_3
																										.createSequentialGroup()
																										.addComponent(
																												label_2)
																										.addPreferredGap(
																												ComponentPlacement.RELATED)
																										.addComponent(
																												textField_10,
																												GroupLayout.PREFERRED_SIZE,
																												194,
																												GroupLayout.PREFERRED_SIZE))
																						.addGroup(
																								gl_panel_3
																										.createSequentialGroup()
																										.addComponent(
																												label_3)
																										.addPreferredGap(
																												ComponentPlacement.UNRELATED)
																										.addComponent(
																												textField_11,
																												GroupLayout.PREFERRED_SIZE,
																												GroupLayout.DEFAULT_SIZE,
																												GroupLayout.PREFERRED_SIZE))))
														.addGroup(
																gl_panel_3
																		.createSequentialGroup()
																		.addGap(170)
																		.addComponent(
																				button_1)))
										.addContainerGap(94, Short.MAX_VALUE)));
		gl_panel_3
				.setVerticalGroup(gl_panel_3
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								gl_panel_3
										.createSequentialGroup()
										.addGap(40)
										.addGroup(
												gl_panel_3
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(label_2)
														.addComponent(
																textField_10,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
										.addGap(18)
										.addGroup(
												gl_panel_3
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(label_3)
														.addComponent(
																textField_11,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												ComponentPlacement.RELATED, 52,
												Short.MAX_VALUE)
										.addComponent(button_1).addGap(49)));
		panel_3.setLayout(gl_panel_3);

		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("取款", null, panel_4, null);

		JLabel label_4 = new JLabel("帐号");

		JLabel label_5 = new JLabel("金额");

		textField_12 = new JTextField();
		textField_12.setColumns(10);

		textField_13 = new JTextField();
		textField_13.setColumns(10);

		JButton button_2 = new JButton("取出");
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4
				.setHorizontalGroup(gl_panel_4
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								gl_panel_4
										.createSequentialGroup()
										.addGap(104)
										.addGroup(
												gl_panel_4
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																gl_panel_4
																		.createSequentialGroup()
																		.addComponent(
																				label_5)
																		.addPreferredGap(
																				ComponentPlacement.UNRELATED)
																		.addComponent(
																				textField_13,
																				GroupLayout.PREFERRED_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.PREFERRED_SIZE))
														.addGroup(
																gl_panel_4
																		.createSequentialGroup()
																		.addComponent(
																				label_4)
																		.addPreferredGap(
																				ComponentPlacement.UNRELATED)
																		.addComponent(
																				textField_12,
																				GroupLayout.PREFERRED_SIZE,
																				240,
																				GroupLayout.PREFERRED_SIZE)))
										.addContainerGap(40, Short.MAX_VALUE))
						.addGroup(
								Alignment.TRAILING,
								gl_panel_4.createSequentialGroup()
										.addContainerGap(190, Short.MAX_VALUE)
										.addComponent(button_2).addGap(178)));
		gl_panel_4
				.setVerticalGroup(gl_panel_4
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								gl_panel_4
										.createSequentialGroup()
										.addGap(57)
										.addGroup(
												gl_panel_4
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(label_4)
														.addComponent(
																textField_12,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
										.addGap(18)
										.addGroup(
												gl_panel_4
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(label_5)
														.addComponent(
																textField_13,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												ComponentPlacement.RELATED, 45,
												Short.MAX_VALUE)
										.addComponent(button_2).addGap(39)));
		panel_4.setLayout(gl_panel_4);

		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("账单查询", null, panel_5, null);
		GroupLayout gl_panel_5 = new GroupLayout(panel_5);
		gl_panel_5.setHorizontalGroup(gl_panel_5.createParallelGroup(
				Alignment.LEADING).addGap(0, 417, Short.MAX_VALUE));
		gl_panel_5.setVerticalGroup(gl_panel_5.createParallelGroup(
				Alignment.LEADING).addGap(0, 222, Short.MAX_VALUE));
		panel_5.setLayout(gl_panel_5);

		JPanel panel_8 = new JPanel();
		tabbedPane.addTab("结算", null, panel_8, null);
		panel.setLayout(gl_panel);
		frame.getContentPane().setLayout(groupLayout);
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "开户");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}

		public void actionPerformed(ActionEvent e) {
			Costumer costumer = new Costumer();
			// String CostumerID;
			String ID;
			String FirstName;
			String LastName;
			String Gender;
			Date Birthday;
			String PhoneNumber;
			String Address;
			String EmailAddress;

			ID = textField_2.getText();
			LastName = textField.getText();
			FirstName = textField_1.getText();
			PhoneNumber = textField_6.getText();
			Address = textField_5.getText();
			EmailAddress = textField_3.getText() + "@" + textField_4.getText();

			costumer.setID(ID);
			costumer.setFirstName(FirstName);
			costumer.setSecondName(LastName);
			costumer.setPhoneNumber(PhoneNumber);
			costumer.setAddress(Address);
			costumer.setEmailAddress(EmailAddress);

			try {
				com.ccms.db.DBOperation.Insert(costumer);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
}
