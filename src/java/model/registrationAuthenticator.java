/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import db.DBConnector;
import dto.userDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author shivam singh
 */
public class registrationAuthenticator {
             
    public boolean isRegister(userDTO user)
    {
            String r_username = user.getR_username();
            String r_password = user.getR_password();            
            String email = user.getEmail();
            String gender = user.getGender();
            String branch = user.getBranch();
            String p_year  = user.getP_year();
            String phone = user.getPhone();
            String city = user.getCity();


        try
        {
            Statement st = DBConnector.getStatement();
            String query = "Insert into registration values('"+email+"','"+r_username+"','"+gender+"','"+branch+"','"+p_year+"','"+city+"','"+r_password+"','"+phone+"')";
            int i = st.executeUpdate(query);
            if(i>0){
                return true;
            }
            else{
                return false;
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    
        return false;
    }
        
            
}
