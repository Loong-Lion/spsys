package com.loong.spsysspringboot.entity;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup=1,urlPatterns={"/ServletTest"})
public class ServletTest extends HttpServlet {
    private static final long serialVersionUID = 123141241255151L;
    public void service(HttpServletRequest request,HttpServletResponse response) throws IOException{

        String message; //局部变量

        message =request.getParameter("message");
        PrintWriter pw = response.getWriter();
        try
        {
            Thread.sleep(5000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        pw.write("<div><strong>Hello World</strong>!</div>"+message);
        pw.close();
    }
}
