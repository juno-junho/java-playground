package com.example.designpattern.adapter;

public class ClientWithAdapter {

    public static void main(String[] args) {
        AdapterServiceA adapterServiceA = new AdapterServiceA();
        AdapterServiceB adapterServiceB = new AdapterServiceB();

        adapterServiceA.runService();
        adapterServiceB.runService();

        ServiceA serviceA = new ServiceA();
        ServiceB serviceB = new ServiceB();

        serviceA.runServiceA();
        serviceB.runServiceB();
    }
}
