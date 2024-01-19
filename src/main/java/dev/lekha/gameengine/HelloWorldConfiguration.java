package dev.lekha.gameengine;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// As of Java 16 (the latest version at my last update), the "record" keyword is used to declare record classes.
// Record classes are a new feature introduced in Java 14 to simplify the creation of immutable data classes.
// They automatically generate methods such as equals(), hashCode(), and toString(), as well as a constructor for
// initializing the fields.
record Person(String name, int age, Address address) { };

record Address(String firstLine, String city) { };
@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "Mona";
    }

    @Bean
    public int age() {
        return 24;
    }

    @Bean
    public Person person() {
        return new Person("Don", 25, new Address("4th street", "Berlin"));
    }

    @Bean
    public Person person2MethodCall() {
        return new Person(name(), age(), address());
    }

    @Bean
    public Person person3Parameters(String name, int age, Address address2) {
        return new Person(name, age, address2);
    }

    @Bean(name = "address2")
    public Address address() {
        return new Address("3rd Avenue", "Paris");
    }

}
