package lk.ijse.spring.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PojoPrototype implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public PojoPrototype(){
        System.out.println("=======================");
        System.out.println("PojoPrototype: Instantiated");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("PojoPrototype: BeanNameAware : "+s);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("PojoPrototype: BeanFactoryAware");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("PojoPrototype: ApplicationContextAware");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("PojoPrototype: InitializingBean");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("PojoPrototype: DisposableBean");
    }
}
