package com.example.Registration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/addd")
public class RegisterUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = req.getParameter("userName");
        String password = req.getParameter("password");
        String nickName = req.getParameter("nickName");
        User user=new User(userName,password,nickName);
        //连接jdbc，数据库，开始存数据
        UserDao userDao=new UserDao();
        //操作数据
        try {
            userDao.operatingDatabase(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
