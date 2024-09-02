package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<Integer> numberList = List.of(10, 8, 6, 4, 2, 9, 7, 5, 3, 1);
//
//
//        System.out.println(
//                numberList.stream()
//                        .filter(num -> num % 2 == 0)
//                        .toList());
//
//        System.out.println(
//                numberList.stream()
//                        .map(num -> num * 2)
//                        .toList());
//        System.out.println(
//                numberList.stream()
//                        .sorted((a, b) -> a - b)
//                        .toList());
//
//        System.out.println(
//                numberList.stream()
//                        .reduce(0, (a, b) -> a + b));
//
//
//        numberList.stream()
//                .filter(num -> num % 2 == 0)
//                .map(num -> num * 2)
//                .sorted()
//                .forEach(num -> System.out.print(num + " "));
        try {
            FileStreamer.streamFile();
        } catch (Exception e){
            System.out.println(e);
        }
    }
}