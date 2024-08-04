package com.project.mylogin;

public class LoginManager {

    public boolean validateUser(User user) {
        return "super_admin".equals(user.getUsername()) && "p@ssw0rd".equals(user.getPassword());
    }
}