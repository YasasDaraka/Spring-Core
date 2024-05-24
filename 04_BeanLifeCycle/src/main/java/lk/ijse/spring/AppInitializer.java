package lk.ijse.spring;

import lk.ijse.spring.config.AppConfig;
import lk.ijse.spring.pojo.PojoPrototype;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        ctx.registerShutdownHook();

        // If not called, PojoPrototype will not invoke
        PojoPrototype protoBean1 = ctx.getBean(PojoPrototype.class);
        PojoPrototype protoBean2 = ctx.getBean(PojoPrototype.class);
        System.out.println("========= protoBean1 != protoBean2 ==========");
        System.out.println(protoBean1);
        System.out.println(protoBean2);

        // PojoPrototype does not invoke destroy();
        // because it is not in the Spring container
        System.out.println("====================");
    }
}
