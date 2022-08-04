package com.platzi.sprintboot.basics.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentImplement implements ComponentDependency {
    @Override
    public void greetings() {
        System.out.println("Hello world from my component!");
    }
}
