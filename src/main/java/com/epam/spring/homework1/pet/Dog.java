package com.epam.spring.homework1.pet;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(value = 1)
public class Dog implements Animal {

    public Dog() {
        System.out.println(this.getClass().getSimpleName());
    }
}
