package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("       <head>\n");
      out.write("              <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("              <title>Login_From_in_Govt_Office</title>\n");
      out.write("              <style>\n");
      out.write("                     .container{\n");
      out.write("                            width: 30%;\n");
      out.write("                            border: 2px solid black;\n");
      out.write("                            margin: auto;\n");
      out.write("                            padding: 20px;\n");
      out.write("                            background: linear-gradient(to left,orange 10%,skyblue 34%,orangered 50%);\n");
      out.write("                            box-shadow: -20px 20px 20px 20px #ccc;\n");
      out.write("                      \n");
      out.write("                     }\n");
      out.write("                     #Myform table tr td input{\n");
      out.write("                            font-size: 15px;\n");
      out.write("                     }\n");
      out.write("              </style>\n");
      out.write("\n");
      out.write("       </head>\n");
      out.write("       <body>\n");
      out.write("\n");
      out.write("              <div class=\"container\">\n");
      out.write("\n");
      out.write("                     <h1 style=\"text-align: center;margin: 0;\">My From</h1><hr>\n");
      out.write("\n");
      out.write("                     <form id=\"Myfrom\" action=\"RegistorServlet\" method=\"post\">\n");
      out.write("                            <table>\n");
      out.write("                                   <tr>\n");
      out.write("                                          <td> User Name:</td>\n");
      out.write("                                          <td><input type=\"text\" name=\"User_name\" placeholder=\"User Name...\"></td>\n");
      out.write("                                   </tr>\n");
      out.write("\n");
      out.write("                                   <tr>\n");
      out.write("                                          <td>User Password:</td>\n");
      out.write("                                          <td><input type=\"password\" name=\"User_password\" placeholder=\"User Password...\"></td>\n");
      out.write("                                   </tr>\n");
      out.write("\n");
      out.write("                                   <tr>\n");
      out.write("                                          <td>Enter your Email: </td>\n");
      out.write("                                          <td><input type=\"email\" name=\"User_email\" placeholder=\"Enter Your Email...\"></td>\n");
      out.write("                                   </tr>\n");
      out.write("\n");
      out.write("                                   <tr>\n");
      out.write("                                          <td>select Gender :</td>\n");
      out.write("                                          <td><input type=\"radio\" name=\"User_gender\" value=\"male\">Male&nbsp;&nbsp;<input type=\"radio\" value=\"fmale\" name=\"user_gender\">Female</td>\n");
      out.write("                                   </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                   <tr>\n");
      out.write("                                          <td>Select your Course : </td>\n");
      out.write("                                          <td>\n");
      out.write("                                                 <select name=\"User_course\">\n");
      out.write("                                                        <option value=\"java\">Java</option>\n");
      out.write("                                                        <option value=\"Php\">Php</option>\n");
      out.write("                                                        <option value=\"Python\">Python</option>\n");
      out.write("                                                        <option value=\"Android\">Android</option>\n");
      out.write("\n");
      out.write("                                                 </select>\n");
      out.write("                                          </td>\n");
      out.write("                                   </tr>\n");
      out.write("\n");
      out.write("                                   <tr>\n");
      out.write("                                          <td style=\"text-align: right\"><input type=\"checkbox\" value=\"check\" name=\"conditions\"/></td>\n");
      out.write("                                          <td>Agree Tums and Conditions</td>\n");
      out.write("                                   </tr>\n");
      out.write("\n");
      out.write("                                   <tr>\n");
      out.write("                                          <td></td>\n");
      out.write("                                          <td><button type=\"submit\">Register</button>\n");
      out.write("                                                 <button type=\"reset\">Reset</button></td>\n");
      out.write("                                   </tr>\n");
      out.write("\n");
      out.write("                            </table>       \n");
      out.write("                     </form>\n");
      out.write("              </div>\n");
      out.write("       </body>\n");
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
