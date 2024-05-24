package lk.ijse.spring.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class PojoSingleton implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public PojoSingleton(){
        System.out.println("=======================");
        System.out.println("PojoSingleton: Instantiated");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("PojoSingleton: BeanNameAware : "+s);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("PojoSingleton: BeanFactoryAware");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("PojoSingleton: ApplicationContextAware");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("PojoSingleton: InitializingBean");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("PojoSingleton: DisposableBean");
    }
}
