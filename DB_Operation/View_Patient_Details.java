/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB_Operation;

import doctor.View_Patient_Details_Frame;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author admin
 */
public class View_Patient_Details
{
     public void getViewpatientinfo()
    {
          String dkey="X134SY";
        try
        {
          
           Statement st1=new DB_Driver().getStatement();
           Statement st2=new DB_Driver().getStatement();
            String query="select * from patient_info";
            ResultSet rs1=st1.executeQuery(query);
            ResultSet rs2=st2.executeQuery(query);
            
            
            
            
            int row=0;
            while(rs1.next())
            {
                row++;
            }
            String data[][]=new String[row][3];
            int i=0;
            while(rs2.next())
            {
                String pid=rs2.getString(1);
                data[i][0]=pid;
                String pname=rs2.getString(2);
                data[i][1]=pname;
                String dob=rs2.getString(3);
                data[i][2]=dob;
                
                   i++;
            }
            View_Patient_Details_Frame.data=data;
        }
        catch(Exception ex)
        {
            System.out.println("Exception is: "+ex);
        }
    }
}
