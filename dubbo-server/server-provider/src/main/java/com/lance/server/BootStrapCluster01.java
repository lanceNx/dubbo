package com.lance.server;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BootStrapCluster01 {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-server-cluster01.xml");
        context.start();
        System.in.read();
    }
}
