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
public class Doctor_Data_Fetcher 
{
    public ArrayList getDoctorData(Statement st, String username)
    {
        ArrayList data=new ArrayList();
        try
        {
            String query="select * from doctor_registration_info where username='"+username+"'";
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
