package com.maksprofff.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("catBean")
public class Cat implements Pet {
    @Override
    public void say() {
        System.out.println("Meow-meow");
    }
    @Autowired
    public void testMet(Pet pet) {
        System.out.println("testA");
    }
}
