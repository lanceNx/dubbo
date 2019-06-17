package com.lance.client;

import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.alibaba.dubbo.rpc.Protocol;
import com.lance.server.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProtocolDemo {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext
                        ("dubbo-client.xml");


        UserService userService = (UserService) context.getBean("userService");

        Protocol protocol = ExtensionLoader.
                getExtensionLoader(Protocol.class).
                getExtension("myProtocol");

        System.out.println(protocol.getDefaultPort());
    }

}
