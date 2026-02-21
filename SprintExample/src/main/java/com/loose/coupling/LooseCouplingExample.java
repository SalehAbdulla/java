package com.loose.coupling;

public class LooseCouplingExample {
    public static void main(String[] args) {
        UserDataProvider databaseProvider = new UserDatabaseProvider();

        UserManager userManager = new UserManager(databaseProvider);

        WebServiceDataProvider webServiceDataProvider = new WebServiceDataProvider(databaseProvider);

        MongoDBProvider mongoDBProvider = new MongoDBProvider(databaseProvider);


        System.out.println(userManager.getUserDetails());
        System.out.println(webServiceDataProvider.getUserInfo());
        System.out.println(mongoDBProvider.getUserInfo());

    }
}
