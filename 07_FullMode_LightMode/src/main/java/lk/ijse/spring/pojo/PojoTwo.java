package lk.ijse.spring.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

// not my class
public class PojoTwo implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public PojoTwo(){
        System.out.println("PojoTwo : Instantiated");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("PojoTwo : BeanNameAware :"+s);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("PojoTwo : BeanFactoryAware");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("PojoTwo : ApplicationContextAware");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("PojoTwo : InitializingBean");
        System.out.println("==========================");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("PojoTwo : DisposableBean");
    }
}
