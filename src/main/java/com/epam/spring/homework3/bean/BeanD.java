package com.epam.spring.homework3.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class BeanD implements Bean {

  @Value(value = "${beanD.name}")
  private String name;
  @Value(value = "${beanD.value}")
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
    System.out.println("Destroy method in BeanD");
  }

  private void init() {
    System.out.println("Init method in BeanD");
  }


  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("BeanD{");
    sb.append("name= '").append(name).append('\'');
    sb.append(", value= '").append(value).append('\'');
    sb.append('}');
    return sb.toString();
  }
}
