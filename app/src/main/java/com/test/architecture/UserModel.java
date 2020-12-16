package com.test.architecture;

public class UserModel {
    private  String password;
    private String login;

    public UserModel(String login2, String password2) {
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
