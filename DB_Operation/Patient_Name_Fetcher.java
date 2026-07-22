/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB_Operation;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Patient_Name_Fetcher 
{
    public String getPatientName(Statement st,String username)
    {
        String patient_name="";
         try
        {
         
            
            
            String query="select * from patient_registration_info where username='"+username+"' " ;
            ResultSet rs=st.executeQuery(query);
            
           while(rs.next())
           {
                patient_name=rs.getString(1);
           }
          //  System.out.println("a1 is: "+a1);
       
        }
        catch(Exception e)
        {
            System.out.println(e);
           
        }
         return patient_name;
    }
    
    public ArrayList getPatientData(Statement st,String pname)
    {
        ArrayList patient_data=new ArrayList();
         try
        {
         
            String query="select * from patient_info where pname='"+pname+"' " ;
            ResultSet rs=st.executeQuery(query);
            
           while(rs.next())
           {
                patient_data.add(rs.getString(1));
                patient_data.add(rs.getString(2));
                patient_data.add(rs.getString(3));
           }
          //  System.out.println("a1 is: "+a1);
       
        }
        catch(Exception e)
        {
            System.out.println(e);
           
        }
         return patient_data;
    }
}
