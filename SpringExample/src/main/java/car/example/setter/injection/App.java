package car.example.setter.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("AppSetterInjection.xml");
        Car myCarSetter = (Car) applicationContext.getBean("myCarSetter");
        System.out.println("Setter Car info: " + myCarSetter.getSpecification().toString());
    }
}
