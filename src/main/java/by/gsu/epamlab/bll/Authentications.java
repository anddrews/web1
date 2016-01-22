package by.gsu.epamlab.bll;

import by.gsu.epamlab.Constants.Roles;
import by.gsu.epamlab.model.User;


public  class Authentications {

    static IUserDao dao=new MemoryUserDao();

    public static User getUser(String login, String passw)
    {
        return dao.getUser(login,passw);
    }

    public static boolean createUser(String login, String passw, Roles role)
    {
        return dao.createUser(login, passw, role);
    }



}
