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
public class Insert_Service_Information 
{
    public boolean isServiceInfoInserted(Statement st, String sid,String pid,String date_time,String doctor_name,String hospital_name,String pname,String dob,String age,String gender,String mobile,String email,String illness,String height,String weight,String bp,String sugar,String treatment,String prescription,String hashkey)
    {
        boolean flag=false;
        try
        {
             String query="insert into service_info values('"+sid+"','"+pid+"','"+date_time+"','"+doctor_name+"','"+hospital_name+"','"+pname+"','"+dob+"','"+age+"','"+gender+"','"+mobile+"','"+email+"','"+illness+"','"+height+"','"+weight+"','"+bp+"','"+sugar+"','"+treatment+"','"+prescription+"','"+hashkey+"')";
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
