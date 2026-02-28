package car.example.constructor.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationBeanConstructorInjectionPractice.xml");

        Car myCarPractice = (Car) applicationContext.getBean("myCarPractice");
        myCarPractice.showCarInfo();
    }
}
