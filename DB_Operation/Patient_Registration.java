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
public class Patient_Registration
{
    public boolean isPatient_Registration(Statement st,String patientname,String patientmobile,String patientemail,String username,String password)
    {
        boolean flag=false;
        try
        {
          String query="insert into patient_registration_info values('"+patientname+"','"+patientmobile+"','"+patientemail+"','"+username+"','"+password+"')";
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
