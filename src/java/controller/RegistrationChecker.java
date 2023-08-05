/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dto.userDTO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.LoginAuthenticator;
import model.registrationAuthenticator;

/**
 *
 * @author shivam singh
 */
public class RegistrationChecker extends HttpServlet 
{

     public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("sign.html");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String r_username = request.getParameter("r_username");
        String r_password = request.getParameter("r_password");
        String c_password = request.getParameter("c_password");
        String city = request.getParameter("city");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String gender = request.getParameter("gender");
        String branch = request.getParameter("branch");
        String p_year = request.getParameter("p_year");

        
        

        userDTO user = new userDTO();
        user.setR_username(r_username);
        user.setR_password(r_password);
        user.setC_password(c_password);
        user.setCity(city);
        user.setEmail(email);
        user.setPhone(phone);
        user.setGender(gender);
        user.setBranch(branch);
        user.setP_year(p_year);
        

        registrationAuthenticator Ra = new registrationAuthenticator();
        boolean login = Ra.isRegister(user);

        if (login) {
            HttpSession session = request.getSession(true);
            session.setAttribute("username", r_username);
            session.setAttribute("branch" , branch);
            session.setAttribute("city" , city);
            session.setAttribute("email" , email);
            session.setAttribute("phone" , phone);
            session.setAttribute("p_year" , p_year);
            response.sendRedirect("profile.jsp");
        } else {
            response.sendRedirect("login.html");
        }
    }
}
