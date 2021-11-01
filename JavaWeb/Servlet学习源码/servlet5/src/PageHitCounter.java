import java.io.*;
import java.sql.Date;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class PageHitCounter extends HttpServlet{
    
  private int hitCount; 
               
  public void init() 
  { 
     // 重置点击计数器
     hitCount = 0;
  } 

  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
            throws ServletException, IOException
  {
      // 设置响应内容类型
      response.setContentType("text/html");
      // 该方法在 Servlet 被点击时执行 
      // 增加 hitCount 
      hitCount++; 
      PrintWriter out = response.getWriter();
      String title = "总点击量";
      String docType =
      "<!doctype html public \"-//w3c//dtd html 4.0 " +       "transitional//en\">\n";
      out.println(docType +
        "<html>\n" +
        "<head><title>" + title + "</title></head>\n" +
        "<body bgcolor=\"#f0f0f0\">\n" +
        "<h1 align=\"center\">" + title + "</h1>\n" +
        "<h2 align=\"center\">" + hitCount + "</h2>\n" +
        "</body></html>");

  }
  public void destroy() 
  { 
      // 这一步是可选的，但是如果需要，您可以把 hitCount 的值写入到数据库
  } 
} 