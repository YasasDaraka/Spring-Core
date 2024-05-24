package lk.ijse.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages = "lk.ijse.spring.pojo") // meeka "lk.ijse.spring" widiyata scan kaloth component register karanna oonat naa, import karanna oonat na (@Configuration eka athule @Component thiyena nisa component ekak widiyata scan karala ganno) (not recommended)
@Import({ConfigOne.class,ConfigTwo.class}) // configuration class ekakain thawath configuration class import karanna puluwn
/*@ImportResource("classpath:abc.xml")
@ImportResource("filepath:abc.xml")*/ // xml configurations import karanna use karai (paranai)
public class AppConfig {
    // spring configurations
    // * container walata awashya spring beans
    // container ekata watena widiya define karana tana  ||
    // * container ekata beans kohomada genall daaganne kiyana class eka

    public AppConfig() {
        System.out.println("AppConfig Instantiated");
    }

}

