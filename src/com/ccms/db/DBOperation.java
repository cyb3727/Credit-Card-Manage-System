/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ccms.db;

import java.sql.*;

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
    @SuppressWarnings("unused")
	private static ResultSet mResultSet = null;
    private static Connection mConnection = null;
    private static Statement statement = null;
    private static String sql = null;
    private static String d = ",";

    /**
     * 数据库连接建立
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
//            sql = "insert into info values(\"yes\");";
//            statement.execute(sql);
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
        sql = "insert into User values("
                + user.getUserID() + d
                + user.getUserName() + d
                + user.getType().toString() + d
                + user.getEmailAddress() + d
                + user.getStatus() + d
                + user.getBankID() + ");";
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
        sql = "insert into Costumer values("
                + costumer.getCostumerID() + d
                + costumer.getID() + d
                + costumer.getFirstName() + d
                + costumer.getSecondName() + d
                + costumer.getGender() + d
                + costumer.getBirthday() + d
                + costumer.getPhoneNumber() + d
                + costumer.getAddress() + d
                + costumer.getEmailAddress() + ");";

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
        sql = "insert into Bank values("
                + bank.getBankID() + d
                + bank.getBankName() + d
                + bank.getBankAddress() + d
                + bank.getTelephoneNumber() + ");";
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
        sql = "insert into Bank values("
                + operationList.getUserID() + d
                + operationList.getCostumerID() + d
                + operationList.getOperationTime() + d
                + operationList.getContent() + ");";
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
        sql = "insert into Bank values("
                + creditCard.getCreditCardID() + d
                + creditCard.getBankName() + d
                + creditCard.getPassword() + d
                + creditCard.getDeadline() + d
                + creditCard.getActived() + d
                + creditCard.getStatus() + d
                + creditCard.getAccountID()
                + ");";
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
        sql = "insert into Bank values("
                + account.getAccountID() + d
                + account.getCostumerAccount() + d
                + account.getBankName() + d
                + account.getCostumerAccount()
                + ");";
        System.out.println(sql);
        if (!mConnection.isClosed()) {
            statement.execute(sql);
        } else {
            System.out.println("数据库未连接！");
        }
    }

    public static void Insert(Loss loss) throws SQLException {
        sql = "insert into Bank values("
                + loss.getLossID() + d
                + loss.getLossCostumer() + d
                + loss.getCreditCardID() + d
                + loss.getLossDate()
                + ");";
        System.out.println(sql);
        if (!mConnection.isClosed()) {
            statement.execute(sql);
        } else {
            System.out.println("数据库未连接！");
        }
    }

    public static void Insert(TransationRecord transationRecord) throws SQLException {
        sql = "insert into Bank values("
                + transationRecord.getTransationID() + d
                + transationRecord.getTransationTime() + d
                + transationRecord.getCreditCardID() + d
                + transationRecord.getAccountTime() + d
                + transationRecord.getTransationAmount() + d
                + transationRecord.getTransationAddress() + d
                + transationRecord.getTransationType()
                + ");";
        System.out.println(sql);
        if (!mConnection.isClosed()) {
            statement.execute(sql);
        } else {
            System.out.println("数据库未连接！");
        }
    }
}
