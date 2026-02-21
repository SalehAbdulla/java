package com.loose.coupling;

public class MongoDBProvider implements UserDataProvider{
    private UserDataProvider userDataProvider;

    public MongoDBProvider(UserDataProvider userDataProvider) {
        this.userDataProvider = userDataProvider;
    }

    @Override
    public String getUserInfo() {
        return "Fetching data from Mongo DB";
    }
}
