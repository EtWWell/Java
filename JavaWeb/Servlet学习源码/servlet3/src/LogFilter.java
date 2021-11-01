// 导入必需的 java 库
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

// 实现 Filter 类
public class LogFilter implements Filter  {
   public void  init(FilterConfig config) 
                         throws ServletException{
      // 获取初始化参数
      String testParam = config.getInitParameter("test-param"); 

      // 输出初始化参数
      System.out.println("Test Param: " + testParam); 
   }
   public void  doFilter(ServletRequest request, 
                 ServletResponse response,
                 FilterChain chain) 
                 throws java.io.IOException, ServletException {

      // 获取客户机的 IP 地址   
      String ipAddress = request.getRemoteAddr();

      // 记录 IP 地址和当前时间戳
      System.out.println("IP "+ ipAddress + ", Time "
                                       + new Date().toString());

      // 把请求传回过滤链
      chain.doFilter(request,response);
   }
   public void destroy( ){
      /* 在 Filter 实例被 Web 容器从服务移除之前调用 */
   }
}