package lk.ijse.spring.pojo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class GirlOne implements GoodGirlAgreement {
    public GirlOne() {
        System.out.println("GirlOne Instantiated");
    }

    @Override
    public void chat() {
        System.out.println("GirlOne Says : Hi");
    }
}
