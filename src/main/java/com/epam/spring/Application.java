package com.epam.spring;

import com.epam.spring.homework3.config.BeanConfig;
import java.util.Arrays;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
        BeanConfig.class);
    System.out.println("------------------");
    Arrays.stream(context.getBeanDefinitionNames())
        .forEach(s -> System.out.println(context.getBean(s)));
    System.out.println("------------------");
  }

}
