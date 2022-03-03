/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecturemanagementsystem;


/**
 *
 * @author savindu
 */
import javax.swing.JFrame;
public class Logout {
    public static void logout(JFrame context, Login logginscr){
        LoginSession.isLogged = false;
        context.setVisible(false);
        logginscr.setVisible(true);
    }
}
