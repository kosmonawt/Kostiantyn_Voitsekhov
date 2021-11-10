package com.epam.spring.homework3.config;

import com.epam.spring.homework3.bean.BeanB;
import com.epam.spring.homework3.bean.BeanC;
import com.epam.spring.homework3.bean.BeanD;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.epam.spring.homework3.bean")
@PropertySource("classpath:application.properties")
@Import(OtherConfig.class)
public class BeanConfig {

  @Bean(destroyMethod = "destroy", initMethod = "init")
  @DependsOn("beanD")
  public BeanB beanB() {
    return new BeanB();
  }

  @Bean(destroyMethod = "destroy", initMethod = "init")
  @DependsOn("beanB")
  public BeanC beanC() {
    return new BeanC();
  }

  @Bean(destroyMethod = "destroy", initMethod = "init")
  public BeanD beanD() {
    return new BeanD();
  }

}
