package com.example.devcourse.iter;

import com.example.devcourse.collection.MyCollection;

import java.util.Iterator;
import java.util.List;

class Main {
    public static void main(String[] args) {
        List<String> list = List.of("A", "AFDS", "GADG", "FASD");
        Iterator<String> iterator = list.iterator();
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        if (iterator.hasNext()) {
            iterator.next();
        }

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("=============");

        MyIterator<String> iter =
                new MyCollection<String>(List.of("A", "AFDS", "GADG", "FASD"))
                .iterator();

        while (iter.hasNext()) {
            String str = iter.next();
            int len = str.length();
            if (len % 2 == 0) {
                continue;
            }
            System.out.println(str);
        }
    }


}
