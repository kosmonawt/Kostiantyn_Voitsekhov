package com.epam.spring.homework3.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class BeanC implements Bean {

  @Value(value = "${beanC.name}")
  private String name;
  @Value(value = "${beanC.value}")
  private Integer value;

  @Override
  public String getName() {
    return name;
  }

  @Override
  public Integer getValue() {
    return value;
  }

  public void destroy() {
    System.out.println("Destroy method in BeanC");
  }

  private void init() {
    System.out.println("Init method in BeanC");
  }


  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("BeanC{");
    sb.append("name= '").append(name).append('\'');
    sb.append(", value= '").append(value).append('\'');
    sb.append('}');
    return sb.toString();
  }
}
