package lk.ijse.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "lk.ijse.spring.pojo")
@PropertySource("classpath:application.properties") // introduce resource bundles to spring container
@PropertySource("classpath:myProperties.properties")
//@PropertySource("filepath:F:/GitHub MY/SpringTesting/10_Spring_Enviorment/src/main/resources/application.properties") // absolute path eka denawanm
public class AppConfig {
    public AppConfig() {
        System.out.println("AppConfig Instantiated");
    }

}

