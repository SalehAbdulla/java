package car.example.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationBeanContext.xml");

        // Create an object from Spring Container
        MyBean myBean = (MyBean) context.getBean("myBean");
//        myBean.setMessage("Getting serious is essential!");
        myBean.showMessage();


    }
}
