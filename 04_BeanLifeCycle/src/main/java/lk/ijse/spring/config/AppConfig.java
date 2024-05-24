package lk.ijse.spring.config;

import lk.ijse.spring.pojo.NotMyClass;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk.ijse.spring.pojo")
public class AppConfig implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public AppConfig(){
        System.out.println("=======================");
        System.out.println("AppConfig Instantiated");
    }

    @Bean
    public NotMyClass beanMeth(){
        return new NotMyClass();
    }

    // =================================
    @Override
    public void setBeanName(String s) {
        System.out.println("AppConfig: BeanNameAware : "+s);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("AppConfig: BeanFactoryAware");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("AppConfig: ApplicationContextAware");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("AppConfig: InitializingBean");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("AppConfig: DisposableBean");
    }
}
