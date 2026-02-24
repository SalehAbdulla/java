package com.tight.coupling;

public class UserManager {
    private UserDatabase userDatabase = new UserDatabase();

    public String getUserDetails() {
        // Directly access database here
        return userDatabase.getUserInfo();
    }

}
