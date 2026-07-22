/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doctor;


import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author lenovo
 */
public class Patient_Number 
{
    public String getGroupNumber(Statement st)
    {
        int pno=0;
        ArrayList pNum=new PatientNumberFetcher().getData(st);
       // System.out.println(SerialNum);
        
        
        if(pNum.isEmpty())
        {
            pno=1;
//            SerialNum.add(srno);
        }
        else
        {
            String big=(String)pNum.get(0);
                 int bg=Integer.parseInt(big);
            for (int i = 0; i < pNum.size(); i++) 
            {
                
                 
                 String gr=(String)pNum.get(i);
                 int s=Integer.parseInt(gr);
                 if(s>bg)
                 {
                     bg=s;
                 }
                pno=bg+1;
            }
//            SerialNum.add(srno);
        }
        pNum.add(pno);
        String patient_num=Integer.toString(pno);
       // System.out.println("Serial number: "+SerialNum);
        return patient_num;
    }
}
