package by.gsu.epamlab.Servlets;

import by.gsu.epamlab.bll.Authentications;
import by.gsu.epamlab.model.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class Login extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String login=req.getParameter("user");
        String password=req.getParameter("password");

        User user= Authentications.getUser(login, password);

        req.getSession().setAttribute("user",user);

        resp.sendRedirect("/web1/start");
    }
}
