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
public class Patient_Information_Fetcher 
{
     public ArrayList getPatientData(Statement st, String pid,String pname,String dob)
    {
        ArrayList data=new ArrayList();
        try
        {
            String query="select * from patient_info where pid='"+pid+"' and pname='"+pname+"' and dob='"+dob+"'";
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
      public ArrayList getPatient_Service_Data(Statement st, String sid,String pid,String pname)
    {
        ArrayList data=new ArrayList();
        try
        {
            String query="select * from service_info where s_id='"+sid+"' and p_id='"+pid+"' and pname='"+pname+"'";
            ResultSet rs=st.executeQuery(query);
            if(rs.next())
            {
               data.add(rs.getString(1));//pid
                data.add(rs.getString(2));//sid
                data.add(rs.getString(3));//dt
                data.add(rs.getString(4));//dname
                data.add(rs.getString(5));//hos_name
                data.add(rs.getString(6));//pname
                data.add(rs.getString(7));//dob
                data.add(rs.getString(8));//age
                data.add(rs.getString(9));//gender
                data.add(rs.getString(10));//mobile
                data.add(rs.getString(11));//email
                data.add(rs.getString(12));//illness
                data.add(rs.getString(13));//height
                data.add(rs.getString(14));//weight
                data.add(rs.getString(15));//bp
                data.add(rs.getString(16));//sugar
                data.add(rs.getString(17));//treatment
                data.add(rs.getString(18));//prescription
            }
            System.out.println("Data is: "+data);
        }
        catch(Exception ex)
        {
            System.out.println("Exception is: "+ex);
        }
        return data;
    }
      public ArrayList getEmergency_Patient_Service_Data(Statement st, String sid,String date_time,String docname)
    {
        ArrayList data=new ArrayList();
        try
        {
            String query="select * from service_info where s_id='"+sid+"' and date_time='"+date_time+"' and doctor_name='"+docname+"'";
            ResultSet rs=st.executeQuery(query);
            if(rs.next())
            {
               data.add(rs.getString(1));//pid
                data.add(rs.getString(2));//sid
                data.add(rs.getString(3));//dt
                data.add(rs.getString(4));//dname
                data.add(rs.getString(5));//hos_name
                data.add(rs.getString(6));//pname
                data.add(rs.getString(7));//dob
                data.add(rs.getString(8));//age
                data.add(rs.getString(9));//gender
                data.add(rs.getString(10));//mobile
                data.add(rs.getString(11));//email
                data.add(rs.getString(12));//illness
                data.add(rs.getString(13));//height
                data.add(rs.getString(14));//weight
                data.add(rs.getString(15));//bp
                data.add(rs.getString(16));//sugar
                data.add(rs.getString(17));//treatment
                data.add(rs.getString(18));//prescription
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
