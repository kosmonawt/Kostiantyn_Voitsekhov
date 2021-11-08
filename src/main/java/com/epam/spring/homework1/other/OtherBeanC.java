package com.epam.spring.homework1.other;

import com.epam.spring.homework1.bean.BeanC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component  // <---- null
public class OtherBeanC {

    @Autowired
    private  BeanC beanC;

    public OtherBeanC() {
        System.out.println(this.getClass().getSimpleName() + " " + beanC.getClass().getSimpleName() + " was injected through field");
    }
}
