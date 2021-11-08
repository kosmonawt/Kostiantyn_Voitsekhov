package com.epam.spring.homework1.config;

import com.epam.spring.homework1.bean.BeanA;
import com.epam.spring.homework1.bean.BeanB;
import com.epam.spring.homework1.bean.BeanC;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.epam.spring.homework1.bean")
@Import(OtherConfig.class)
public class BeanConfig {

    @Bean
    public BeanA beanA() {
        return new BeanA();
    }

    @Bean
    @Qualifier("beanB")
    public BeanB beanB() {
        return new BeanB();
    }

    @Bean
    @Qualifier("beanC")
    public BeanC beanC() {
        return new BeanC();
    }


}
