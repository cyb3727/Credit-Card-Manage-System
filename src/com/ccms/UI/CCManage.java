package com.ccms.UI;

import java.awt.EventQueue;

import javax.swing.JFrame;

import com.ccms.log.sys.User;
import java.awt.FlowLayout;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

public class CCManage {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(User args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CCManage window = new CCManage();
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
	public CCManage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("信用卡管理");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(12, 12, 422, 249);
		frame.getContentPane().add(panel);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(
				Alignment.LEADING).addComponent(tabbedPane,
				GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(
				Alignment.LEADING).addComponent(tabbedPane,
				GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE));

		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("开卡", null, panel_1, null);

		JLabel label = new JLabel("账户编号");

		textField = new JTextField();
		textField.setColumns(10);

		JButton button = new JButton("开卡");

		JLabel label_1 = new JLabel("新开卡号");

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1
				.setHorizontalGroup(gl_panel_1
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								gl_panel_1
										.createSequentialGroup()
										.addGap(105)
										.addGroup(
												gl_panel_1
														.createParallelGroup(
																Alignment.LEADING,
																false)
														.addGroup(
																gl_panel_1
																		.createSequentialGroup()
																		.addComponent(
																				label_1)
																		.addPreferredGap(
																				ComponentPlacement.UNRELATED)
																		.addComponent(
																				textField_1))
														.addGroup(
																gl_panel_1
																		.createSequentialGroup()
																		.addComponent(
																				label)
																		.addPreferredGap(
																				ComponentPlacement.UNRELATED)
																		.addGroup(
																				gl_panel_1
																						.createParallelGroup(
																								Alignment.LEADING)
																						.addComponent(
																								button)
																						.addComponent(
																								textField,
																								GroupLayout.PREFERRED_SIZE,
																								212,
																								GroupLayout.PREFERRED_SIZE))))
										.addContainerGap(30, Short.MAX_VALUE)));
		gl_panel_1
				.setVerticalGroup(gl_panel_1
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								gl_panel_1
										.createSequentialGroup()
										.addGap(54)
										.addGroup(
												gl_panel_1
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(label)
														.addComponent(
																textField,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
										.addGap(18)
										.addComponent(button)
										.addGap(30)
										.addGroup(
												gl_panel_1
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(label_1)
														.addComponent(
																textField_1,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
										.addContainerGap(61, Short.MAX_VALUE)));
		panel_1.setLayout(gl_panel_1);

		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("查询", null, panel_2, null);

		JLabel label_2 = new JLabel("信用卡卡号");
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(gl_panel_2.createParallelGroup(
				Alignment.LEADING).addGroup(
				gl_panel_2.createSequentialGroup().addGap(69)
						.addComponent(label_2)
						.addContainerGap(278, Short.MAX_VALUE)));
		gl_panel_2.setVerticalGroup(gl_panel_2.createParallelGroup(
				Alignment.LEADING).addGroup(
				gl_panel_2.createSequentialGroup().addGap(30)
						.addComponent(label_2)
						.addContainerGap(177, Short.MAX_VALUE)));
		panel_2.setLayout(gl_panel_2);

		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("修改", null, panel_3, null);

		JLabel label_3 = new JLabel("信用卡卡号");
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(gl_panel_3.createParallelGroup(
				Alignment.LEADING).addGroup(
				gl_panel_3.createSequentialGroup().addGap(58)
						.addComponent(label_3)
						.addContainerGap(289, Short.MAX_VALUE)));
		gl_panel_3.setVerticalGroup(gl_panel_3.createParallelGroup(
				Alignment.LEADING).addGroup(
				gl_panel_3.createSequentialGroup().addGap(41)
						.addComponent(label_3)
						.addContainerGap(166, Short.MAX_VALUE)));
		panel_3.setLayout(gl_panel_3);

		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("挂失", null, panel_4, null);

		JLabel label_4 = new JLabel("信用卡卡号");
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(gl_panel_4.createParallelGroup(
				Alignment.LEADING).addGroup(
				gl_panel_4.createSequentialGroup().addGap(70)
						.addComponent(label_4)
						.addContainerGap(277, Short.MAX_VALUE)));
		gl_panel_4.setVerticalGroup(gl_panel_4.createParallelGroup(
				Alignment.LEADING).addGroup(
				gl_panel_4.createSequentialGroup().addGap(45)
						.addComponent(label_4)
						.addContainerGap(162, Short.MAX_VALUE)));
		panel_4.setLayout(gl_panel_4);

		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("销卡", null, panel_5, null);

		JLabel label_5 = new JLabel("信用卡卡号");
		GroupLayout gl_panel_5 = new GroupLayout(panel_5);
		gl_panel_5.setHorizontalGroup(gl_panel_5.createParallelGroup(
				Alignment.LEADING).addGroup(
				gl_panel_5.createSequentialGroup().addGap(55)
						.addComponent(label_5)
						.addContainerGap(292, Short.MAX_VALUE)));
		gl_panel_5.setVerticalGroup(gl_panel_5.createParallelGroup(
				Alignment.LEADING).addGroup(
				gl_panel_5.createSequentialGroup().addGap(48)
						.addComponent(label_5)
						.addContainerGap(159, Short.MAX_VALUE)));
		panel_5.setLayout(gl_panel_5);
		panel.setLayout(gl_panel);
	}
}
