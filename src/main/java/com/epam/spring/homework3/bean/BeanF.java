package com.epam.spring.homework3.bean;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class BeanF implements Bean {

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
  public String toString() {
    final StringBuilder sb = new StringBuilder("BeanF{");
    sb.append("name= '").append(name).append('\'');
    sb.append(", value= '").append(value).append('\'');
    sb.append('}');
    return sb.toString();
  }
}
