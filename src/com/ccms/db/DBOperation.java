/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ccms.db;

import java.sql.*;
import java.util.Date;

import com.ccms.account.Account;
import com.ccms.account.Costumer;
import com.ccms.cc.CreditCard;
import com.ccms.cc.Loss;
import com.ccms.log.sys.User;

/**
 * 
 * @author hit-acm
 */
public class DBOperation {

	private static String dbDriver = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost/ccms";
	private static String username = "root";
	private static String password = "1234567890";
	private static ResultSet mResultSet = null;
	private static Connection mConnection = null;
	private static Statement statement = null;
	private static String sql = null;
	private static String d = ",";

	/**
	 * 对于没有加“”的字符串进行处理
	 * 
	 * @param s
	 * @return
	 */
	public static String Actoma(String s) {
		if (s != null) {
			s = "\"" + s + "\"";
		}
		return s;
	}

	public static String Actoma(Date s) {
		String res = new String();
		if (s == null) {
			return null;
		}
		res = "\"" + s + "\"";
		System.out.println(res);
		return res;
	}

	/**
	 * 数据库连接建立
	 * 
	 * @return
	 */
	public static boolean Connnect() {
		try {
			Class.forName(dbDriver);
			mConnection = DriverManager.getConnection(url, username, password);
			if (!mConnection.isClosed()) {
				System.out.println("Connected successfully\n");
			}
			statement = mConnection.createStatement();
			// sql = "insert into info values(\"yes\");";
			// statement.execute(sql);
		} catch (ClassNotFoundException e) {
			return false;
		} catch (SQLException e) {
			return false;
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public static void CloseDB() throws SQLException {
		mConnection.close();
	}

	/**
	 * 
	 * @param user
	 */
	public static void Insert(User user) throws SQLException {
		sql = "insert into User values(" + Actoma(user.getUserID()) + d
				+ Actoma(user.getUserName()) + d
				+ Actoma(user.getUserType().toString()) + d
				+ Actoma(user.getEmailAddress()) + d + Actoma(user.getStatus())
				+ d + Actoma(user.getBankID()) + ");";
		System.out.println(sql);
		if (!mConnection.isClosed()) {
			statement.execute(sql);
		} else {
			System.out.println("数据库未连接！");
		}
	}

	/**
	 * 
	 * @param costumer
	 */
	public static void Insert(Costumer costumer) throws SQLException {
		sql = "insert into Costumer values(" + Actoma(costumer.getCostumerID())
				+ d + Actoma(costumer.getID()) + d
				+ Actoma(costumer.getFirstName()) + d
				+ Actoma(costumer.getSecondName()) + d
				+ Actoma(costumer.getGender()) + d
				+ Actoma(costumer.getBirthday()) + d
				+ Actoma(costumer.getPhoneNumber()) + d
				+ Actoma(costumer.getAddress()) + d
				+ Actoma(costumer.getEmailAddress()) + ");";

		System.out.println(sql);
		if (!mConnection.isClosed()) {
			statement.execute(sql);
		} else {
			System.out.println("数据库未连接！");
		}
	}

	/**
	 * 
	 * @param bank
	 */
	public static void Insert(Bank bank) throws SQLException {
		sql = "insert into Bank values(" + Actoma(bank.getBankID()) + d
				+ Actoma(bank.getBankName()) + d
				+ Actoma(bank.getBankAddress()) + d
				+ Actoma(bank.getTelephoneNumber()) + ");";
		System.out.println(sql);
		if (!mConnection.isClosed()) {
			statement.execute(sql);
		} else {
			System.out.println("数据库未连接！");
		}
	}

	/**
	 * 
	 * @param operationList
	 */
	public static void Insert(OperationList operationList) throws SQLException {
		sql = "insert into Bank values(" + Actoma(operationList.getUserID())
				+ d + Actoma(operationList.getCostumerID()) + d
				+ Actoma(operationList.getOperationTime()) + d
				+ Actoma(operationList.getContent()) + ");";
		System.out.println(sql);
		if (!mConnection.isClosed()) {
			statement.execute(sql);
		} else {
			System.out.println("数据库未连接！");
		}
	}

	/**
	 * 
	 * @param creditCard
	 */
	public static void Insert(CreditCard creditCard) throws SQLException {
		sql = "insert into Bank values(" + Actoma(creditCard.getCreditCardID())
				+ d + Actoma(creditCard.getBankName()) + d
				+ Actoma(creditCard.getPassword()) + d
				+ Actoma(creditCard.getDeadline()) + d
				+ Actoma(creditCard.getActived()) + d
				+ Actoma(creditCard.getStatus()) + d
				+ Actoma(creditCard.getAccountID()) + ");";
		System.out.println(sql);
		if (!mConnection.isClosed()) {
			statement.execute(sql);
		} else {
			System.out.println("数据库未连接！");
		}
	}

	/**
	 * 
	 * @param account
	 */
	public static void Insert(Account account) throws SQLException {
		sql = "insert into Bank values(" + Actoma(account.getAccountID()) + d
				+ Actoma(account.getCostumerAccount()) + d
				+ Actoma(account.getBankName()) + d
				+ Actoma(account.getCostumerAccount()) + d
				+ Actoma(account.getCostumerAccount()) + ");";
		System.out.println(sql);
		if (!mConnection.isClosed()) {
			statement.execute(sql);
		} else {
			System.out.println("数据库未连接！");
		}
	}

	public static void Insert(Loss loss) throws SQLException {
		sql = "insert into Bank values(" + Actoma(loss.getLossID()) + d
				+ Actoma(loss.getLossCostumer()) + d
				+ Actoma(loss.getCreditCardID()) + d
				+ Actoma(loss.getLossDate()) + ");";
		System.out.println(sql);
		if (!mConnection.isClosed()) {
			statement.execute(sql);
		} else {
			System.out.println("数据库未连接！");
		}
	}

	/**
	 * 
	 * @param transationRecord
	 * @throws SQLException
	 */
	public static void Insert(TransationRecord transationRecord)
			throws SQLException {
		sql = "insert into Bank values("
				+ Actoma(transationRecord.getTransationID()) + d
				+ Actoma(transationRecord.getTransationTime()) + d
				+ Actoma(transationRecord.getCreditCardID()) + d
				+ Actoma(transationRecord.getAccountTime()) + d
				+ Actoma(transationRecord.getTransationAmount()) + d
				+ Actoma(transationRecord.getTransationAddress()) + d
				+ Actoma(transationRecord.getTransationType()) + ");";
		System.out.println(sql);
		if (!mConnection.isClosed()) {
			statement.execute(sql);
		} else {
			System.out.println("数据库未连接！");
		}
	}

	/**
	 * 
	 * @param account
	 * @param money
	 * @throws SQLException
	 */
	public static void PlusMoney(Account account, String money)
			throws SQLException {
		long Money = Long.parseLong(money);
		sql = "select * from Account where Account.AccountID="
				+ account.getAccountID() + ";";
		if (!mConnection.isClosed()) {
			mResultSet = statement.executeQuery(sql);

			int i = 0;
			String TotalMoney[] = new String[10];
			while (mResultSet.next()) {
				TotalMoney[i++] = mResultSet.getString("CostumerAccount");
			}
			if (i == 0) {
				System.out.println("对不起该用户不存在！");
			} else if (i == 1) {
				Money = Money + Long.parseLong(TotalMoney[0]);
				sql = "update Account set CostumerAccount=" + Money + ";";
				statement.execute(sql);
				System.out.println("存款成功！");
			} else {
				System.out.println("数据库存在错误，有多个有相同帐号的用户存在！");
			}
		} else {
			System.out.println("数据库未连接！");
		}
	}

	/**
	 * 
	 * @param account
	 * @param money
	 * @throws SQLException
	 */
	public static void MinusMoney(Account account, String money)
			throws SQLException {
		long Money = Long.parseLong(money);
		sql = "select * from Account where Account.AccountID="
				+ account.getAccountID() + ";";
		if (!mConnection.isClosed()) {
			mResultSet = statement.executeQuery(sql);

			int i = 0;
			String TotalMoney[] = new String[10];
			while (mResultSet.next()) {
				TotalMoney[i++] = mResultSet.getString("CostumerAccount");
			}
			if (i == 0) {
				System.out.println("对不起该用户不存在！");
			} else if (i == 1) {
				Money = -Money + Long.parseLong(TotalMoney[0]);
				if (Money >= 0) {
					sql = "update Account set CostumerAccount=" + Money + ";";
					statement.execute(sql);
					System.out.println("取款成功！");
				} else {
					System.out.println("对不起，余额不足！");
				}
			} else {
				System.out.println("数据库存在错误，有多个有相同帐号的用户存在！");
			}
		} else {
			System.out.println("数据库未连接！");
		}
	}

}