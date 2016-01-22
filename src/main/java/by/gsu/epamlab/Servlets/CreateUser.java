package by.gsu.epamlab.Servlets;

import by.gsu.epamlab.Constants.Roles;
import by.gsu.epamlab.bll.Authentications;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by User on 21.01.2016.
 */
public class CreateUser extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/views/createUser.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String user=req.getParameter("login");
        String passwFirst=req.getParameter("passw1");
        String passwSecond=req.getParameter("passw2");

        if (passwFirst.equals(passwSecond))
        {
            Authentications.createUser(user,passwFirst, Roles.USER);
        }
        resp.sendRedirect("/web1/start");
    }
}
