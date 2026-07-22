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
public class Edit_Patient_Information
{
    public boolean isPatientUpdagte(Statement st,String pid,String name,String dob, String age, String gender, String email,String mobile,String illness,String doc_name,String doc_username,String date_time)
    {
        boolean flag=false;
        try
        {
            String query="update patient_info set pname='"+name+"', dob='"+dob+"',age='"+age+"',gender='"+gender+"', email_id='"+email+"',mobile_no='"+mobile+"', major_illness='"+illness+"' where pid='"+pid+"'";
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
