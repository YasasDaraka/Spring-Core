package lk.ijse.spring.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Boy implements Inject{
    /*public Boy() {
        System.out.println("Boy Instantiated");
    }*/

    // Property injection
    // @Autowired
    GoodGirlAgreement girl;

    // Constructor injection
    /*@Autowired
    public Boy(GoodGirlAgreement girl) {
        this.girl = girl;
    }*/

    // Setter method injection
    /*@Autowired
    public void setGirl(GoodGirlAgreement girl) {
        this.girl = girl;
    }*/

    // Interface trough injection
    @Autowired
    @Override
    public void setInject(GoodGirlAgreement girl) {
        this.girl = girl;
    }

    public void chatWithGirl() {
        girl.chat();
    }
}
