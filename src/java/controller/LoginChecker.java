package controller;

import dto.userDTO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.LoginAuthenticator;

/*
  @author Pankaj
 */
public class LoginChecker extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("login.html");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
      


        userDTO user = new userDTO();
        user.setUsername(username);
        user.setPassword(password);
        
        
       

        LoginAuthenticator la = new LoginAuthenticator();
        boolean login = la.isLogin(user);

        if (login) {
            HttpSession session = request.getSession(true);
            session.setAttribute("username", user.getR_username());
            session.setAttribute("city", user.getCity());
            session.setAttribute("p_year", user.getP_year());
            session.setAttribute("phone", user.getPhone());
            session.setAttribute("branch", user.getBranch());
            session.setAttribute("email", user.getEmail());
            
            response.sendRedirect("profile.jsp");
        } else {
            response.sendRedirect("login.html");
        }
    }
}