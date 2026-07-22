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
public class Patient_Details_Fetcher_For_View 
{
    public ArrayList getPatientData(Statement st, String pid)
    {
        ArrayList data=new ArrayList();
        try
        {
            String query="select * from patient_info where pid='"+pid+"'";
            ResultSet rs=st.executeQuery(query);
            if(rs.next())
            {
                data.add(rs.getString(1));
                data.add(rs.getString(2));
                data.add(rs.getString(3));
                data.add(rs.getString(4));
                data.add(rs.getString(5));
                data.add(rs.getString(6));
                data.add(rs.getString(7));
                data.add(rs.getString(8));
                data.add(rs.getString(9));
                data.add(rs.getString(10));
                data.add(rs.getString(11));
                
            }
            System.out.println("Data is: "+data);
        }
        catch(Exception ex)
        {
            System.out.println("Exception is: "+ex);
        }
        return data;
    }
}
