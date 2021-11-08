package com.epam.spring.homework1.other;

import com.epam.spring.homework1.bean.BeanC;
import org.springframework.stereotype.Component;

@Component
public class OtherBeanC {

    //    @Autowired
    private final BeanC beanC;

    public OtherBeanC(BeanC beanC) {
        this.beanC = beanC;
        System.out.println(this.getClass().getSimpleName() + " " + beanC.getClass().getSimpleName() + " was injected through field");
    }
}
