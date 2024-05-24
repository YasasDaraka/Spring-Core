package lk.ijse.spring.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

// to demonstrate class that is not belongs to this project
// cannot add @Component annotation
public class NotMyClass implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public NotMyClass(){
        System.out.println("=======================");
        System.out.println("NotMyClass Instantiated");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("NotMyClass: BeanNameAware : "+s);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("NotMyClass: BeanFactoryAware");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("NotMyClass: ApplicationContextAware");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("NotMyClass: InitializingBean");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("NotMyClass: DisposableBean");
    }
}
