package com.lance.server;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BootStrapCluster02 {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-server-cluster02.xml");
        context.start();
        System.in.read();
    }
}
