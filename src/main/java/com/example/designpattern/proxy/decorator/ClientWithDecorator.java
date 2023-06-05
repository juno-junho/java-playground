package com.example.designpattern.proxy.decorator;

import com.example.designpattern.proxy.IService;

public class ClientWithDecorator {
    public static void main(String[] args) {
        IService decorator = new Decorator();
        System.out.println(decorator.runSomething());
    }
}
