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
            String query = "SELECT r_password,r_username,branch,p_year,City,mobile_no FROM registration WHERE r_username ='"+username+"'";
            System.out.println("Query = "+query);
            ResultSet rs = st.executeQuery(query);
            if(rs.next())
            {
                tablePassword = rs.getString(1);
                String r_username = rs.getString(2);
                String branch = rs.getString(3);
                String p_year = rs.getString(4);
                String city = rs.getString(5);
                String phone = rs.getString(6);
                
                user.setR_username(r_username);
                user.setCity(city);
                user.setP_year(p_year);
                user.setPhone(phone);
                user.setBranch(branch);
                user.setEmail(username);
                
               
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
       