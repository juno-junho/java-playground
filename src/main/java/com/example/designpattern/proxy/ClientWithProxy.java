package com.example.designpattern.proxy;

public class ClientWithProxy {
    public static void main(String[] args) {

        IService proxy = new Proxy();
        System.out.println(proxy.runSomething());
    }
}
