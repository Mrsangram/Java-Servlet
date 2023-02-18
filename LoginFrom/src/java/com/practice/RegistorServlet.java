package com.practice;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author Hack.sangram
 */
public class RegistorServlet extends HttpServlet{

       /**
        *
        * @param request
        * @param Reponce
        * @param responce
        * @throws ServletException
        * @throws IOException
        * 
        */
//       
//       @Override
//      protected void doGet(HttpServletRequest request, HttpServletResponse Reponce) throws ServletException, IOException{
//              
//               super.doGet(request, Reponce); //To change body of generated methods, choose Tools | Templates.
//              
//       }

       protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
              System.out.println("This is Post Method...");
              resp.setContentType("text/html");
              
              PrintWriter out = resp.getWriter();
              
              String name = req.getParameter("User_name");
              String pass = req.getParameter("User_password");
              String email = req.getParameter("User_email");
              String gender = req.getParameter("User_gender");
              String course = req.getParameter("User_course");
              String cond  = req.getParameter("conditions");
              
              
              if(cond !=null){
              if(cond.equals("Checked")){
                     out.print("<h2>Name :"+name+ "</h2>");
                     out.print("<h2>Password :"+pass+ "</h2>");
                     out.print("<h2>Email :"+email+ "</h2>");
                     out.print("<h2>Gender:"+gender+ "</h2>");
                     out.print("<h2>Course:"+course+ "</h2>");
            RequestDispatcher Rd =req.getRequestDispatcher("SuccessServlet");
            Rd.forward(req, resp);
            out.println(new Date().toString());
            
              }
              else{
                     out.println("<h2>You have not checked Terms and Condition</h2>");
                     out.println(new Date().toString());
              }}
              else{
                     out.println("<h2>You have not checked Terms and Condition</h2>");
                     
                     RequestDispatcher rd =req.getRequestDispatcher("index.html");
                     
                     rd.include(req,resp);
                     
              }
              
       }
       
}
