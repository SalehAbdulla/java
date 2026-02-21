package com.loose.coupling;

public class WebServiceDataProvider implements UserDataProvider {
    private UserDataProvider userDataProvider;

    public WebServiceDataProvider(UserDataProvider userDataProvider) {
        this.userDataProvider = userDataProvider;
    }

    @Override
    public String getUserInfo() {
        return "Fetching data from WebService";
    }

}
