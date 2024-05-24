package lk.ijse.spring.pojo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Customer {
    // * @Value("Value") <- runtime eke constructor parameter ekakata value ekak denna puluwn | bean eke properties walata values set karanna puluwn

    // * @Value ekata daanna puluwn deewal
    //     Primitive Data types
    //     String Data
    //     Arrays

    // * @Autowired daala api run karanna kamati constructer eka kiyanna puluwn
    /*@Autowired
    public Customer(@Value("Kasun") String name) {
        System.out.println("Customer : Instantiated : " + name);
    }

    public Customer(@Value("Kasun,Dasun") String names[]) {
        System.out.println("Customer : Instantiated : ");
        for (String name : names) {
            System.out.println(name);
        }
    }*/


    // * @Autowired(requerd = false) dekatama daala tibboth parameters count eka wadima constructor eka run karanne
    // * same parameter count eka tibboth spring kamati ekak ganne
    @Autowired(required = false)
    public Customer(@Value("Kasun") String name) {
        System.out.println("Customer : Instantiated : " + name);
    }

    @Autowired(required = false)
    public Customer(@Value("Kasun,Dasun,Kamal") String names[], @Value("31,32,33") int ages[]) {
        System.out.println("Customer : Instantiated : ");
        for (String name : names) {
            System.out.println(name);
        }

        for(int age: ages){
            System.out.println(age);
        }
    }
}
