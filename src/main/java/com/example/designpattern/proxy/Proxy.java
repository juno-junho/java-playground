package com.example.designpattern.proxy;

public class Proxy implements IService{

    IService iService1;

    @Override
    public String runSomething() {
        System.out.println("호출에 대한 흐름 제어가 주 목적, 반환 결과를 그대로 전달!");

        iService1 = new Service();
        return iService1.runSomething();

    }
}
