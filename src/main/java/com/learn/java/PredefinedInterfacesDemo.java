package com.learn.java;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class PredefinedInterfacesDemo {


    public static void main(String[] args) {
        Consumer<String> consumer = (e) -> System.out.println("name is " + e);
        consumer.accept("Harsha");

        List<String> stringList = List.of("harsha", "bommadevara", "raj");
        Function<List<String>, String> function = getListStringFunction(stringList, "b");
        function.apply(stringList);

        Supplier<String> supplier = () -> "Hello From Supplier";
        supplier.get();
    }


    private static Function<List<String>, String> getListStringFunction(List<String> strings, String nameStartsWith) {
        Function<List<String>, String> function = (names -> {
            String namse = null;
            for (String name : names) {
                if (name.startsWith(nameStartsWith)) {
                    namse = name;
                    System.out.println(("name which starts with letter " + nameStartsWith.toUpperCase() + " is " + namse));
                }
            }
            return namse;
        });
        return function;
    }

}