package pract10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pract10.config.BeanConfig;
import pract10.interfaces.Programmer;

public class Application {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

        Programmer jun = (Programmer) context.getBean("Junior");
        Programmer mid = (Programmer) context.getBean("Middle");
        Programmer sen = (Programmer) context.getBean("Senior");

        jun.doCoding();
        mid.doCoding();
        sen.doCoding();
    }
}