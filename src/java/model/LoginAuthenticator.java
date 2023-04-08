package model;

import db.DBConnector;
import dto.userDTO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Pankaj
 */
public class LoginAuthenticator 
{
    public boolean isLogin(userDTO user)
     {
         String username = user.getUsername();
         String password = user.getPassword();
        
        String tablePassword="";
        try
        {
            Statement st = DBConnector.getStatement();
            String query = "SELECT userPassword FROM user WHERE userId ='"+username+"'";
            System.out.println("Query = "+query);
            ResultSet rs = st.executeQuery(query);
            if(rs.next())
            {
                tablePassword = rs.getString(1);
            }
            else
            {
                return false;
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        if(username!=null && password!=null && !username.trim().equals("") && password.equals(tablePassword))
        {
            return true;
        }
        return false;
    }

}
       