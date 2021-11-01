//引入所需要的包
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

//自定义的servletLoginServlet继承的是HttpServlet（servlet的子类），需要重写doGet和doPost方法。
public class LoginServlet extends HttpServlet {
	//重写doGet方法
	public void doGet(HttpServletRequest request,
            HttpServletResponse response)
     throws ServletException,
            IOException {
		//获取表单的input输入内容，其中"username"对应表单中name值为username
		String username = request.getParameter("username");   
		String password = request.getParameter("password");      
		
		//服务器端打印信息（不显示在客户端浏览器，在console控制台可以看到）
		System.out.println("我显示在服务器端");		
		System.out.println("username=" + username);
		System.out.println("password=" + password);
		//设置编码格式
		response.setContentType("text/html;charset=GB18030");
		
		//返回html页面，在浏览器中显示
		response.getWriter().println("我显示在浏览器");
		response.getWriter().println("<html>");
		response.getWriter().println("<head>");	
		response.getWriter().println("<title>登录信息</title>");	
		response.getWriter().println("</head>");	
		response.getWriter().println("<body>");	
		response.getWriter().println("欢迎【" + username + "】用户登录成功！！！");	
		response.getWriter().println("</body>");	
		response.getWriter().println("</html>");
		}                 	
	//重写doPost方法，doPost调用deGet方法
	public void doPost(HttpServletRequest request,
            HttpServletResponse response)
    throws ServletException,
            IOException {
		doGet(request, response);               	
	}     
}