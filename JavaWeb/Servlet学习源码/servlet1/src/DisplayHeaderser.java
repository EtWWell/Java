import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
 

public class DisplayHeaderser extends HttpServlet {
 

  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
            throws ServletException, IOException
  {

      response.setContentType("text/html");
 
      PrintWriter out = response.getWriter();
    String title = "HTTP Header 请求实例";
      String docType =
      "<!doctype html public \"-//w3c//dtd html 4.0 " +       "transitional//en\">\n";
      out.println(docType +
        "<html>\n" +
        "<head><title>" + title + "</title></head>\n"+
        "<body bgcolor=\"#f0f0f0\">\n" +
        "<h1 align=\"center\">" + title + "</h1>\n" +
        "<table width=\"100%\" border=\"1\" align=\"center\">\n" +
        "<tr bgcolor=\"#949494\">\n" +
        "<th>Header 名称</th><th>Header 值</th>\n"+
        "</tr>\n");
 
      Enumeration headerNames = request.getHeaderNames();
      
      while(headerNames.hasMoreElements()) {
         String paramName = (String)headerNames.nextElement();
         out.print("<tr><td>" + paramName + "</td>\n");
         String paramValue = request.getHeader(paramName);
         out.println("<td> " + paramValue + "</td></tr>\n");
      }
      out.println("</table>\n</body></html>");
  }
}