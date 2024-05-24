package lk.ijse.spring.pojo;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class TestBean implements InitializingBean {
    @Autowired
    Environment environment;

    public TestBean(){
        System.out.println("TestBean: Instantiated");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        String property = environment.getProperty("db.username");
        System.out.println(property);
        String property1 = environment.getProperty("db.userwrong"); // wrong key
        System.out.println(property1); // null
        // eet @Value("${db.userwrong}") // property placeholder eken waradi ekak illuwot output eka -> ${db.userwrong}

        String requiredProperty = environment.getRequiredProperty("db.username"); // meke key eka waradunoth exception ekak
        System.out.println(requiredProperty);
    }
}
