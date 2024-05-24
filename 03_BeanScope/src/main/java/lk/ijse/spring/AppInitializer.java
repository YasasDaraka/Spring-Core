package lk.ijse.spring;

import lk.ijse.spring.config.AppConfig;
import lk.ijse.spring.pojo.PojoOne;
import lk.ijse.spring.pojo.PojoTwo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        ctx.registerShutdownHook();

        // Scope Singleton
        PojoOne pojoOne1 = ctx.getBean(PojoOne.class);
        PojoOne pojoOne2 = ctx.getBean(PojoOne.class);
        // Instantiate Once
        // pojoOne1 == pojoOne2
        System.out.println(pojoOne1);
        System.out.println(pojoOne2);

        // Scope prototype
        PojoTwo pojoTwo1 = ctx.getBean(PojoTwo.class);
        PojoTwo pojoTwo2 = ctx.getBean(PojoTwo.class);
        // Instantiate Twice (Twice called)
        // pojoTwo1 != pojoTwo2
        System.out.println(pojoTwo1);
        System.out.println(pojoTwo2);
    }
}
