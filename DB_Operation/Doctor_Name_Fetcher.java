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
public class Doctor_Name_Fetcher 
{
    public String getDoctorName(Statement st,String username)
    {
        String doc_name="";
         try
        {
         
            
            
            String query="select * from doctor_registration_info where username='"+username+"' " ;
            ResultSet rs=st.executeQuery(query);
            
           while(rs.next())
           {
                doc_name=rs.getString(1);
           }
          //  System.out.println("a1 is: "+a1);
       
        }
        catch(Exception e)
        {
            System.out.println(e);
           
        }
         return doc_name;
    }
}
