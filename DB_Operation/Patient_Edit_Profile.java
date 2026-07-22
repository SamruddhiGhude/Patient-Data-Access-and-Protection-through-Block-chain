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
public class Patient_Edit_Profile
{
    public boolean isPatientUpdagte(Statement st,String name,String mobile,String email,String username,String password)
    {
        boolean flag=false;
        try
        {
            String query="update patient_registration_info set patient_name='"+name+"', mobile_number='"+mobile+"', email_id='"+email+"', password='"+password+"' where username='"+username+"'";
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
