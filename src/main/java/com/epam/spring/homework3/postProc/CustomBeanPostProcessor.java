package com.epam.spring.homework3.postProc;

import com.epam.spring.homework3.bean.Bean;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class CustomBeanPostProcessor implements BeanPostProcessor {

  @Override
  public Object postProcessBeforeInitialization(Object bean, String beanName)
      throws BeansException {

    if (bean instanceof Bean) {
      if (((Bean) bean).getName() != null && ((Bean) bean).getValue() > 0) {
        System.out.println(beanName + " - Valid");
      } else {
        System.out.println(beanName + " - Not Valid");
      }
    }
    return bean;
  }
}
