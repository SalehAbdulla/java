package com.loose.coupling;

public class LooseCouplingExample {
    public static void main(String[] args) {

        UserDataProvider databaseProvider = new UserDatabaseProvider();
        UserManager dbUserManager = new UserManager(databaseProvider);

        System.out.println(dbUserManager.getUserDetails());

        WebServiceDataProvider webServiceDataProvider = new WebServiceDataProvider();
        UserManager webServiceDataProviderManager = new UserManager(webServiceDataProvider);

        System.out.println(webServiceDataProviderManager.getUserDetails());

        MongoDBProvider mongoDBProvider = new MongoDBProvider();
        UserManager mongoDBProviderManager = new UserManager(mongoDBProvider);

        System.out.println(mongoDBProviderManager.getUserDetails());

    }
}
