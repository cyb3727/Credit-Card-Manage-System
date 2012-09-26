package com.ccms.UI;

import java.awt.EventQueue;

import javax.swing.JFrame;

import com.ccms.log.sys.User;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;

public class AccountManage {

	private JFrame frame;

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

		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("客户信息维护", null, panel_2, null);

		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);

		JPanel panel_6 = new JPanel();
		tabbedPane_1.addTab("New tab", null, panel_6, null);

		JPanel panel_7 = new JPanel();
		tabbedPane_1.addTab("New tab", null, panel_7, null);
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

		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("取款", null, panel_4, null);

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
}
