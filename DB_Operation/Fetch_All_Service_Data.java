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
public class Fetch_All_Service_Data
{
     public ArrayList getServicedata(Statement st)
    {
        ArrayList all_data=new ArrayList();
         try
        {
         
            
            
            String query="select * from service_info " ;
            ResultSet rs=st.executeQuery(query);
            
           while(rs.next())
           {
               ArrayList row=new ArrayList();
                row.add(rs.getString(1));
                row.add(rs.getString(2));
                row.add(rs.getString(3));
                row.add(rs.getString(4));
                row.add(rs.getString(5)); 
                row.add(rs.getString(6));
                row.add(rs.getString(7));
                row.add(rs.getString(8));
                row.add(rs.getString(9));
                row.add(rs.getString(10));
                row.add(rs.getString(11));
                row.add(rs.getString(12));
                row.add(rs.getString(13)); 
                row.add(rs.getString(14));
                row.add(rs.getString(15));
                row.add(rs.getString(16));
                row.add(rs.getString(17));
                row.add(rs.getString(18));
                row.add(rs.getString(19));
//                row.add(rs.getString(17));
                
                all_data.add(row);
           }
           all_data=getSortedData(all_data);
           System.out.println("a1 is: "+all_data);
       
        }
        catch(Exception e)
        {
            System.out.println(e);
           
        }
         return all_data;
    }
     
     public ArrayList getSortedData(ArrayList data)
     {
          for (int i = 0; i < data.size()-1; i++) 
        {
           
            for (int j = i+1; j < data.size(); j++)
            {
                ArrayList row1=(ArrayList)data.get(i);
            String srno1=(String)row1.get(0);
            int sr_no1=Integer.parseInt(srno1);
            
                ArrayList row2=(ArrayList)data.get(j);
                String srno2=(String)row2.get(0);
                int sr_no2=Integer.parseInt(srno2);
                System.out.println("sr_no1: "+sr_no1);
                 System.out.println("sr_no2: "+sr_no2);
                
                if(sr_no1 > sr_no2)
                {
                    
                    data.set(i, row2);
                    data.set(j, row1);
                }
//                  
            }
        }
          return data;
     }
}
