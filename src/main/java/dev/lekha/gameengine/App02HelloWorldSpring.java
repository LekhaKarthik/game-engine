package dev.lekha.gameengine;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App02HelloWorldSpring {

    public static void main (String[] args) {

        // Launch a Spring Context
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        // Retrieve beans managed by Spring
        System.out.println(context.getBean("name"));

        System.out.println(context.getBean("age"));

        System.out.println(context.getBean("person"));

        // You can use the name of the bean to retrieve it
        System.out.println(context.getBean("address2"));

        // You can use the type of the bean to retrieve it
        System.out.println(context.getBean(Address.class));

        System.out.println(context.getBean("person2MethodCall"));

        System.out.println(context.getBean("person3Parameters"));

        System.out.println("Bean count: " + context.getBeanDefinitionCount());

        System.out.println("Beans: " + Arrays.toString(context.getBeanDefinitionNames()));
    }
}
