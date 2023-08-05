<%-- 
    Document   : home
    Created on : 20 Mar, 2023, 1:46:09 PM
    Author     : shivam singh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <!-- Font Awesome -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css"
        integrity="sha512-1ycn6IcaQQ40/MKBW2W4Rhis/DbILU74C1vSrLJxCq57o941Ym01SwNsOMqvEBFlcgUa6xLiPY/NS5R+E6ztJQ=="
        crossorigin="anonymous" referrerpolicy="no-referrer" />
        
        <link rel="stylesheet" href="alumni.css">
        <link rel="stylesheet" href="style.css">
    </head>
    <body class="main">
       
        <%
            String username = (String)session.getAttribute("username");
            if(username == null || username.trim().equals(""))
            {
                response.sendRedirect("login.html");
            }
        %>
        
        <h1>Welcome <%=username%>...!</h1>
        <h2>Login Successful..</h2>
        
          <!-- header section -->
    <section class="header-section">
        <div class="header">
            <h2 id="heading">ALUMNUS</h2>
            <div class="login-signUp-button">
               
                <!-- logout button  -->

                <button class="login-button" > <a href="logout.jsp">logout</a></button>
            </div>


        </div>
    </section>


    <!-- navbar section -->
    <section class="navbar-section">
        <div class="nav-item-section">
            <li><a href="../index.html" class="active">Home</a></li>
            <li><a href="#">Students</a></li>
