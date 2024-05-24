package lk.ijse.spring.pojo;

import org.springframework.stereotype.Component;

@Component("SamplePojo")
public class MyPojo {
    public MyPojo(){
        System.out.println("MyPojo Instantiated");
    }
}
