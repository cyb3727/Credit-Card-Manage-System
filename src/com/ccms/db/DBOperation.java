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
        Connnect();
        sql = "insert into User values("
                + Actoma(user.getUserID()) + d
                + Actoma(user.getUserName()) + d
                + Actoma(user.getUserType()) + d
                + Actoma(user.getEmailAddress()) + d
                + Actoma(user.getStatus()) + d
                + Actoma(user.getBankID()) + ");";
        System.out.println(sql);
        if (!mConnection.isClosed()) {
            statement.execute(sql);
        } else {
            System.out.println("数据库未连接！");
        }
    }

    /**
     * 如果的类中ID返回值为null，说明不存
     * @param ID
     * @return
     */
    public static User DBUser(String ID) throws SQLException {
        Connnect();
        User user = new User();
        sql = "select * from User where User.UserID=" + Actoma(ID) + ";";
        if (!mConnection.isClosed()) {
            mResultSet = statement.executeQuery(sql);
            while (mResultSet.next()) {
                user.setBankID(mResultSet.getString("BankID"));
                user.setEmailAddress(mResultSet.getString("EmailAddress"));
                user.setStatus(mResultSet.getString("Status"));
                user.setUserID(mResultSet.getString("UserID"));
                user.setUserName(mResultSet.getString("UserName"));
                user.setUserType(mResultSet.getString("UserType"));
            }
        } else {
            System.out.println("数据库未连接！");
        }
        return user;
    }

    /**
     *
     * @param costumer
     */
    public static void Insert(Costumer costumer) throws SQLException {
        Connnect();
        sql = "insert into Costumer values("
                + Actoma(costumer.getCostumerID()) + d
                + Actoma(costumer.getID()) + d
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
     * 如果的类中ID返回值为null，说明不存
     * @param ID
     * @return
     */
    public static Costumer DBCostumer(String ID) throws SQLException {
        Connnect();
        Costumer costumer = new Costumer();
        sql = "select * from Costumer where Costumer.CostumerID=" + Actoma(ID) + ";";
        if (!mConnection.isClosed()) {
            mResultSet = statement.executeQuery(sql);
            while (mResultSet.next()) {
                costumer.setAddress(mResultSet.getString("Address"));
                costumer.setBirthday(mResultSet.getDate("Birthday"));
                costumer.setCostumerID(mResultSet.getString("CostumerID"));
                costumer.setEmailAddress(mResultSet.getString("EmailAddress"));
                costumer.setFirstName(mResultSet.getString("FirstName"));
                costumer.setGender(mResultSet.getString("Gender"));
                costumer.setID(mResultSet.getString("ID"));
                costumer.setPhoneNumber(mResultSet.getString("PhoneNumber"));
                costumer.setSecondName(mResultSet.getString("SecondName"));
            }
        } else {
            System.out.println("数据库未连接！");
        }
        return costumer;
    }

    /**
     * 
     * @param bank
     */
    public static void Insert(Bank bank) throws SQLException {
        Connnect();
        sql = "insert into Bank values("
                + Actoma(bank.getBankID()) + d
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
     * 如果的类中ID返回值为null，说明不存
     * @param ID
     * @return
     * @throws SQLException
     */
    public static Bank DBBank(String ID) throws SQLException {
        Connnect();
        Bank bank = new Bank();
        sql = "select * from Bank where Bank.BankID=" + Actoma(ID) + ";";
        if (!mConnection.isClosed()) {
            mResultSet = statement.executeQuery(sql);
            while (mResultSet.next()) {
                bank.setBankAddress(mResultSet.getString("BankAddress"));
                bank.setBankID(mResultSet.getString("BankID"));
                bank.setBankName(mResultSet.getString("BankName"));
                bank.setTelephoneNumber(mResultSet.getString("TelephoneNumber"));
            }
        } else {
            System.out.println("数据库未连接！");
        }
        return bank;
    }

    /**
     * 
     * @param operationList
     */
    public static void Insert(OperationList operationList) throws SQLException {
        Connnect();
        sql = "insert into Bank values("
                + Actoma(operationList.getUserID()) + d
                + Actoma(operationList.getCostumerID()) + d
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
     * 如果的类中ID返回值为null，说明不存
     * @param CostumerID,UserID
     * @return
     */
    public static OperationList DBOperationList(String CostumerID, String UserID) throws SQLException {
        Connnect();
        OperationList operationList = new OperationList();
        sql = "select * from OperationList where OperationList.CostumerID=" + Actoma(CostumerID) + " AND OperationList.UserID=" + Actoma(UserID) + ";";
        if (!mConnection.isClosed()) {
            mResultSet = statement.executeQuery(sql);
            while (mResultSet.next()) {
                operationList.setContent(mResultSet.getString("Content"));
                operationList.setCostumerID(mResultSet.getString("CostumerID"));
                operationList.setOperationTime(mResultSet.getDate("OperationTime"));
                operationList.setUserID(mResultSet.getString("UserID"));
            }
        } else {
            System.out.println("数据库未连接！");
        }
        return operationList;
    }

    /**
     * 
     * @param creditCard
     */
    public static void Insert(CreditCard creditCard) throws SQLException {
        Connnect();
        sql = "insert into Bank values("
                + Actoma(creditCard.getCreditCardID()) + d
                + Actoma(creditCard.getBankName()) + d
                + Actoma(creditCard.getPassword()) + d
                + Actoma(creditCard.getDeadline()) + d
                + Actoma(creditCard.getActived()) + d
                + Actoma(creditCard.getStatus()) + d
                + Actoma(creditCard.getAccountID())
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
        Connnect();
        sql = "insert into Bank values("
                + Actoma(account.getAccountID()) + d
                + Actoma(account.getCostumerAccount()) + d
                + Actoma(account.getBankName()) + d
                + Actoma(account.getCostumerAccount()) + d
                + Actoma(account.getCostumerID())
                + ");";
        System.out.println(sql);
        if (!mConnection.isClosed()) {
            statement.execute(sql);
        } else {
            System.out.println("数据库未连接！");
        }
    }

    /**
     * 如果的类中ID返回值为null，说明不存
     * @param ID
     * @return
     */
    public static Account DBAccount(String ID) throws SQLException {
        Connnect();
        Account account = new Account();
        sql = "select * from OperationList where Account.AccountID=" + Actoma(ID) + ";";
        if (!mConnection.isClosed()) {
            mResultSet = statement.executeQuery(sql);
            while (mResultSet.next()) {
                account.setAccountID(mResultSet.getString("AccountID"));
                account.setBankName(mResultSet.getString("BankName"));
                account.setCostumerAccount(mResultSet.getString("CostumerAccount"));
                account.setCostumerID(mResultSet.getString("CostumerID"));
                account.setCreateAccountTime(mResultSet.getDate("CreateAccountTime"));
            }
        } else {
            System.out.println("数据库未连接！");
        }
        return account;
    }

    public static void Insert(Loss loss) throws SQLException {
        Connnect();
        sql = "insert into Bank values("
                + Actoma(loss.getLossID()) + d
                + Actoma(loss.getLossCostumer()) + d
                + Actoma(loss.getCreditCardID()) + d
                + Actoma(loss.getLossDate())
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
     * @param transationRecord
     * @throws SQLException
     */
    public static void Insert(TransationRecord transationRecord) throws SQLException {
        Connnect();
        sql = "insert into Bank values("
                + Actoma(transationRecord.getTransationID()) + d
                + Actoma(transationRecord.getTransationTime()) + d
                + Actoma(transationRecord.getCreditCardID()) + d
                + Actoma(transationRecord.getAccountTime()) + d
                + Actoma(transationRecord.getTransationAmount()) + d
                + Actoma(transationRecord.getTransationAddress()) + d
                + Actoma(transationRecord.getTransationType())
                + ");";
        System.out.println(sql);
        if (!mConnection.isClosed()) {
            statement.execute(sql);
        } else {
            System.out.println("数据库未连接！");
        }
    }

    /**
     * 如果的类中ID返回值为null，说明不存
     * @param CreditCardID
     * @return
     * @throws SQLException
     */
    public static TransationRecord DBTransationRecord(String CreditCardID) throws SQLException {
        Connnect();
        TransationRecord transationRecord = new TransationRecord();
        sql = "select * from TransationRecord where TransationRecord.CreditCardID=" + Actoma(CreditCardID) + ";";
        if (!mConnection.isClosed()) {
            mResultSet = statement.executeQuery(sql);
            while (mResultSet.next()) {
                transationRecord.setAccountTime(mResultSet.getDate("AccountTime"));
                transationRecord.setCreditCardID(mResultSet.getString("CreditCardID"));
                transationRecord.setTransationAddress(mResultSet.getString("TransationAddress"));
                transationRecord.setTransationAmount(mResultSet.getString("TransationAmount"));
                transationRecord.setTransationID(mResultSet.getString("TransationID"));
                transationRecord.setTransationTime(mResultSet.getDate("TransationTime"));
                transationRecord.setTransationType(mResultSet.getString("TransationType"));
            }
        } else {
            System.out.println("数据库未连接！");
        }
        return transationRecord;
    }

    /**
     * 
     * @param costumer
     * @param money
     * @throws SQLException
     */
    public static void PlusMoney(Account account, String money) throws SQLException {
        Connnect();
        long Money = Long.parseLong(money);
        sql = "select * from Account where Account.AccountID=" + Actoma(account.getAccountID()) + ";";
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
     * @param costumer
     * @param money
     * @throws SQLException
     */
    public static void MinusMoney(Account account, String money) throws SQLException {
        Connnect();
        long Money = Long.parseLong(money);
        sql = "select * from Account where Account.AccountID=" + Actoma(account.getAccountID()) + ";";
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

    /**
     * 注销信用卡
     * @param CreditCardID
     * @throws SQLException
     */
    public static void Pincard(String CreditCardID) throws SQLException {
        Connnect();
        sql = "delete from CreditCard where CreditCard.CreditCardID=" + Actoma(CreditCardID) + ";";
        System.out.println(sql);
        if (!mConnection.isClosed()) {
            statement.execute(sql);
            System.out.println("注销信用卡成功！");
        } else {
            System.out.println("数据库未连接！");
        }
    }
}
