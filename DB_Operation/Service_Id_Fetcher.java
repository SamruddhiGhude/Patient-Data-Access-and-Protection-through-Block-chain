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
public class Service_Id_Fetcher 
{
    public ArrayList getService_id(Statement st,String pid)
    {
        ArrayList service_id=new ArrayList();
         try
        {
         
            
            
            String query="select * from service_info where p_id='"+pid+"' " ;
            ResultSet rs=st.executeQuery(query);
            
           while(rs.next())
           {
                service_id.add(rs.getString(1));
           }
          //  System.out.println("a1 is: "+a1);
       
        }
        catch(Exception e)
        {
            System.out.println(e);
           
        }
         return service_id;
    }
     public ArrayList getS_id(Statement st)
    {
        ArrayList service_id=new ArrayList();
         try
        {
         
            
            
            String query="select * from service_info " ;
            ResultSet rs=st.executeQuery(query);
            
           while(rs.next())
           {
                service_id.add(rs.getString(1));
           }
          System.out.println("a1 is: "+service_id);
       
        }
        catch(Exception e)
        {
            System.out.println(e);
           
        }
         return service_id;
    }
}
