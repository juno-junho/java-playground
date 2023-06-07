package com.example.devcourse.collection;

import com.example.devcourse.iter.MyIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class MyCollection<T> {

    private List<T> list;

    public MyCollection(List<T> list) {
        this.list = List.copyOf(list);
    }

    <U> MyCollection<U> map(Function<T, U> function) {
        List<U> newList = new ArrayList<>();
        foreach(data -> newList.add(function.apply(data)));
        return new MyCollection<>(newList);
    }

     MyCollection<T> filter(Predicate<T> predicate) {
         List<T> newList = new ArrayList<>();
       /*  for (T data : list) {
             if (predicate.test(data)) {
                 newList.add(data);
             }
         }*/
         foreach(data -> {
             if (predicate.test(data)) {
                 newList.add(data);
             }
         });
         return new MyCollection<>(newList);
    }

    void foreach(Consumer<T> consumer) {
        for (T data : list) {
            consumer.accept(data);
        }
    }

    int count() {
        return list.size();
    }

    public MyIterator<T> iterator() {
        return new MyIterator<>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < list.size();
            }

            @Override
            public T next() {
                return list.get(index++);
            }
        };

    }

    
}
