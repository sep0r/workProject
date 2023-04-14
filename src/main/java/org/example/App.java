package org.example;

import org.example.model.PC;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 */
public class App {
    public static void main(String... args) {
        Map<String, PC> map;
        System.out.println(Parser.parse("C:\\files\\1testfile.xlsx"));

        map = Parser.sortOption(Parser.listList, Parser.allNamePc);

//        map.forEach((k, v) -> System.out.println("Key: " + k + " Value: " + v));


//        Parser.listList.forEach(System.out::println);
//        Parser.allNamePc.forEach(System.out::println);
//        System.out.println("");
//        System.out.println(Parser.allNamePc.size());

    }
}
