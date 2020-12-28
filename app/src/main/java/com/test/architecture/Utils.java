package com.test.architecture;

import java.util.ArrayList;

public class Utils {

    private  ArrayList<UserModel>users;
    public  Utils()    {
        users = new ArrayList<>();
        users.add(new UserModel("login1", "Password1"));
        users.add(new UserModel("login1", "Password1"));
        users.add(new UserModel("login1", "Password1"));


        }
public  ArrayList<UserModel> getUsers(){
return  users;}

    public void setUsers (ArrayList<UserModel> users){ this.users = users;}
}

