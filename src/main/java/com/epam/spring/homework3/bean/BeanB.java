package com.epam.spring.homework3.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class BeanB implements Bean {

  @Value(value = "${beanB.name}")
  private String name;
  @Value(value = "${beanB.value}")
  private Integer value;


  public void destroy() {
    System.out.println("Destroy method in BeanB");
  }

  private void init() {
    System.out.println("Init method in BeanB");
  }

  private void postProcessorInitMethod() {
    System.out.println("Changed init method from custom bean post processor, Bean B");
  }

  public String getName() {
    return name;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("BeanB{");
    sb.append("name= '").append(name).append('\'');
    sb.append(", value= '").append(value).append('\'');
    sb.append('}');
    return sb.toString();
  }
}
