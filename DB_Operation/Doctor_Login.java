/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB_Operation;

import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author admin
 */
public class Doctor_Login 
{
      public boolean isDoctorLogin(Statement st, String username,String password)
    {
        boolean flag=true;
        try
        {
            String query="select * from doctor_registration_info where username='"+username+"' and password='"+password+"'";
            ResultSet rs=st.executeQuery(query);
            if(rs.next())
                flag=true;
            else
                flag=false;
        }
        catch(Exception ex)
        {
            System.out.println("Exception is: "+ex);
        }
        return flag;
    }
}
