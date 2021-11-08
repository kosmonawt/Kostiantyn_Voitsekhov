package com.epam.spring.homework1.config;

import com.epam.spring.homework1.bean.BeanA;
import com.epam.spring.homework1.bean.BeanB;
import com.epam.spring.homework1.bean.BeanC;
import com.epam.spring.homework1.other.OtherBeanA;
import com.epam.spring.homework1.other.OtherBeanB;
import com.epam.spring.homework1.other.OtherBeanC;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Configuration
@ComponentScan("com.epam.spring.homework1.other")
@Import(PetConfig.class)
public class OtherConfig {


    @Bean
    public OtherBeanA otherBeanA(BeanA beanA) {
        return new OtherBeanA(beanA);
    }

    @Bean
//    @DependsOn(value = "beanB")
    public OtherBeanB otherBeanB(BeanB beanB) {
        return new OtherBeanB(beanB);
    }

    @Bean
//    @DependsOn(value = "beanC")
    public OtherBeanC otherBeanC(BeanC beanC) {
        return new OtherBeanC(beanC);
    }


}

