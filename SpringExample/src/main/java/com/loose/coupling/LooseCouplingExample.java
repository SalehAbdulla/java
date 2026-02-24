package com.loose.coupling;

public class LooseCouplingExample {
    public static void main(String[] args) {
        UserDataProvider databaseProvider = new UserDatabaseProvider();
        UserManager dbUserManager = new UserManager(databaseProvider);

        WebServiceDataProvider webServiceDataProvider = new WebServiceDataProvider(databaseProvider);
        UserManager webServiceDataProviderManager = new UserManager(webServiceDataProvider);

        MongoDBProvider mongoDBProvider = new MongoDBProvider(databaseProvider);
        UserManager mongoDBProviderManager = new UserManager(mongoDBProvider);


        System.out.println(dbUserManager.getUserDetails());
        System.out.println(webServiceDataProviderManager.getUserDetails());
        System.out.println(mongoDBProviderManager.getUserDetails());

    }
}
