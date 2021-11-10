package com.epam.spring.homework3.bean;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class BeanE implements Bean {

  private String name;
  private Integer value;

  @Override
  public String getName() {
    return name;
  }

  @Override
  public Integer getValue() {
    return value;
  }

  @PostConstruct
  public void postConstruct() {
    System.out.println("Post construct method in BeanE");
  }

  @PreDestroy
  public void preDestroy() {
    System.out.println("Pre destroy method in BeanE");
  }


  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("BeanE{");
    sb.append("name= '").append(name).append('\'');
    sb.append(", value= '").append(value).append('\'');
    sb.append('}');
    return sb.toString();
  }
}
