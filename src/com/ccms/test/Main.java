/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ccms.test;

import java.sql.*;

import com.ccms.db.DBOperation;
import com.ccms.log.sys.User;

/**
 *
 * @author hit-acm
 */
public class Main {

//    public static void mysqlConnect() {
//        String dbDriver = "com.mysql.jdbc.Driver";
//        String url = "jdbc:mysql://localhost/cyb";
//        String username = "cyb";
//        String password = "123456";
//
//        ResultSet mResultSet = null;
//        Connection mConnection = null;
//        try {
//            Class.forName(dbDriver);
//            mConnection = DriverManager.getConnection(url, username, password);
//            if (!mConnection.isClosed()) {
//                System.out.println("Yes\n");
//            }
//            Statement statement = mConnection.createStatement();
//            String sql = "insert into info values(\"yes\")";
//            statement.execute(sql);
//            mConnection.close();
//        } catch (ClassNotFoundException e) {
//            System.out.println("Sorry,can`t find the Driver!");
//        } catch (SQLException e) {
//            System.out.println("Sorry!");
//        } catch (Exception e) {
//            System.out.println("Sorry!");
//        }
//    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        System.out.println();
        if (!DBOperation.Connnect()) {
            System.out.println("数据库链接异常！");
        }
        User user = new User();
        DBOperation.Insert(user);
        DBOperation.CloseDB();
    }
}
