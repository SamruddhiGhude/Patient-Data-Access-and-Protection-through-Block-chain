/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB_Operation;

import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author welcome
 */
public class Terminal_Key_Fetcher 
{
    public String getTerminalKey(Statement st,String sid)
    {
        String terminalkey="";
        try
        {
            String query="select * from service_info where s_id='"+sid+"'";
            ResultSet rs=st.executeQuery(query);
            if(rs.next())
            {
                terminalkey=rs.getString(19);
            }
            System.out.println("Terminal key : "+terminalkey);
        }
        catch(Exception ex)
        {
            System.out.println("Exception is: "+ex);
        }
        return terminalkey;
    }
}
