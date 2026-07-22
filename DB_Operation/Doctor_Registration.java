/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB_Operation;

import java.sql.Statement;

/**
 *
 * @author welcome
 */
public class Doctor_Registration 
{
    public boolean isDoctorRegistration(Statement st,String name,String mobile,String email,String reg_no,String speciallity,String username,String password)
    {
        boolean flag=false;
        try
        {
            String query="insert into doctor_registration_info values('"+name+"','"+mobile+"','"+email+"','"+reg_no+"','"+speciallity+"','"+username+"','"+password+"')";
            int x=st.executeUpdate(query);
            if(x>0)
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
