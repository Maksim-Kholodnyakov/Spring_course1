package com.maksprofff.spring;

public class Dog implements Pet {
    @Override
    public void say() {
        System.out.println("Bow-wow");
    }
}
