package lk.ijse.spring.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class PojoOne implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public PojoOne(){
        System.out.println("PojoOne : Instantiated");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("PojoOne : BeanNameAware :"+s);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("PojoOne : BeanFactoryAware");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("PojoOne : ApplicationContextAware");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("PojoOne : InitializingBean");
        System.out.println("==========================");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("PojoOne : DisposableBean");
    }

    // Light Mode
    // * yamkisi bean class ekak athule, bean method ekak trough, spring bean ekak container ekata
    // introduce karala thiyenawa nm -> Light mode
    // * Inter bean dependencies satisfy nokarai (satisfy <- spring manage karapu)
    // * nikamma object denne
    // * e nisa component atule bean daanna epa (recommended inside appConfig)
    @Bean
    public PojoTwo pojoTwo() {
        // inter-bean dependencies invocation
        PojoThree pojoThree1 = pojoThree();
        System.out.println(pojoThree1);
        PojoThree pojoThree2 = pojoThree();
        System.out.println(pojoThree2);
        return new PojoTwo();
    }

    @Bean
    public PojoThree pojoThree() {
        return new PojoThree();
    }
}
