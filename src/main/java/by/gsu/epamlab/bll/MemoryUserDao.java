package by.gsu.epamlab.bll;

import by.gsu.epamlab.Constants.Roles;
import by.gsu.epamlab.model.User;

import java.util.*;


public class MemoryUserDao implements IUserDao {

    static  Map <String,User> users=new HashMap<>();
    static {
        users.put("admin", new User("admin", Roles.ADMIN, "admin"));
        users.put("user", new User("user", Roles.USER, "user"));
        users.put("guest", new User("guest", Roles.GUEST, "guest"));
    }


    public MemoryUserDao() {

    }

    @Override
    public User getUser(String login, String passw) {
        if(isUser(login)&& users.get(login).getPassword().equals(passw))
        {
            return users.get(login);
        }
        else
        {
            return new User("guest",Roles.GUEST);
        }
    }

    @Override
    public boolean createUser(String login, String passw, Roles role) {

        users.put(login,new User(login,role,passw));
        return true;
    }

    @Override
    public boolean isUser(String login) {

        return users.containsKey(login);
    }
}
