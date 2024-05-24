package lk.ijse.spring.pojo;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Item implements InitializingBean {

    @Value("Test")
    public String name;

    public Item(){
        System.out.println("Item: Instantiated");
        System.out.println(name); // null <- Instantiate awastaawe populate properties wela na
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(name); // Test <- bean eka ready awastawe tamai ganna puluwn
    }
}
