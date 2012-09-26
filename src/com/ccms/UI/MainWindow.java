package com.ccms.UI;

import java.awt.EventQueue;
import javax.swing.*;

import com.ccms.log.sys.User;

import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Font;
import java.util.Calendar;
import java.util.Date;
import java.awt.Dimension;

public class MainWindow {

	private JFrame frame;
	private final Action action = new SwingAction();
	private static User user;
	private JTextField textField;
	private JTextField textField_1;
	private final Action action_1 = new SwingAction_1();
	private final Action action_2 = new SwingAction_2();

	public User getUser() {
		return user;
	}

	private static void setUser(User u) {
		user = u;
	}

	/**
	 * Launch the application.
	 */
	public static void main(final User args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow(args);
					window.frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
					window.frame.setVisible(true);

					window.frame.setResizable(true);
					window.frame.setLocationRelativeTo(null);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

	/**
	 * Create the application.
	 */
	public MainWindow(User user) {
		initialize();
		startTime();
		setUserID(user);
		setUserID(user);
	}

	class SystemTime implements Runnable {
		private Date currentDate;

		public void run() {
			while (true) {
				currentDate = new Date();
				textField.setText(currentDate.toLocaleString());

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	private void startTime() {
		Runnable r = new SystemTime();
		Thread t = new Thread(r);
		t.start();
	}

	private void setUserID(User user) {
		textField_1.setText(user.getUserID());
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setUndecorated(true);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setVisible(true);

		frame.setTitle("XXX银行办公系统");
		frame.setResizable(true);
		frame.setBounds(100, 100, 450, 300);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);

		JMenu mnNewMenu = new JMenu("New menu");
		menuBar.add(mnNewMenu);

		JMenuItem mntmNewMenuItem = new JMenuItem("New menu item");
		mntmNewMenuItem.setAction(action);
		mnNewMenu.add(mntmNewMenuItem);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.NORTH);

		JLabel lblXxx = new JLabel("XXX银行办公系统");
		lblXxx.setFont(new Font("黑体", Font.BOLD, 20));
		panel.add(lblXxx);

		JPanel panel_1 = new JPanel();
		panel.add(panel_1);

		JLabel lblNewLabel = new JLabel("工号");
		panel_1.add(lblNewLabel);

		textField_1 = new JTextField();
		panel_1.add(textField_1);
		textField_1.setColumns(10);

		JPanel panel_2 = new JPanel();
		frame.getContentPane().add(panel_2, BorderLayout.SOUTH);

		JLabel lblNewLabel_1 = new JLabel("Current Time");
		panel_2.add(lblNewLabel_1);

		textField = new JTextField();
		textField.setText("0000-00-00 00-00-00");
		panel_2.add(textField);
		textField.setColumns(10);

		JPanel panel_3 = new JPanel();
		frame.getContentPane().add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JButton btnNewButton = new JButton("账户管理");
		btnNewButton.setAction(action_1);
		panel_3.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("信用卡管理");
		btnNewButton_1.setAction(action_2);
		panel_3.add(btnNewButton_1);

	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "退出");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}

		public void actionPerformed(ActionEvent e) {
			// System.out.println("the system is going to exit now ...");
			System.exit(0);
		}
	}

	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "账户管理");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}

		public void actionPerformed(ActionEvent e) {
			Runnable r = new AM();
			Thread t = new Thread(r);
			t.start();
		}
	}

	private class AM implements Runnable {

		public void run() {
			AccountManage.main(getUser());
		}
	}

	private class SwingAction_2 extends AbstractAction {
		public SwingAction_2() {
			putValue(NAME, "信用卡管理");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}

		public void actionPerformed(ActionEvent e) {
			Runnable r = new CC();
			Thread t = new Thread(r);
			t.start();
		}
	}

	private class CC implements Runnable {

		public void run() {
			CCManage.main(getUser());
		}
	}
}
