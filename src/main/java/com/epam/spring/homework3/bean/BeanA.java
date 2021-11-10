package com.epam.spring.homework3.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class BeanA implements InitializingBean, DisposableBean, Bean {

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

  @Override
  public void destroy() throws Exception {
    System.out.println("Destroy method in BeanA");
  }

  @Override
  public void afterPropertiesSet() throws Exception {
    System.out.println("AfterProperties set in BeanA");
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("BeanA{");
    sb.append("name= '").append(name).append('\'');
    sb.append(", value= '").append(value).append('\'');
    sb.append('}');
    return sb.toString();
  }

}
