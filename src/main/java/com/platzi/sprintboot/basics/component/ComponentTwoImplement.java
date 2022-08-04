package com.platzi.sprintboot.basics.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentTwoImplement implements ComponentDependency {
    @Override
    public void greetings() {
        System.out.println("Hello world from Component Two");
    }
}
