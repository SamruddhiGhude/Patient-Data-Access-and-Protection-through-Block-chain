/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB_Operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author welcome
 */
public class DB_Driver 
{
    public Statement getStatement()
    {
        Statement st=null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/patient_data_access_db", "root", "root");
            st=con.createStatement();
        }
        catch(Exception ex)
        {
            System.out.println("Exception is: "+ex);
        }
        return st;
    }
}
