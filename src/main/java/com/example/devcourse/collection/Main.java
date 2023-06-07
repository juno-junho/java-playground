package com.example.devcourse.collection;

import java.util.List;

class Main {

    public static void main(String[] args) {
     /*   MyCollection<String> c1 = new MyCollection<>(List.of("A", "Caf", "bfasdf", "fsdD", "Ea"));
        MyCollection<Integer> c2 = c1.map(String::length);
        c2.foreach(System.out::println);*/
        
        // 메서드 체이닝
        int count = new MyCollection<>(List.of("A", "Caf", "bfasdf", "fsdD", "Ea"))
                .map(String::length)
                .filter(i -> i % 2 == 0)
                .count();
        System.out.println(count);
    }
}
