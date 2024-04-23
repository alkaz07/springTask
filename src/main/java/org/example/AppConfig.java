package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean(name = "codedemostratorJava")
    public CodeDemostrator codedemostrator(){
        return new JavaClassDemo();
    }
    @Bean(name = "classnamegeneratorCat")
    public ClassNameGenerator classnamegenerator(){
        return new CatGenerator();
    }

}
