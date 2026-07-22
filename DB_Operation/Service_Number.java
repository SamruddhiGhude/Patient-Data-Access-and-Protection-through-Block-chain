/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB_Operation;


import doctor.*;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author lenovo
 */
public class Service_Number 
{
    public String getGroupNumber(Statement st)
    {
        int sno=0;
        ArrayList sNum=new Service_Id_Fetcher().getS_id(st);
       //System.out.println(SerialNum);
        
        
        if(sNum.isEmpty())
        {
            sno=1;
//            SerialNum.add(srno);
        }
        else
        {
            String big=(String)sNum.get(0);
                 int bg=Integer.parseInt(big);
            for (int i = 0; i < sNum.size(); i++) 
            {
                
                 
                 String gr=(String)sNum.get(i);
                 int s=Integer.parseInt(gr);
                 if(s>bg)
                 {
                     bg=s;
                 }
                
            }
            sno=bg+1;
//            SerialNum.add(srno);
        }
        sNum.add(sno);
        String service_num=Integer.toString(sno);
       // System.out.println("Serial number: "+SerialNum);
        return service_num;
    }
}
