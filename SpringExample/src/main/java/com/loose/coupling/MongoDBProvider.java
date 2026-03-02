package com.loose.coupling;

public class MongoDBProvider implements UserDataProvider {

    @Override
    public String getUserInfo() {
        return "Fetching data from Mongo DB";
    }
}
