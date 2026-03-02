package com.loose.coupling;

public class WebServiceDataProvider implements UserDataProvider {

    @Override
    public String getUserInfo() {
        return "Fetching data from WebService";
    }

}
