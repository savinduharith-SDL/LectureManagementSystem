/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecturemanagementsystem;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author savindu
 */
public class Operations {
    public static boolean isLogin(String userName, String password,String userType, JFrame frame)
    {
        try{
            Connection myConn = MySQLConnection.getConnection();
            String mysqlQuery = "SELECT UID, Usertype, AltName FROM login WHERE AltName = '"+
                    userName+
                    "' AND Password = '"+
                    password+
                    "'AND Usertype = '"+
                    userType+
                    "'";
            PreparedStatement preparedst = myConn.prepareStatement(mysqlQuery);
            ResultSet resultSet = preparedst.executeQuery();
            while(resultSet.next()){
                LoginSession.UID = resultSet.getInt("UID");
                LoginSession.UserType = resultSet.getString("Usertype");
                LoginSession.AltName = resultSet.getString("AltName");
                return true;
            }
        }
        catch(Exception exception){
            JOptionPane.showMessageDialog(frame,"Database error: " + exception.getMessage());
        }
        return false;
    }
}
