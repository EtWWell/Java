// 导入必需的 java 库
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
 
// 扩展 HttpServlet 类
public class ReadCookies extends HttpServlet {
 
  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
            throws ServletException, IOException
  {
      Cookie cookie = null;
    Cookie[] cookies = null;
      // 获取与该域相关的 Cookies 的数组
      cookies = request.getCookies();
      
    // 设置响应内容类型
      response.setContentType("text/html;charset = UTF-8");
 
      PrintWriter out = response.getWriter();
      String title = "Reading Cookies Example";
      String docType =
      "<!doctype html public \"-//w3c//dtd html 4.0 " +       "transitional//en\">\n";
      out.println(docType +
                "<html>\n" +
                "<head><title>" + title + "</title></head>\n" +
                "<body bgcolor=\"#f0f0f0\">\n" );
      if( cookies != null ){
         out.println("<h2>查找 Cookies 名称和值</h2>");
         for (int i = 0; i < cookies.length; i++){             cookie = cookies[i];             out.print("名称：" + cookie.getName( ) + "，");             out.print("值：" + cookie.getValue( )+" <br/>");
         }
      }else{
          out.println(
            "<h2 >未找到 Cookies</h2>");
      }
      out.println("</body>");
      out.println("</html>");
   }
}