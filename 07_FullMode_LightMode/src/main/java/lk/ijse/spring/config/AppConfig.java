package lk.ijse.spring.config;

import lk.ijse.spring.pojo.PojoThree;
import lk.ijse.spring.pojo.PojoTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk.ijse.spring.pojo")
public class AppConfig {
    public AppConfig() {
        System.out.println("AppConfig Instantiated");
    }

/*
    // Full mode
    // * configuration class ekak trough, bean method ekakin spring bean ekak container ekata watena widiya
    // kiyala thiyenawa nm, eeka full mode eka.
    // * Inter bean dependencies satisfy karai
    @Bean
    public PojoTwo pojoTwo() {
        // inter-bean dependencies invocation
        PojoThree pojoThree1 = pojoThree();
        System.out.println(pojoThree1);
        PojoThree pojoThree2 = pojoThree();
        System.out.println(pojoThree2);
        return new PojoTwo();
    }

    @Bean
    public PojoThree pojoThree() {
        return new PojoThree();
    }
*/
}

