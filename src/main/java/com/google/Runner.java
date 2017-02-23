package com.google;

import com.google.services.TestService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        TestService testService = context.getBean(TestService.class);
        System.out.println(testService.helloWorld());
    }
}
