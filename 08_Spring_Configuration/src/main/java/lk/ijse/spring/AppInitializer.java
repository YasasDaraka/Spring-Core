package lk.ijse.spring;

import lk.ijse.spring.config.AppConfig;
import lk.ijse.spring.config.ConfigOne;
import lk.ijse.spring.config.ConfigTwo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

        // ekakata wada config claa thiye nm register karanne mehema
        ctx.register(AppConfig.class);
        /*ctx.register(ConfigOne.class);
        ctx.register(ConfigTwo.class);*/

        ctx.refresh();
        ctx.registerShutdownHook();


    }
}
