package com.epam.spring.homework1.pet;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(value = 3)
public class Cheetah implements Animal {


    public Cheetah() {
        System.out.println(this.getClass().getSimpleName());
    }
}
