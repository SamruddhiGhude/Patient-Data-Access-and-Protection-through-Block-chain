/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB_Operation;

import java.sql.Statement;

/**
 *
 * @author admin
 */
public class Doctor_Edit_Profile
{
    public boolean isDoctorUpdagte(Statement st,String name,String mobile,String email,String reg_no,String speciallity,String username,String password)
    {
        boolean flag=false;
        try
        {
            String query="update doctor_registration_info set doctor_name='"+name+"', mobile_number='"+mobile+"', email_id='"+email+"', speciality='"+speciallity+"', password='"+password+"' where register_no='"+reg_no+"' and username='"+username+"'";
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
