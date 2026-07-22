/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doctor;

import DB_Operation.DB_Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author lenovo
 */
public class PatientNumberFetcher 
{
    public ArrayList getData(Statement st)
    {
        ArrayList a1=new ArrayList();
       
        try
        {
         
            
            
            String query="select * from patient_info " ;
            ResultSet rs=st.executeQuery(query);
            
           while(rs.next())
           {
                a1.add(rs.getString(1));
           }
          //  System.out.println("a1 is: "+a1);

        }
        catch(Exception e)
        {
            System.out.println(e);
           
        }
      
    return a1;
    }
}
