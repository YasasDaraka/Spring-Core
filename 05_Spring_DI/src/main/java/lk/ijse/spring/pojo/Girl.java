package lk.ijse.spring.pojo;

import org.springframework.stereotype.Component;

@Component
public class Girl implements GoodGirlAgreement {
    /*public Girl(){
        System.out.println("Girl Instantiated");
    }*/

    @Override
    public void chat(){
        System.out.println("Girl Says : Hi");
    }
}
