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

public class CCManage {

	private JFrame frame;

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

		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("查询", null, panel_2, null);

		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("修改", null, panel_3, null);

		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("挂失", null, panel_4, null);

		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("销卡", null, panel_5, null);
		panel.setLayout(gl_panel);
	}
}
