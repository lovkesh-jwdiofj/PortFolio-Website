<!doctype html>
<%@page import="com.pojo.*"%>
<%@page import="com.dao.*"%>
<%@page import="java.util.*"%>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Lovekesh Shete Portfolio</title>

    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/unicons.css">
    <link rel="stylesheet" href="css/owl.carousel.min.css">
    <link rel="stylesheet" href="css/owl.theme.default.min.css">

    <!-- MAIN STYLE -->
    <link rel="stylesheet" href="css/tooplate-style.css">
    
   <%String message = (String) session.getAttribute("message"); 
   	int count=0;
   	if(message!=null)
   	{
   %>
       <h4  style="text-align: center;margin-top: 80px;color: #ffc200"><%=message %></h4>
   <%}
   		 session.removeAttribute("message"); 
   	%>

  </head>
  <body>

    <!-- MENU -->
    <nav class="navbar navbar-expand-sm navbar-light">
        <div class="container">
            <a class="navbar-brand" href="index.html"><i class='uil uil-user'></i>Lovekesh shete Portfolio</a>

            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false"
                aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
                <span class="navbar-toggler-icon"></span>
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav mx-auto">
                    <li class="nav-item">
                        <a href="#about" class="nav-link"><span data-hover="About">About</span></a>
                    </li>
                    <li class="nav-item">
                        <a href="#project" class="nav-link"><span data-hover="Projects">Projects</span></a>
                    </li>
                      <li class="nav-item">
                        <a href="https://lovekeshshete.com/" class="nav-link"><span data-hover="Blogs">Blogs</span></a>
                    </li>
                   
                    <li class="nav-item">
                        <a href="#contact" class="nav-link"><span data-hover="Contact">Contact</span></a>
                    </li>
                </ul>

                <ul class="navbar-nav ml-lg-auto">
                    <div class="ml-lg-4">
                      <div class="color-mode d-lg-flex justify-content-center align-items-center">
                        <i class="color-mode-icon"></i>
                        Color mode
                      </div>
                    </div>
                </ul>
            </div>
        </div>
    </nav>

    <!-- ABOUT -->
    <section class="about full-screen d-lg-flex justify-content-center align-items-center" id="about">
        <div class="container">
            <div class="row">
                
                <div class="col-lg-7 col-md-12 col-12 d-flex align-items-center">
                    <div class="about-text">
                        <small class="small-text">Welcome to <span class="mobile-block">my portfolio website!</span></small>
                        <h1 class="animated animated-text">
                            <span class="mr-2">Hey folks, I'm</span>
                                <div class="animated-info">
                                    <span class="animated-item">JavaDeveloper</span>
                                    <span class="animated-item">Engineer</span>
                                    <span class="animated-item">Photographer</span>
                                </div>
                        </h1>

                        <p>Secure a responsible career opportunity to fully utilize my training and skills, while making a significant contribution to the success of the company.</p>
                        
                        <div class="custom-btn-group mt-4">
                        
                      <%
						Read r3 = new Read();
						ArrayList<Resume> al3 = r3.readResume();
						for(Resume p3 : al3)
						{
					%> 
                          <a href="resume/project/<%=p3.getFilename() %>"  class="btn custom-btn custom-btn-bg custom-btn-link" download></i> Download Resume</a>
                          
                 
                           <%} %>
                          
                          
                          
                          
                          
                          <a href="#contact"  class="btn custom-btn custom-btn-bg custom-btn-link">Hire Me</a>
                        </div>
                    </div>
                </div>

					 <%
						Read r4 = new Read();
						ArrayList<Image> al4 = r4.readImage();
						for(Image p3 : al4)
						{
					%> 
		
                <div class="col-lg-5 col-md-12 col-12">
                    <div class="about-image svg">
                        <img  src="header image/project/<%=p3.getFilename() %>" class="img-fluid" alt="svg image">
                    </div>
                </div>


				 <%} %>

            </div>
        </div>
    </section>





    <!-- PROJECTS -->
    <section class="project py-5" id="project">
        <div class="container">   
                <div class="row">
                  <div class="col-lg-11 text-center mx-auto col-12">

					
					 
						
                      <div class="col-lg-8 mx-auto">
                        <h2>Take a tour through my projects.</h2>
                      </div>

                      <div class="owl-carousel owl-theme">
					<%
						Read r2 = new Read();
						ArrayList<Project> al2 = r2.readProject();
						for(Project p1 : al2)
						{
					%>

                        <div class="item">
                          <div class="project-info">
                            <img src="images/project/<%=p1.getFilename() %>" class="img-fluid" >
                          </div>
                        </div>

                      
<%} %>
                       
                      </div>

                  </div>
                </div>
        </div>
    </section>
    
    
    
    

     <!-- FEATURES -->
    <section class="resume py-5 d-lg-flex justify-content-center align-items-center" id="resume">
        <div class="container">
            <div class="row">

                <div class="col-lg-6 col-12">
                  <h2 class="mb-4">Experiences</h2>
                  
                    <div class="timeline">
                 <%
            Read r1 = new Read();
            ArrayList<Experience> al1 = r1.readExp();
            for(Experience e1 : al1)
            {
            %> 

                        <div class="timeline-wrapper">
                             <div class="timeline-yr">
                                  <span><%=e1.getYear() %> </span>
                             </div>
                             <div class="timeline-info">
                                  <h3><span><%=e1.getTitle() %> </span><small> <%=e1.getSubtitle() %></small></h3>
                                  <p> <%=e1.getDescription() %> </p>
                             </div>
                        </div>
                      <%} %> 
                      
                        </div>
                </div>
                        
                        

                  
                
                    

                <div class="col-lg-6 col-12">
                  <h2 class="mb-4 mobile-mt-2">Educations</h2>
                    <div class="timeline">
				
						 <% 
                  Read r = new Read();
                  ArrayList<Education> al=r.readEdu();
                  for(Education e : al)
                  {
                  
                  %>
                  

                        <div class="timeline-wrapper">
                             <div class="timeline-yr">
                                  <span><%=e.getYear() %></span>
                             </div>
                             <div class="timeline-info">
                                  <h3><span><%=e.getTitle() %></span><small><%=e.getSubtitle() %><sup>th</sup></small></h3>
                                  <p><%=e.getDescription() %></p>
                             </div>
                        </div>

						<%} %>
						
                       
                    </div>
                </div>
                
                
                
            </div>
        </div>
    </section>

    <!-- CONTACT -->
    <section class="contact py-5" id="contact">
      <div class="container">
        <div class="row">
          
          <div class="col-lg-5 mr-lg-5 col-12">
            <div class="google-map w-100">
              
              
	<iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d30259.774065614612!2d73.92846314260456!3d18.552758378498723!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3bc2c3c3288ba495%3A0x38e833613a63004a!2sKharadi%2C%20Pune%2C%20Maharashtra!5e0!3m2!1sen!2sin!4v1664192624056!5m2!1sen!2sin" width="400" height="300" style="border:0;" allowfullscreen="" loading="lazy" referrerpolicy="no-referrer-when-downgrade"></iframe>
            </div>





            <div class="contact-info d-flex justify-content-between align-items-center py-4 px-lg-5">
                <div class="contact-info-item">
                  <h3 class="mb-3 text-white">Say hello</h3>
                  <p class="footer-text mb-0">+91-9657112375</p>
                  <p><a href="mailto:hello@company.co">lovekeshshete10@gmail.com</a></p>
                </div>

                <ul class="social-links">
                     <li><a href="#" class="uil uil-dribbble" data-toggle="tooltip" data-placement="left" title="Dribbble"></a></li>
                     <li><a href="#" class="uil uil-instagram" data-toggle="tooltip" data-placement="left" title="Instagram"></a></li>
                     <li><a href="#" class="uil uil-youtube" data-toggle="tooltip" data-placement="left" title="Youtube"></a></li>
                </ul>
            </div>
          </div>

          <div class="col-lg-6 col-12">
            <div class="contact-form">
              <h2 class="mb-4">Interested to work together? Let's talk</h2>

              <form action="SendMessage" method="post">
                <div class="row">
                  <div class="col-lg-6 col-12">
                    <input type="text" class="form-control" name="name" placeholder="Your Name" >
                  </div>

                  <div class="col-lg-6 col-12">
                    <input type="email" class="form-control" name="email" placeholder="Email" >
                  </div>

                  <div class="col-12">
                    <textarea name="message" rows="6" class="form-control"  placeholder="Message"></textarea>
                  </div>

                  <div class="ml-lg-auto col-lg-5 col-12">
                    <input type="submit"  class="form-control submit-btn" value="Send Button">
                  </div>
                </div>
              </form>
            </div>
          </div>

        </div>
      </div>
    </section>

    <!-- FOOTER -->
     <footer class="footer py-5">
          <div class="container">
               <div class="row">

                    <div class="col-lg-12 col-12">                                
                        <p class="copyright-text text-center">Copyright &copy; 2022 Lovekesh Shete Portfolio . All rights reserved</p>
                        <p class="copyright-text text-center">Designed by Lovekesh Shete</p>
                    </div>
                    
               </div>
          </div>
     </footer>

    <script src="js/jquery-3.3.1.min.js"></script>
    <script src="js/popper.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/Headroom.js"></script>
    <script src="js/jQuery.headroom.js"></script>
    <script src="js/owl.carousel.min.js"></script>
    <script src="js/smoothscroll.js"></script>
    <script src="js/custom.js"></script>

  </body>
</html>