<!--            <li><a href="alumni/Alumni.html">Alumni</a></li>-->
            <li><a href="#">Careers</a></li>
            <li><a href="#">Events & Notice</a></li>
            <li><a href="#">Contact us</a></li>
            <li><a href="#about-us">About us</a></li>
        </div>

        <div class="search-bar">
            <input type="text" name="search" id="search" placeholder="search">
        </div>
    </section>


    <!-- hero section  -->

    <section class="hero-section">

        <div class="hero-image">

            <img src="image/alumini-banner.png" alt="">
        </div>

    </section>


    <!-- alumni card section -->

    <section class="alumni-directory-section">

        <div class="card-scetion">
            <div class="card-content">
                <div class="left-part">
                    <h2 class="name"> Vk Singh </h2>
                    <p class="qualification">B Tech CSE</p>

                    <p class="about">
                        Lorem ipsum dolor sit amet consectetur adipisicing elit. Quaerat libero dolor mollitia nisi
                        exercitationem earum nostrum Lorem ipsum dolor sit amet, consectetur adipisicing elit. At
                        explicabo reiciendis fuga voluptates, autem ad quasi nihil laboriosam velit asperiores
                        consequatur omnis itaque sed porro voluptate perspiciatis, sint esse aspernatur? temporibus
                        ullam nequeQuia quidem vel fugit aliquid explicabo aperiam. Possimus, culpa? Eaque, reiciendis!

                        <br />
                        <br />

                        Lorem ipsum dolor sit amet consectetur, adipisicing elit. Tempore, nisi?
                    </p>
                </div>


                <div class="right-part">
                    <img src="image/jp-profile.jpg" alt="">
                </div>
            </div>


            <div class="card-content">

                <div class="right-part">
                    <img src="image/jp-profile.jpg" alt="">
                </div>

                <div class="left-part">
                    <h2 class="name"> Vk Singh </h2>
                    <p class="qualification">B Tech CSE</p>

                    <p class="about">
                        Lorem ipsum dolor sit amet consectetur adipisicing elit. Quaerat libero dolor mollitia nisi
                        exercitationem earum nostrum Lorem ipsum dolor sit amet, consectetur adipisicing elit. At
                        explicabo reiciendis fuga voluptates, autem ad quasi nihil laboriosam velit asperiores
                        consequatur omnis itaque sed porro voluptate perspiciatis, sint esse aspernatur? temporibus
                        ullam nequeQuia quidem vel fugit aliquid explicabo aperiam. Possimus, culpa? Eaque, reiciendis!

                        <br />
                        <br />

                        Lorem ipsum dolor sit amet consectetur, adipisicing elit. Tempore, nisi?
                    </p>
                </div>



            </div>



            <div class="card-content">
                <div class="left-part">
                    <h2 class="name"> Vk Singh </h2>
                    <p class="qualification">B Tech CSE</p>

                    <p class="about">
                        Lorem ipsum dolor sit amet consectetur adipisicing elit. Quaerat libero dolor mollitia nisi
                        exercitationem earum nostrum Lorem ipsum dolor sit amet, consectetur adipisicing elit. At
                        explicabo reiciendis fuga voluptates, autem ad quasi nihil laboriosam velit asperiores
                        consequatur omnis itaque sed porro voluptate perspiciatis, sint esse aspernatur? temporibus
                        ullam nequeQuia quidem vel fugit aliquid explicabo aperiam. Possimus, culpa? Eaque, reiciendis!

                        <br />
                        <br />

                        Lorem ipsum dolor sit amet consectetur, adipisicing elit. Tempore, nisi?
                    </p>
                </div>


                <div class="right-part">
                    <img src="image/jp-profile.jpg" alt="">
                </div>
            </div>

        </div>
    </section>

    <!-- Alumini card -->
    <!-- <div class="alumini-card">
        <div class="alumini-card-img">
            <img src="image/jp-profile.jpg" alt="">
        </div>
        
        <h2 class="alumini-card-name">AMIT KUMAT MEMBER</h2>
    </div>

    <div class="alumini-card">
        <div class="alumini-card-img">
            <img src="image/jp-profile.jpg" alt="">
        </div>
        
        <h2 class="alumini-card-name">AMIT KUMAT MEMBER</h2>
    </div>
    <div class="alumini-card">
        <div class="alumini-card-img">
            <img src="image/jp-profile.jpg" alt="">
        </div>
        
        <h2 class="alumini-card-name">AMIT KUMAT MEMBER</h2>
    </div>
    <div class="alumini-card">
        <div class="alumini-card-img">
            <img src="image/jp-profile.jpg" alt="">
        </div>
        
        <h2 class="alumini-card-name">AMIT KUMAT MEMBER</h2>
    </div>
    <div class="alumini-card">
        <div class="alumini-card-img">
            <img src="image/jp-profile.jpg" alt="">
        </div>
        
        <h2 class="alumini-card-name">AMIT KUMAT MEMBER</h2>
    </div> -->

    <section class="alum-card-section">
        <div class="alum-card">
            <div class="card-items">
                <img src="image/jp-profile.jpg" alt="">
                <h2 class="name">vk singh</h2>
            </div>

            <div class="card-items">
                <img src="image/jp-profile.jpg" alt="">
                <h2 class="name">vk singh</h2>
            </div>

            <div class="card-items">
                <img src="image/jp-profile.jpg" alt="">
                <h2 class="name">vk singh</h2>
            </div>

            <div class="card-items">
                <img src="image/jp-profile.jpg" alt="">
                <h2 class="name">vk singh</h2>
            </div>

            <div class="card-items">
                <img src="image/jp-profile.jpg" alt="">
                <h2 class="name">vk singh</h2>
            </div>
            
        </div>
    
    </section>

    

    <!-- footer section -->

    <footer>
   
        <div class="footer-section">
            <div class="about-institute-section">
                <img src="image/iist logo.jpg" alt="">
                <p class="about">Indore Institute of Science and Technology, Indore was established 2003. IIST is recognized as a leading institute in the state of Madhya Pradesh.</p>
            </div>
    
            <div class="useful-links">
                <h2>UseFul links</h2>
                <div class="nav-links">
                    <li class="nav-items"><a href="">HOME</a></li>
                    <li class="nav-items"><a href="">ALUMNI</a></li>
                    <li class="nav-items"><a href="">NEWS&EVENT</a></li>
                    <li class="nav-items"><a href="">COMITEE</a></li>
                </div>
            </div>
    
            <div class="about useful-links">
                <h2>about</h2>
                <div class="nav-links">
                    <li class="nav-items"><a href="">SEARCH</a></li>
                    <li class="nav-items"><a href="">SEARCH</a></li>
                    <li class="nav-items"><a href="">JOb-POST</a></li>
                    <li class="nav-items"><a href="">Contact</a></li>
                </div>
            </div>
    
            <div class="social-media">
                <div class="Login-dashboard">
                    login Dashboard
                </div>

                    <div class="social-handels">
                        <i class="fa-brands fa-facebook" class="icons"></i>
                        <i class="fa-brands fa-instagram" class="icons"></i>
                        <i class="fa-brands fa-twitter" class="icons"></i>
                        <i class="fa-brands fa-linkedin" class="icons"></i>

                    </div>
            </div>
        </div>
    </footer>


    <hr/>

    <p class="copyright">© 2022 IIST Alumni / All rights reserved</p>

    <div class="end">

    </div>

    </body>
</html>
