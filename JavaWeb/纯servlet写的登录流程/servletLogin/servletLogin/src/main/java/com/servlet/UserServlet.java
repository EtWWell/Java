package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.crypto.Data;

@WebServlet({ "/user" })
public class UserServlet extends HttpServlet {
//重写了service方法，service自动匹配用get还是post方法
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp)
throws ServletException, IOException {
//设置请求编码格式
req.setCharacterEncoding("utf-8");
//resp.setCharacterEncoding("utf-8");;
//设置响应编码格式
resp.setContentType("text/html;charset=utf-8");
//resp.setContentType("text/html");
//获取请求信息
String uname=req.getParameter("uname");
String pwd=req.getParameter("pwd");
String enc = req.getCharacterEncoding();
String encs = resp.getCharacterEncoding();
String url = req.getContextPath();
String head = req.getHeader("host");
//session是存储在服务器端的，这里说的session准确是HttpSession的对象，基于Map的键值对保存数据，和map的put和get方法一样，session也有setAttribute和getAttribute方法。
HttpSession session666 = req.getSession();
session666.setAttribute("uname", uname);
//在服务器端打印信息
System.out.println(uname+"---"+pwd);
//处理请求信息
if("gao奇".equals(uname)&&"123456".equals(pwd)){
resp.getWriter().write("<html>");
resp.getWriter().write("<head>");
resp.getWriter().write("</head>");
resp.getWriter().write("<body>");
resp.getWriter().write("<h3>欢迎"+uname+"登陆</h3>");
resp.getWriter().write("<h3>服务器设置对post提交数据的解码方式是："+enc+"</h3>");
resp.getWriter().write("<h3>服务器响应字符编码是："+encs+"</h3>");
resp.getWriter().write("<h3>请求上下文的url部分："+url+"</h3>");
resp.getWriter().write("<h3>请求头中名称为host的值："+head+"</h3>");
resp.getWriter().write("<h3>请求方法是："+req.getMethod()+"</h3>");
resp.getWriter().write("<h3>额外路径信息："+req.getPathInfo()+"</h3>");
resp.getWriter().write("<h3>请求协议和版本："+req.getProtocol()+"</h3>");
resp.getWriter().write("<h3>返回包含在路径后的请求："+req.getQueryString()+"</h3>");
resp.getWriter().write("<h3>返回接收到这个请求的端口号："+req.getServerPort()+"</h3>");
resp.getWriter().write("<h3>这是一个关于session的test，”uname“："+session666.getAttribute("uname")+"</h3>");
resp.getWriter().write("</body>");
resp.getWriter().write("</html>");
}else{
//登录失败
//创建Session并增加登录失败标记
//HttpSession session = req.getSession();
session666.setAttribute("flag","loginFalse");
//响应处理结果（重定向到登录页面）
//resp.sendRedirect("login");
resp.getWriter().write("登录失败，3秒后将跳转到登录界面"); 
resp.addHeader("refresh","3;url=login");

}

}
}