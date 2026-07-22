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
public class Add_Patient_Infomation 
{
     public boolean isPatientInfoAdded(Statement st,String pid,String name,String dob,String age,String gender,String email,String mobile,String illness,String doc_name,String doc_username,String date_time)
    {
        boolean flag=false;
        try
        {
            String query="insert into patient_info values('"+pid+"','"+name+"','"+dob+"','"+age+"','"+gender+"','"+email+"','"+mobile+"','"+illness+"','"+doc_name+"','"+doc_username+"','"+date_time+"')";
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
