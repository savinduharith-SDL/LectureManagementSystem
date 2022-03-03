/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecturemanagementsystem;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author savindu
 */
public class MySQLConnection {
  public static Connection getConnection() throws Exception{
      final String dbRoot = "jdbc:mysql://";
      final String hostName = "localhost:3306/";
      final String dbName = "lms_db";
      String dbUrl = dbRoot + hostName + dbName;
      String hostUserName = "root";
      String hostPassword = "721300617v";
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection myConn = (Connection)DriverManager.getConnection(dbUrl,hostUserName,hostPassword);
      return myConn;
    }
}
