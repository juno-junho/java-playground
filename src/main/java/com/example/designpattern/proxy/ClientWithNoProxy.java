package com.example.designpattern.proxy;

public class ClientWithNoProxy {
    public static void main(String[] args) {
        Service service = new Service();
        System.out.println(service.runSomething());
    }
}
