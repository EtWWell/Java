// 加载必需的库
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
 
public class DatabaseAccess extends HttpServlet{
    
  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
            throws ServletException, IOException
  {
      // JDBC 驱动器名称和数据库的 URL
      static final String JDBC_DRIVER="com.mysql.jdbc.Driver";  
      static final String DB_URL="jdbc:mysql://localhost/TEST";

      //  数据库的用户名与密码，需要根据自己的设置
      static final String USER = "root";
      static final String PASS = "123456";

      // 设置响应内容类型
      response.setContentType("text/html");
      PrintWriter out = response.getWriter();
      String title = "数据库结果";
      String docType =
        "<!doctype html public \"-//w3c//dtd html 4.0 " +          "transitional//en\">\n";
         out.println(docType +
         "<html>\n" +
         "<head><title>" + title + "</title></head>\n" +
         "<body bgcolor=\"#f0f0f0\">\n" +
         "<h1 align=\"center\">" + title + "</h1>\n");
      try{
         // 注册 JDBC 驱动器
         Class.forName("com.mysql.jdbc.Driver");

         // 打开一个连接
         Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);

         // 执行 SQL 查询
         Statement stmt = conn.createStatement();
         String sql;
         sql = "SELECT id, first, last, age FROM Employees";
         ResultSet rs = stmt.executeQuery(sql);

         // 展开结果集数据库
         while(rs.next()){
            // 通过字段检索
            int id  = rs.getInt("id");
            int age = rs.getInt("age");
            String first = rs.getString("first");
            String last = rs.getString("last");

            // 输出数据
            out.println("ID: " + id + "<br>");
            out.println(", Age: " + age + "<br>");
            out.println(", First: " + first + "<br>");
            out.println(", Last: " + last + "<br>");
         }
         out.println("</body></html>");

         // 完成后关闭
         rs.close();
         stmt.close();
         conn.close();
      }catch(SQLException se){
         // 处理 JDBC 错误
         se.printStackTrace();
      }catch(Exception e){
         // 处理 Class.forName 错误
         e.printStackTrace();
      }finally{
         // 最后是用于关闭资源的块
         try{
            if(stmt!=null)
               stmt.close();
         }catch(SQLException se2){
         }
         try{
            if(conn!=null)
            conn.close();
         }catch(SQLException se){
            se.printStackTrace();
         }
      }
   }
} 