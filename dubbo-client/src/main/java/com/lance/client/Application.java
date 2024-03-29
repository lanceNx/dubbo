package com.lance.client;

import com.lance.server.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-client.xml");
        for (int i = 0; i < 10; i++) {
            UserService userService = (UserService) context.getBean("userService");
            System.out.println(userService.sayHello("Lance"));
        }

        System.in.read();
    }
}
