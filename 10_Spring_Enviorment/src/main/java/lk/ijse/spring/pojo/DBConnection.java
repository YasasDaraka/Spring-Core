package lk.ijse.spring.pojo;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DBConnection implements InitializingBean {

    @Value("${os.name}") // property placeholder
    private String osName;

    @Value("${COMPUTERNAME}")
    private String userName;

    @Value("${db.username}")
    private String myDBName;

    @Value("${my.email}")
    private String myEmail;

    public DBConnection() {
        System.out.println("DBConnection : Instantiated");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(osName);
        System.out.println(userName);
        System.out.println(myDBName);
        System.out.println(myEmail);
    }

    /** Spring Environment < environment variable access karanna lesi wenna spring walin hadala deepu environment ekak
     *
     * Spring Environment eka hadila thiyenne
     *      1. System.getENV() <- System environment variables
     *      2. System.getProperties() <- java walin define karapu properties
     *      3. Resource Bundle <- .properties extension eken api define karapu properties ex: DBConnection
     *  ekatu wela.
     */

    /** Spring Environment eka access karanna puluwn,
     *      1.@Value annotation ekata Key eka deela value eka illagann puluwn
     *         @Value("${COMPUTERNAME}")
     *         private String userName;
     *
     *      2. Environment object eka trough
     *          @Autowired
     *          Environment environment;
     *          ===
     *          environment.getProperty("db.username");
     *          environment.getRequiredProperty("db.username");
     */
}
