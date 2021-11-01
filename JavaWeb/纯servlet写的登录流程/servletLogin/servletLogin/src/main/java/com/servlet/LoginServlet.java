package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet({ "/login" })
public class LoginServlet extends HttpServlet {
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp)
throws ServletException, IOException {
//设置请求编码格式
req.setCharacterEncoding("utf-8");
//设置响应编码格式
resp.setContentType("text/html;charset=utf-8");
//同一个请求只能创建多个HtttpSeession对象，但是这些对象都是指向相同的值
HttpSession session123 = req.getSession();
//将session绑定对象"flag"值赋值给flag
String flag = (String) session123.getAttribute("flag");
//在服务器端打印session绑定对象flag的值
System.out.println(flag);
//三目运算符，前面的判断为真则值为""，假值为"<font color='red'>用户名或密码错误！</font>"
String str=(session123.getAttribute("flag")==null?"": "<font color='red'>用户名或密码错误！</font>");
//该方法指示该session会话无效，解除所有绑定到该session上的对象
session123.invalidate();
//获取请求信息
//处理请求信息
//响应处理结果
//返回登录页面
resp.getWriter().write("<html>");
resp.getWriter().write("<head>");
resp.getWriter().write("</head>");
resp.getWriter().write("<body>");
//在HTML页面中打印str
resp.getWriter().write(str);
//resp.getWriter().write("<form action='user' method='get'>");
resp.getWriter().write("<form action='user' method='get'>");
resp.getWriter().write("用户名:<input type='text' name='uname' value=''/><br />");
resp.getWriter().write("密码:<input type='password' name='pwd' value=''/><br />");
resp.getWriter().write("<input type='hidden' name='pwd456' value='哈哈没有秘密'/><br />");
resp.getWriter().write("<input type='submit' value='登录'/>");
resp.getWriter().write("</form>");
resp.getWriter().write("</body>");
resp.getWriter().write("</html>");
}
}
