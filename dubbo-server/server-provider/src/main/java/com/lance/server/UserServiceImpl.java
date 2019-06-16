package com.lance.server;

public class UserServiceImpl implements UserService {
    public String sayHello(String name) {
        return "Hello, " + name;
    }

}
