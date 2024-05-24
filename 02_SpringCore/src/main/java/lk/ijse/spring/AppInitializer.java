package lk.ijse.spring;

import lk.ijse.spring.config.AppConfig;
import lk.ijse.spring.pojo.BasicDataSource;
import lk.ijse.spring.pojo.MyPojo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        ctx.registerShutdownHook();

        // get beans using class name
        MyPojo bean1 = ctx.getBean(MyPojo.class);
        BasicDataSource bean2 = ctx.getBean(BasicDataSource.class);
        System.out.println(bean1);
        System.out.println(bean2);

        // get beans using Bean ID
        Object bean3 = ctx.getBean("SamplePojo");
        Object bean4 = ctx.getBean("bds");
        System.out.println(bean3);
        System.out.println(bean4);

        // bean1 = bean3
        // bean2 = bean4
        // Singleton
    }
}
