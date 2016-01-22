package by.gsu.epamlab.Servlets;

import by.gsu.epamlab.Constants.Roles;
import by.gsu.epamlab.model.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by User on 20.01.2016.
 */
public class Logout extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getSession().setAttribute("user",new User("guest", Roles.GUEST));
        req.getRequestDispatcher("/WEB-INF/views/logout.jsp").forward(req, resp);
    }
}
