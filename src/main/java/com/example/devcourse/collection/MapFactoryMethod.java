package com.example.devcourse.collection;

import java.util.HashMap;
import java.util.Map;

public class MapFactoryMethod {

    public static void main(String[] args) {

        Map<String, Integer> ageOfFriends = Map.ofEntries(Map.entry("Raphael", 20),
                Map.entry("Olivia", 24),
                Map.entry("Thibaut", 25),
                Map.entry("Junho", 26)
        );

        Map<String, Integer> ageOfFamily = Map.ofEntries(Map.entry("qrw", 20),
                Map.entry("qrf", 24),
                Map.entry("afdf", 25),
                Map.entry("Junho", 25)
        );

        Map<String, Integer> everyone = new HashMap<>(ageOfFamily);
        ageOfFriends.forEach((k, v) -> everyone.merge(k, v, (name1, name2) -> name1 + name2 + 2));
        System.out.println(everyone);

  /*      List<Integer> integers = List.of(10, 31, 9, 8, 1, 3);
        System.out.println(integers);
        integers.sort(Comparator.naturalOrder());
        System.out.println(integers);
        Stream.of("1", "2").sorted()

        for (Iterator<Integer> iterator = integers.iterator(); iterator.hasNext(); ) {
            iterator.remove();
        }
        Map.Entry.comparingByValue()
        integers.so
    }*/
    }
}
