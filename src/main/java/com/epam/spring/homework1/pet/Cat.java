package com.epam.spring.homework1.pet;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(value = 2)
public class Cat implements Animal {

    public Cat() {

        System.out.println(this.getClass().getSimpleName());
    }
}
