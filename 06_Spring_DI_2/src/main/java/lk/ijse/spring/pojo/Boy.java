package lk.ijse.spring.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Boy{
    // Property injection
    @Autowired
    @Qualifier("girlOne")
    GoodGirlAgreement girl;
    //GoodGirlAgreement girlOne;

    public void chatWithGirl() {
        girl.chat();
    }
}
