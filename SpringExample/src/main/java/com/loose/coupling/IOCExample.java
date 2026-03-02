package com.loose.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCExample {
    public static void main(String[] args) {

        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("ApplicationLooseCoupling.xml");

        UserManager userDbProManager = (UserManager) applicationContext.getBean("userDbProManager");
        System.out.println(userDbProManager.getUserDetails());

        UserManager webProManager = (UserManager) applicationContext.getBean("webProManager");
        System.out.println(webProManager.getUserDetails());

        UserManager mongoProManager = (UserManager) applicationContext.getBean("mongoProManager");
        System.out.println(mongoProManager.getUserDetails());
    }
}
