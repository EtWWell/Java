// 文件名 SendEmail.java
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
 
public class SendEmail extends HttpServlet{
    
  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
            throws ServletException, IOException
  {
      // 收件人的电子邮件 ID
      String to = "taoqi965@gmail.com";
 
      // 发件人的电子邮件 ID
      String from = "3051938689@qq.com";
 
      // 假设您是从本地主机发送电子邮件
      String host = "localhost";
 
      // 获取系统的属性
      Properties properties = System.getProperties();
 
      // 设置邮件服务器
      properties.setProperty("mail.smtp.host", host);
 
      // 获取默认的 Session 对象
      Session session = Session.getDefaultInstance(properties);
      
   // 设置响应内容类型
      response.setContentType("text/html;charset=UTF-8");
      PrintWriter out = response.getWriter();

      try{
         // 创建一个默认的 MimeMessage 对象
         MimeMessage message = new MimeMessage(session);
         // 设置 From: header field of the header.
         message.setFrom(new InternetAddress(from));
         // 设置 To: header field of the header.
         message.addRecipient(Message.RecipientType.TO,
                                  new InternetAddress(to));
         // 设置 Subject: header field
         message.setSubject("This is the Subject Line!");
         // 现在设置实际消息
         message.setText("This is actual message,this is my first message");
         // 发送消息
         Transport.send(message);
         String title = "发送电子邮件";
         String res = "成功发送消息...";
         String docType =
         "<!doctype html public \"-//w3c//dtd html 4.0 " +          "transitional//en\">\n";
         out.println(docType +
         "<html>\n" +
         "<head><title>" + title + "</title></head>\n" +
         "<body bgcolor=\"#f0f0f0\">\n" +
         "<h1 align=\"center\">" + title + "</h1>\n" +
         "<p align=\"center\">" + res + "</p>\n" +
         "</body></html>");
      }catch (MessagingException mex) {
         mex.printStackTrace();
      }
   }
} 