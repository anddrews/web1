package by.gsu.epamlab.bll;


import by.gsu.epamlab.Constants.Roles;
import by.gsu.epamlab.model.User;

public interface IUserDao {
    User getUser(String login, String passw);
    boolean createUser(String login, String passw, Roles role);
    boolean isUser(String login);
}
