/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tags;

import java.util.Date;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

/**
 *
 * @author Hack.sangram
 */
public class MyTagHandler extends TagSupport{

       @Override
       public int doStartTag() throws JspException {
              
              try {
                     JspWriter out = pageContext.getOut();
                     
                     out.print("<h1>This is My Custom Page in JSP</h1>");
                     out.print("<p>This is My Custom Paragraph in  JSP</p>");
                     out.print("<br>");
                     out.print(new Date().toString());
                     
              } catch (Exception e) {
              }
              return SKIP_BODY;
       }
       
       
}
