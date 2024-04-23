package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        CodeDemostrator c = (CodeDemostrator) context.getBean("codedemostratorJava");
        System.out.println(c);
        System.out.println(c.generateCode());
    }
}