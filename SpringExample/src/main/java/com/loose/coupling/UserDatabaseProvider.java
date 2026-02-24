package com.loose.coupling;

public class UserDatabaseProvider implements UserDataProvider {

    private UserDataProvider userDataProvider;

    @Override
    public String getUserInfo(){
        return "Some data about the user";
    }
}
