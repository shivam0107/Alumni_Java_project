package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <!-- Font Awesome -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\"\n");
      out.write("        integrity=\"sha512-1ycn6IcaQQ40/MKBW2W4Rhis/DbILU74C1vSrLJxCq57o941Ym01SwNsOMqvEBFlcgUa6xLiPY/NS5R+E6ztJQ==\"\n");
      out.write("        crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" href=\"alumni.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("        ");

            String username = (String)session.getAttribute("username");
            if(username == null || username.trim().equals(""))
            {
                response.sendRedirect("login.html");
            }
        
      out.write("\n");
      out.write("        \n");
      out.write("        <h1>Welcome ");
      out.print(username);
      out.write("...!</h1>\n");
      out.write("        <h2>Login Successful..</h2>\n");
      out.write("        \n");
      out.write("          <!-- header section -->\n");
      out.write("    <section class=\"header-section\">\n");
      out.write("        <div class=\"header\">\n");
      out.write("            <h2 id=\"heading\">ALUMNUS</h2>\n");
      out.write("            <div class=\"login-signUp-button\">\n");
      out.write("               \n");
      out.write("                <!-- logout button  -->\n");
      out.write("\n");
      out.write("                <button class=\"login-button\" > <a href=\"logout.jsp\">logout</a></button>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- navbar section -->\n");
      out.write("    <section class=\"navbar-section\">\n");
      out.write("        <div class=\"nav-item-section\">\n");
      out.write("            <li><a href=\"../index.html\" class=\"active\">Home</a></li>\n");
      out.write("            <li><a href=\"#\">Students</a></li>\n");
      out.write("            <li><a href=\"alumni/Alumni.html\">Alumni</a></li>\n");
      out.write("            <li><a href=\"#\">Careers</a></li>\n");
      out.write("            <li><a href=\"#\">Events & Notice</a></li>\n");
      out.write("            <li><a href=\"#\">Contact us</a></li>\n");
      out.write("            <li><a href=\"#about-us\">About us</a></li>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"search-bar\">\n");
      out.write("            <input type=\"text\" name=\"search\" id=\"search\" placeholder=\"search\">\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- hero section  -->\n");
      out.write("\n");
      out.write("    <section class=\"hero-section\">\n");
      out.write("\n");
      out.write("        <div class=\"hero-image\">\n");
      out.write("\n");
      out.write("            <img src=\"image/alumini-banner.png\" alt=\"\">\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- alumni card section -->\n");
      out.write("\n");
      out.write("    <section class=\"alumni-directory-section\">\n");
      out.write("\n");
      out.write("        <div class=\"card-scetion\">\n");
      out.write("            <div class=\"card-content\">\n");
      out.write("                <div class=\"left-part\">\n");
      out.write("                    <h2 class=\"name\"> Vk Singh </h2>\n");
      out.write("                    <p class=\"qualification\">B Tech CSE</p>\n");
      out.write("\n");
      out.write("                    <p class=\"about\">\n");
      out.write("                        Lorem ipsum dolor sit amet consectetur adipisicing elit. Quaerat libero dolor mollitia nisi\n");
      out.write("                        exercitationem earum nostrum Lorem ipsum dolor sit amet, consectetur adipisicing elit. At\n");
      out.write("                        explicabo reiciendis fuga voluptates, autem ad quasi nihil laboriosam velit asperiores\n");
      out.write("                        consequatur omnis itaque sed porro voluptate perspiciatis, sint esse aspernatur? temporibus\n");
      out.write("                        ullam nequeQuia quidem vel fugit aliquid explicabo aperiam. Possimus, culpa? Eaque, reiciendis!\n");
      out.write("\n");
      out.write("                        <br />\n");
      out.write("                        <br />\n");
      out.write("\n");
      out.write("                        Lorem ipsum dolor sit amet consectetur, adipisicing elit. Tempore, nisi?\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"right-part\">\n");
      out.write("                    <img src=\"image/jp-profile.jpg\" alt=\"\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"card-content\">\n");
      out.write("\n");
      out.write("                <div class=\"right-part\">\n");
      out.write("                    <img src=\"image/jp-profile.jpg\" alt=\"\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"left-part\">\n");
      out.write("                    <h2 class=\"name\"> Vk Singh </h2>\n");
      out.write("                    <p class=\"qualification\">B Tech CSE</p>\n");
      out.write("\n");
      out.write("                    <p class=\"about\">\n");
      out.write("                        Lorem ipsum dolor sit amet consectetur adipisicing elit. Quaerat libero dolor mollitia nisi\n");
      out.write("                        exercitationem earum nostrum Lorem ipsum dolor sit amet, consectetur adipisicing elit. At\n");
      out.write("                        explicabo reiciendis fuga voluptates, autem ad quasi nihil laboriosam velit asperiores\n");
      out.write("                        consequatur omnis itaque sed porro voluptate perspiciatis, sint esse aspernatur? temporibus\n");
      out.write("                        ullam nequeQuia quidem vel fugit aliquid explicabo aperiam. Possimus, culpa? Eaque, reiciendis!\n");
      out.write("\n");
      out.write("                        <br />\n");
      out.write("                        <br />\n");
      out.write("\n");
      out.write("                        Lorem ipsum dolor sit amet consectetur, adipisicing elit. Tempore, nisi?\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"card-content\">\n");
      out.write("                <div class=\"left-part\">\n");
      out.write("                    <h2 class=\"name\"> Vk Singh </h2>\n");
      out.write("                    <p class=\"qualification\">B Tech CSE</p>\n");
      out.write("\n");
      out.write("                    <p class=\"about\">\n");
      out.write("                        Lorem ipsum dolor sit amet consectetur adipisicing elit. Quaerat libero dolor mollitia nisi\n");
      out.write("                        exercitationem earum nostrum Lorem ipsum dolor sit amet, consectetur adipisicing elit. At\n");
      out.write("                        explicabo reiciendis fuga voluptates, autem ad quasi nihil laboriosam velit asperiores\n");
      out.write("                        consequatur omnis itaque sed porro voluptate perspiciatis, sint esse aspernatur? temporibus\n");
      out.write("                        ullam nequeQuia quidem vel fugit aliquid explicabo aperiam. Possimus, culpa? Eaque, reiciendis!\n");
      out.write("\n");
      out.write("                        <br />\n");
      out.write("                        <br />\n");
      out.write("\n");
      out.write("                        Lorem ipsum dolor sit amet consectetur, adipisicing elit. Tempore, nisi?\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"right-part\">\n");
      out.write("                    <img src=\"image/jp-profile.jpg\" alt=\"\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <!-- Alumini card -->\n");
      out.write("    <!-- <div class=\"alumini-card\">\n");
      out.write("        <div class=\"alumini-card-img\">\n");
      out.write("            <img src=\"image/jp-profile.jpg\" alt=\"\">\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <h2 class=\"alumini-card-name\">AMIT KUMAT MEMBER</h2>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"alumini-card\">\n");
      out.write("        <div class=\"alumini-card-img\">\n");
      out.write("            <img src=\"image/jp-profile.jpg\" alt=\"\">\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <h2 class=\"alumini-card-name\">AMIT KUMAT MEMBER</h2>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"alumini-card\">\n");
      out.write("        <div class=\"alumini-card-img\">\n");
      out.write("            <img src=\"image/jp-profile.jpg\" alt=\"\">\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <h2 class=\"alumini-card-name\">AMIT KUMAT MEMBER</h2>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"alumini-card\">\n");
      out.write("        <div class=\"alumini-card-img\">\n");
      out.write("            <img src=\"image/jp-profile.jpg\" alt=\"\">\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <h2 class=\"alumini-card-name\">AMIT KUMAT MEMBER</h2>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"alumini-card\">\n");
      out.write("        <div class=\"alumini-card-img\">\n");
      out.write("            <img src=\"image/jp-profile.jpg\" alt=\"\">\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <h2 class=\"alumini-card-name\">AMIT KUMAT MEMBER</h2>\n");
      out.write("    </div> -->\n");
      out.write("\n");
      out.write("    <section class=\"alum-card-section\">\n");
      out.write("        <div class=\"alum-card\">\n");
      out.write("            <div class=\"card-items\">\n");
      out.write("                <img src=\"image/jp-profile.jpg\" alt=\"\">\n");
      out.write("                <h2 class=\"name\">vk singh</h2>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"card-items\">\n");
      out.write("                <img src=\"image/jp-profile.jpg\" alt=\"\">\n");
      out.write("                <h2 class=\"name\">vk singh</h2>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"card-items\">\n");
      out.write("                <img src=\"image/jp-profile.jpg\" alt=\"\">\n");
      out.write("                <h2 class=\"name\">vk singh</h2>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"card-items\">\n");
      out.write("                <img src=\"image/jp-profile.jpg\" alt=\"\">\n");
      out.write("                <h2 class=\"name\">vk singh</h2>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"card-items\">\n");
      out.write("                <img src=\"image/jp-profile.jpg\" alt=\"\">\n");
      out.write("                <h2 class=\"name\">vk singh</h2>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("    \n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("    <!-- footer section -->\n");
      out.write("\n");
      out.write("    <footer>\n");
      out.write("   \n");
      out.write("        <div class=\"footer-section\">\n");
      out.write("            <div class=\"about-institute-section\">\n");
      out.write("                <img src=\"image/iist logo.jpg\" alt=\"\">\n");
      out.write("                <p class=\"about\">Indore Institute of Science and Technology, Indore was established 2003. IIST is recognized as a leading institute in the state of Madhya Pradesh.</p>\n");
      out.write("            </div>\n");
      out.write("    \n");
      out.write("            <div class=\"useful-links\">\n");
      out.write("                <h2>UseFul links</h2>\n");
      out.write("                <div class=\"nav-links\">\n");
      out.write("                    <li class=\"nav-items\"><a href=\"\">HOME</a></li>\n");
      out.write("                    <li class=\"nav-items\"><a href=\"\">ALUMNI</a></li>\n");
      out.write("                    <li class=\"nav-items\"><a href=\"\">NEWS&EVENT</a></li>\n");
      out.write("                    <li class=\"nav-items\"><a href=\"\">COMITEE</a></li>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("    \n");
      out.write("            <div class=\"about useful-links\">\n");
      out.write("                <h2>about</h2>\n");
      out.write("                <div class=\"nav-links\">\n");
      out.write("                    <li class=\"nav-items\"><a href=\"\">SEARCH</a></li>\n");
      out.write("                    <li class=\"nav-items\"><a href=\"\">SEARCH</a></li>\n");
      out.write("                    <li class=\"nav-items\"><a href=\"\">JOb-POST</a></li>\n");
      out.write("                    <li class=\"nav-items\"><a href=\"\">Contact</a></li>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("    \n");
      out.write("            <div class=\"social-media\">\n");
      out.write("                <div class=\"Login-dashboard\">\n");
      out.write("                    login Dashboard\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                    <div class=\"social-handels\">\n");
      out.write("                        <i class=\"fa-brands fa-facebook\" class=\"icons\"></i>\n");
      out.write("                        <i class=\"fa-brands fa-instagram\" class=\"icons\"></i>\n");
      out.write("                        <i class=\"fa-brands fa-twitter\" class=\"icons\"></i>\n");
      out.write("                        <i class=\"fa-brands fa-linkedin\" class=\"icons\"></i>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <hr/>\n");
      out.write("\n");
      out.write("    <p class=\"copyright\">© 2022 IIST Alumni / All rights reserved</p>\n");
      out.write("\n");
      out.write("    <div class=\"end\">\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
