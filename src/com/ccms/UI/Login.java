package com.ccms.UI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import java.awt.Font;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JTextField;

import com.ccms.log.sys.User;
import com.ccms.log.sys.User.userType;
import com.ccms.server.EchoServer;

@SuppressWarnings("serial")
public class Login extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private final Action action = new SwingAction();
	private final Action action_1 = new SwingAction_1();
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		try {

			Login dialog = new Login();
			dialog.setLocationRelativeTo(null);
			dialog.setResizable(false);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
			// MainWindow.main(null);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * Create the dialog.
	 */
	public Login() {
		setBounds(100, 100, 450, 300);
		setTitle("XXX银行办公系统");
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		JLabel lblXxx = new JLabel("XXX银行办公系统");
		lblXxx.setFont(new Font("黑体", Font.BOLD, 20));
		lblXxx.setBounds(147, 12, 159, 24);
		contentPanel.add(lblXxx);

		textField = new JTextField();
		textField.setBounds(192, 89, 114, 19);
		contentPanel.add(textField);
		textField.setColumns(10);

		JLabel label = new JLabel("用户名");
		label.setBounds(147, 91, 39, 15);
		contentPanel.add(label);

		passwordField = new JPasswordField();
		passwordField.setBounds(192, 120, 114, 19);
		contentPanel.add(passwordField);

		JLabel label_1 = new JLabel("密码");
		label_1.setBounds(157, 122, 26, 15);
		contentPanel.add(label_1);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton OKButton = new JButton("OK");
				OKButton.setAction(action);
				OKButton.setActionCommand("OK");
				buttonPane.add(OKButton);
				getRootPane().setDefaultButton(OKButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				cancelButton.setAction(action_1);
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "登录");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}

		public void actionPerformed(ActionEvent e) {
			// TODO the server is for test ...
			Runnable r = new testServer();
			Thread t = new Thread(r);
			t.start();

			System.out.println("here i am~~~");
			String userName = textField.getText();
			@SuppressWarnings("deprecation")
			String password = passwordField.getText();
			System.out.println(userName);
			System.out.println(password);
			boolean passwordCorrect = false;
			try {
				Socket s = new Socket("localhost", 8189);
				try {
					InputStream insStream = s.getInputStream();
					OutputStream outStream = s.getOutputStream();

					Scanner in = new Scanner(insStream);
					PrintWriter out = new PrintWriter(outStream, true);

					out.println("magic282");
					while (in.hasNextLine()) {
						String line = in.nextLine();
						if (line.equals("OK")) {
							System.out.println("登录成功");
							passwordCorrect = true;
							break;
						}
					}
				} finally {
					s.close();
				}
			} catch (IOException e2) {
				// TODO: handle exception
			}
			if (passwordCorrect) {
				dispose();
				User user = new User();
				user.setUserType(userType.Common);
				user.setUserID(userName);
				MainWindow.main(user);
			} else {

			}

		}
	}

	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "退出");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}

		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}

	/**
	 * @author magic282 the class is for test the Login Class as a server ...
	 */
	private class testServer implements Runnable {
		public void run() {
			EchoServer.main(null);
		}
	}
}
