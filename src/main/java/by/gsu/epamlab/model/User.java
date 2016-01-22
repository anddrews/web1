package by.gsu.epamlab.model;


import by.gsu.epamlab.Constants.Roles;

public class User implements Comparable<User>{
    private final String userName;
    private final Roles role;
    private final String password;

    public User(String userName, Roles role, String password) {
        this.userName = userName;
        this.role = role;
        this.password=password;
    }

    public User(String userName, Roles role) {
        this(userName,role,"");
    }

    public String getUserName() {
        return userName;
    }

    public String getRole() {
        return role.toString();
    }

    public String getPassword() {
        return password;
    }

    @Override
    public int compareTo(User o) {
        return o.getUserName().compareTo(this.userName);
    }
}
