package com.epam.spring.homework1.other;

import com.epam.spring.homework1.bean.BeanB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class OtherBeanB {


    private BeanB beanB;

    public OtherBeanB(BeanB beanB) {
        this.beanB = beanB;
        System.out.println(this.getClass().getSimpleName() + " " + beanB.getClass().getSimpleName() + " was injected through setter");
    }

/*    @Autowired
    public void setBeanB(BeanB beanB) {
        this.beanB = beanB;
    }*/
}
