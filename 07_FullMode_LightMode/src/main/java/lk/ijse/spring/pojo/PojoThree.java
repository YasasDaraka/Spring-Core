package lk.ijse.spring.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

// not my class
public class PojoThree implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public PojoThree(){
        System.out.println("PojoThree : Instantiated");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("PojoThree : BeanNameAware :"+s);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("PojoThree : BeanFactoryAware");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("PojoThree : ApplicationContextAware");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("PojoThree : InitializingBean");
        System.out.println("==========================");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("PojoThree : DisposableBean");
    }
}
