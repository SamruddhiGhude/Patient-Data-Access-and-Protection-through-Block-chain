/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patient_data_access_system;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author admin
 */
public class Patient_Data_Access_System {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
       Login_Frame lf=new Login_Frame();
       Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
       lf.setVisible(true);
       lf.setSize(d);
    }
    
}
