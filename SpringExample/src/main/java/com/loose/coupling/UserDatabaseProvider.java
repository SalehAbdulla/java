package com.loose.coupling;

public class UserDatabaseProvider implements UserDataProvider {

    @Override
    public String getUserInfo(){
        return "Some data about the user";
    }
}
