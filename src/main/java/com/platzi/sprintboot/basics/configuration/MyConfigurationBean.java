package com.platzi.sprintboot.basics.configuration;

import com.platzi.sprintboot.basics.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationBean {
    @Bean
    public MyBean beanOperation() {
        return new MyBean2Implement(); // Could change at any moment.
    }
    @Bean
    public MyOperation beanOperationOperation() {
        return new MyOperationImplement(); // Could change at any moment.
    }
    @Bean
    public MyBeanWithDependency beanOperationWithDependency( MyOperation myOperation ) {
        return new MyBeanWithDependencyImplement( myOperation ); // Could change at any moment.
    }
}
