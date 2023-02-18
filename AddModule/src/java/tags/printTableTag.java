/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tags;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

/**
 *
 * @author Hack.sangram
 */
public class printTableTag extends TagSupport {

       JspWriter out = pageContext.getOut();
       public int number;

       public void setNumber(int number) {
              this.number = number;
       }

       @Override
       public int doStartTag() throws JspException {

              for (int i = 1; i < 11; i++) {
                     try {
                            out.print(i * number);
                     } catch (Exception e) {
                            e.printStackTrace();
                     }
              }
              return SKIP_BODY;

       }

}
